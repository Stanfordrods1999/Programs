import java.util.Scanner;
import java.util.Random;

class MyRandom {
 private static Random rnd = new Random();
 public static boolean nextBoolean() {return rnd.nextBoolean();}
 public static int nextInt() {return rnd.nextInt();}
 public static int nextInt(int n) { return rnd.nextInt(n);}
}

class Player {
 String name;
 char   type; // 'C' for comp, 'H' for human
 Scanner inp;
    
 public Player (String n, char t) { 
  name = n; type = t;
  if (type == 'H' ) inp = new Scanner(System.in);
 }
 public int nextMove(char[][] curBoard) {
  do {
   int pos;
   if ( type == 'C') {
    pos = MyRandom.nextInt(9);
   } else {
    System.out.print("Enter move-" + name + ":" );
    pos = inp.nextByte();
   }
   int col = pos % 3;
   int row = pos / 3;
   if (curBoard[row][col] == ' ') {
    System.out.println(name + ":" + pos);
    return pos;
   }
  } while (true);
 } // of nextMove()
    
 public void displayStatus(String status) {
        System.out.println(name + " " + status);
 }
}

class TicTacToeBoard {
 enum GameStatus { CAT, PXWINS, POWINS, CONT };
 Player p1, p2;
 char[][] b = new char[3][3];
 char curSym;
 String bStr;
 
public TicTacToeBoard(Player p1, Player p2) {
  this.p1 = p1; this.p2 = p2;
  for (int i = 0; i < 3; i++)
   for (int j = 0; j < 3; j++)
    b[i][j] = ' ';
 }                                                                                                                                                              
 public void play() {
  char turn = 'C';
  if (MyRandom.nextBoolean()) turn = 'H';
  System.out.println(turn=='C'?"Comp 1st":"You 1st");
  while (true) {
   int pos = ( turn == 'C') ? p1.nextMove(b) : p2.nextMove(b);
   int col = pos % 3;
   int row = pos / 3;
   curSym = b[row][col] = (turn == 'C') ? 'X' : 'O';
   display();
   GameStatus status = checkBoard();
   switch (status) {
    case PXWINS: p1.displayStatus("WINS"); 
                 p2.displayStatus("LOOSES");
                 return;
    case POWINS: p1.displayStatus("LOOSES"); 
                 p2.displayStatus("WINS");
                 return;
    case CAT:   System.out.println("DRAW"); 
                return;
    case CONT:  turn = ( turn == 'C') ? 'H' : 'C'; //toogle turn
                break;
   } //of switch
  } //of while (true)
 } // of play
    
 GameStatus checkBoard() {
  if ( rowOk(0) || rowOk(1) || rowOk(2) || //row 0,1,2
       colOk(0) || colOk(1) || colOk(2) || //col 0,1,2
       diagonalOk(0) || diagonalOk(1) )
      return (  curSym == 'X' 
                ? GameStatus.PXWINS : GameStatus.POWINS);
      for (int i = 0; i < 3; i++)
       for (int j = 0; j < 3; j++)
        if (b[i][j] == ' ') return GameStatus.CONT;
      return GameStatus.CAT;
 }
    
 boolean rowOk(int rowNo) {
  return ( ( (b[rowNo][0] == curSym) &&
             (b[rowNo][1] == curSym) &&
             (b[rowNo][2] == curSym) ) ? true : false );
 }
 
 boolean colOk(int colNo) {
  return ( ( (b[0][colNo] == curSym) &&
             (b[1][colNo] == curSym) &&
             (b[2][colNo] == curSym) )  ? true : false );
 }
 boolean diagonalOk(int diaNo) {
  int startColNo = 0; //ie [0][0], [1][1], [2][2]
  int endColNo = 2;
  if (diaNo == 1) { //ie [0][2], [1][1], [2][0]
   startColNo = 2; endColNo = 0;
  }
  return (((b[0][startColNo]  == curSym) && 
           (b[1][1]           == curSym) && 
           (b[2][endColNo]    == curSym)) ? true : false );
 }
    
 void display() { 
  System.out.println("|-|-|-|");
  System.out.println("|"+b[0][0]+"|"+b[0][1]+"|"+b[0][2]+"|");
  System.out.println("|-|-|-|");
  System.out.println("|"+b[1][0]+"|"+b[1][1]+"|"+b[1][2]+"|");
  System.out.println("|-|-|-|");
  System.out.println("|"+b[2][0]+"|"+b[2][1]+"|"+b[2][2]+"|");
  System.out.println("|-|-|-|");
 }
}
public class TicTacToe {
 public static void main(String[] args) {
  Player p1 = new Player("ENIAC", 'C'); //Comp
  Player p2 = new Player("2018A7PS0227U", 'H'); //Human
  TicTacToeBoard gttt = new TicTacToeBoard(p1, p2);
  gttt.play();
 }
}

