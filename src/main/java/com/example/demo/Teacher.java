package com.example.demo;

public class Teacher {
    private int id;
    private String name;
    private static Teacher TecObj;
     private Teacher() {
         this.id=id;
         this.name=name;
     }
     public static Teacher getInstance(){
         if(TecObj==null)
         {
          TecObj=new Teacher();
         }
         return TecObj;
     }
     public String getTeacher() {

             return ("Object of Teacher Class");

     }
}



