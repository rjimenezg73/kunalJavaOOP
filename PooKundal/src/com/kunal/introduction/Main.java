package com.kunal.introduction;

public class Main {
   public static void main(String[] args) {
      // store 5 rolls numbers
      int[] numbers = new int[5];

      // store 5 names
      String[] names = new String[5];

      // data of 5 students: {roll no, name, marks}
      int[] rno = new int[5];
      String[] name = new String[5];
      float[] marks = new float[5];

      Student[] students = new Student[5];
      /*
      Student kunal;
      kunal = new Student();*/

      Student kunal = new Student();
      System.out.println(kunal.rno);

   }
}

// Create a Class
class Student{
   int rno;
   String name;
   float marks;


}
