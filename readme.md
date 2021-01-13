#  Projecte UF1

Alberto Bermejo
Sergi Toribio
1 DAW 

## Variables

En el nostre codi hem les següents variables:

 - int i Variable per poder detenir el programa quan li ho indiqui
   l'usuari.
 - int column Variable per al numero de columnes que tindrà la taula.
 - int row Variable per al numero de filas que tindrà la taula.
 - double tasa Variable per a indicar la taxa de contagis.
 - double nunMalalt Variable per a guardar el numero de malalts.
 - double nunMalalt2 Variable que serveix per a guardar el numero de
   malalts per a poder realitzar un calculo
 - int num Variable que serveix per a triar les opcions del menú
 - int[][] array  Per crear el array

## Bucle  while  i  menu
El programa es repeteix gràcies un bucle while, el bucle es deté quan l'usuari prem la tecla 0 en el menú d'opcions ja que s'activa el if que fa finalitzar el programa.
*while (i == 0) {*
*if (num == 0) {  
    i++;  
}*

## Opció 1: Crear taula

 
La primera opció crea la taula, aquí indiquem quantes columnes i files volem en la nostra taula.

*System.out.println("Dimensions de la taula"); row = sc.nextInt(); column = sc.nextInt(); array = new int[row][column]; String [] [] arrayMostrar = new String[row][column];*

## Opció 2: Afegir malalts

Aquesta opció és per a afegir malalts a la taula. Primer es pregunta a l'usuari en què posició de la taula vol afegir al malalt o als malalts.
Abans de tot faig un bucle  while  per a repetir aquesta acció mes d'una vegada si l'usuari vol

*System.out.println("Posicion del malalt/s");  
row = sc.nextInt();  
column = sc.nextInt();*
Perquè sigui mes "natural" per a l'usuari hem afegit la següent línia de codi:

*column--;  
row--;*

Amb això fem que quan l'usuari escrigui 1 1 es posi en la posició 0 0.
Ara el programa et demana el numero de malalts, i mitjançant uns càlculs s'aplica la taxa de contagis. Per exemple si hi ha 2 contagiats però la taxa és 1,5 el programa mostrara 5.

*System.out.println("Numero de malalts");  
nunMalalt = (sc.nextDouble());  
nunMalalt2 = Math.floor(tasa * nunMalalt);  
nunMalalt = nunMalalt + nunMalalt2;  
array[row][column] = (int) nunMalalt;*

  
Per a detenir el buclel li pregunto a l'usuari si vol afegir un altre si diu que no li incremento la variable "b" que he creat per al bucle i s'acaba el bucle while

char resposta = sc.next().charAt(0);  
if (resposta == 'n' || resposta == 'N') {  
    b++;  
}



## Opció 3: Actualitzar la taxa

Per a actualitzar la taxa primer se li pregunta a l'usuari per la taxa nova que vol afegir.

*System.out.println("Introdueix la taxa");  
tasa = sc.nextDouble();*

Después de eso hemos hecho un bucle for que pasa por cada posición del array para actualizar los valores a la nueva tasa con el siguiente calculo

*for (int a = 0; a < array.length; a++) {  
    for (int j = 0; j < array[a].length; j++) {  
        int[][] arrayOld = array;  
  array[a][j] = arrayOld[a][j] + array[a][j] * (int) tasa;*


## Opció 4: Curar malalts
Aquesta opció és per reduir el número de malalts a la taula. Primer ens diu que hem entrat a l'opció de curar malalts i ens diu les 4 opcions que tenim per realitzar aquesta funció i quina volem triar.

*System.out.println("Malalts curats");
System.out.println("Quina opció? \n 1(global(tots els malalts)) \n "
+ "2(posicio concreta) \n "
+ "3(Global(Percentatge) \n"
+ " 4(Global (Random) ");
int opcio = sc.nextInt();*

Perquè no pugui donar números negatius, ja que no podia ser possible, hem afegit el següent codi :

*if (array[a][j] < 0){
array[a][j]= 0;*

Per la part d'actualitzar tota la taula hem utilitzat un doble for, perquè així recorri totes les posicions:

*System.out.println("Número de curats");
int curats = sc.nextInt();
for (int a = 0; a < array.length; a++) {
for (int j = 0; j < array[a].length; j++) {
array[a][j] = array[a][j] - curats;*

Per generar un percentatge aleatori hem utilitzat un random :

*double random = Math.random() * 10;*

Per la part de curar malalts d'una posició completa, el programa et demana en quina fila i en quina columna està/n situat/s i el número de malalts que s'han curat. 

*System.out.println("");
System.out.println("Filas i Columna");
rows = sc.nextInt();
columns = sc.nextInt();
System.out.println("Número de curats");
int curar = sc.nextInt();
columns--;
rows--;
if (array[rows][columns] == 0)* 

En el cas que la posició en concret no tingui cap malalt el programa ens retornarà un missatge segons no tenim cap malalt en aquesta posició.

*if (array[rows][columns] == 0) {
System.out.println("No tens cap malalt en aquesta posició"); 
System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
} else {
array[rows][columns] = array[rows][columns] - curar;
System.out.println(Arrays.deepToString(array).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
}*
## Opció 5: Moure malalts

Primer se li pregunta a l'usuari que casella vol moure:

*System.out.println("Posició dels malalts que vols moure");  
  row = sc.nextInt();  
  column = sc.nextInt();  
column--;  
row--;*

Després se li indica a l'usuari que tecles ha de prémer per a moure als malalts, això ho hem fet amb un  switch:
String move = sc.next();  
*switch (move) {  
    case "W":  
    case "w":  
        array [row][column] = 0;  
  array [--row][column] =value;  
 break;*

## Opció 6: Mostra taula

Aquí només hem posat un  **System.out.println**  del  array
