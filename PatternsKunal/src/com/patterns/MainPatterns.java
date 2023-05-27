/**
 * Como características generales para resolver patrones de caracteres
 *
 *
 *
 */
package com.patterns;

public class MainPatterns {
   public static void main(String[] args) {
      pattern1(4);
      System.out.println();
      pattern2(5);
      System.out.println();
      pattern3(5);
      System.out.println();
      pattern4(5);
   }

   static void  pattern1(int n){
      /**
       *  Muy simple de resolver, ejemplo de patrón:
       *
       *       * * * *
       *       * * * *
       *       * * * *
       *       * * * *
       *
       * 1. El loop exterior va a definir el número de líneas del patrón
       *       El # de líneas  = # of rows
       *       Es decir, el número de veces que el loop se ejecutará
       *
       *  2. Nos indica cuantas columnas hay por cada número de fila
       *
       *  3. ¿Qué es lo que necesitas imprimir?
       *
       *  Para mayor referencia visitar: https://www.youtube.com/watch?v=lsOOs5J8ycw&t=364s
       *
       */
      for(int row = 1; row <= n; row++){
         for(int col = 1; col <= n; col++){
            System.out.print("* ");
         }
         // Cuando una línea o row ha sido impresa necesitamos agregar un salto de línea
         System.out.println();
      }
   }

   static void pattern2(int n){
      /**
       * Ejemplo para el patrón:
       *
       *       *
       *       * *
       *       * * *
       *       * * * *
       *
       * 1. El loop exterior va a definir el número de líneas del patrón
       *         El # de líneas  = # of rows
       *         Es decir, el número de veces que el loop se ejecutará
       *
       * 2. Nos indica cuantas columnas hay por cada número de fila
       *          Para éste caso el número de columnas es similar al número de filas, es decir
       *          en la fila 1 hay una columna, en la fila 2 hay dos columnas, etc.
       *
       * 3. ¿Qué es lo que necesitas imprimir?
       *
       * Para mayor referencia visitar: https://www.youtube.com/watch?v=lsOOs5J8ycw&t=364s
       *
       */

      for(int row = 1; row <= n; row++){
         // Por cada fila(row), se ejecuta col
         for(int col = 1; col <= row; col++){
            System.out.print("* ");
         }
         // Cuando una línea o row ha sido impresa necesitamos agregar un salto de línea
         System.out.println();
      }

   }

   static void pattern3(int n){
      for(int row = 1; row <= n; row++){
         for(int col = row; col <= n; col++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }

   static void pattern4(int n){
      for(int row = 0; row < 2 * n; row++){
         int totalColsInRow =  row > n ? 2*n-row : row;
         for (int col = 0; col < totalColsInRow; col++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
