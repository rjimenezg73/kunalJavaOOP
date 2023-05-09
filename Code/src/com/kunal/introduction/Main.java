package com.kunal.introduction;

public class Main {
  public static void main(String[] args) {

    Student kunal = new Student();
    Student rahul = new Student();
    Student roberto = new Student(50, "Roberto", 66.6f);

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

    System.out.println("---------------");
    System.out.println(rahul.rno);
    System.out.println(rahul.name);
    System.out.println(rahul.marks);

    System.out.println("---------------");
    System.out.println(roberto.rno);
    System.out.println(roberto.name);
    System.out.println(roberto.marks);

  }
}

// create class
// for every single student
class Student{
  int rno;
  String name;
  float marks;

  // We need a way to add the values of the above properties object by object
  // We need one word to access every object (this)
  Student(){
    this.rno = 15;
    this.name = "Rahul";
    this.marks = 99.9f;
  }

  Student(int rno, String name, float marks){
    this.rno = rno;
    this.name = name;
    this.marks = marks;
  }

}