.model small
.data
ARRAY db 91h,02h,83h,0ffh,75h,06h,07h,47h,12h,90h
RES db ?
.code
.startup:
LEA BX,ARRAY
MOV cl,0Ah
MOV Al,[bx]
dec cl
inc BX
x2:
cmp al,[bx]
jnge x1
inc bx
dec cl
x1:
mov al,[bx]
jnz x2
MOV RES,al
.exit
int 3