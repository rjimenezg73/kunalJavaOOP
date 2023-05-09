package com.kunal.introduction;

public class Main {
  public static void main(String[] args) {

    Student kunal = new Student();
    System.out.println(kunal);

    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);
    System.out.println("---------------");

    kunal.rno = 13;
    kunal.name = "Kunal Kushwaha";
    kunal.marks = 88.5f;
    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);

  }
}

// create class
// for every single student
class Student{
  int rno;
  String name;
  float marks;
}