
package diagnostico; 

import javax.swing.JOptionPane; //SE MANDA A TRAER PAQUETERIA 

public class Diagnostico { //CLASE

    public static void main(String[] args) { //METODO
       
        int Matriz [][],F,C,A,B; //DECLARAR VARIABLES
        
        F= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el No. Filas de la matriz"));//PEDIR AL USUARIO EL TAMAÑO DE LA MATRIZ
        C= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el No. Columnas la matriz"));//PEDIR AL USUARIO EL TAMAÑO DE LA MATRIZ
        Matriz= new int [F][C]; //DAR EL VALOR QUE EL USUARIO INGRESO A LA MATRIZ 
        A=F-1; //SE DECLARAN VALORES
        B=C-1; //SE DECLARAN VALORES
        
        for(int i=0;i<F;i++){ //SE LLENAN LAS FILAS DE LA MATRIZ
          for(int j=0;j<C;j++){ //SE LLENAN LAS COLUMNAS DE LA MATRIZ
        
           if (i==0 || i==A) { //SE INDICA LA DELIMITACION DE LAS COLUMNAS 
              Matriz [i][j] = 0; //SE INDICA EL VALOR A MOSTRAR         
           } //CIERRA IF 
             else if (j==0 || j==B){ //SE INDICA LA DELIMITACION DE LAS FILAS
              Matriz [i][j] = 0; //SE INDICA EL VALOR A MOSTRAR
             } //CIERRA ELSE IF  
               else{ //EN CASO DE QUE NO ENTRE EN LOS CONDICIONALES ANTERIORES
                Matriz [i][j] = 1;  //SE INDICA EL VALOR A MOSTRAR
               } //CIERRA ELSE
          }//CIERRA EL PARAMETRO j
        } //CIERRA EL PARAMETRO i
        System.out.println("Ejercicio 3"); //SE INDICA EL EJERCICIO QUE SE TRATO DE HACER 
        for(int i=0;i<F;i++){ //SE PASA LA MATRIZ
            for(int j=0;j<C;j++){ //SE PASA LA MATRIZ 
              System.out.print(Matriz [i][j]+ "");  //SE MANDA A IMPRIMIR LA MATRIZ 
            } //CIERRA PARENTESIS
           System.out.println("");  //SE AGREGA UN SALTO PARA QUE LE DE FORMA 
        } //CIERRA PARENTESIS
      System.out.println("");  //SE AGREGA UN SALTO PARA QUE LE DE FORMA 
    } //CIERRA PARENTESIS
} //CIERRA PARENTESIS

//JESSICA VIRIDIANA GARCIA SILVA 
