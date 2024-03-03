package com.java.class29_ConstructorChaining;

class Parent4 {
    Parent4(){
     System.out.println("1.Non Para in Parent4");
    }
    Parent4(int a){
    System.out.println("2. Parameterised Const in Parent4");
    }
}

class Child4 extends Parent4{
      Child4(){
      this(10);
    }
    Child4(int a){
//      this();     //Uncomment this and try to think
    }
}

public class ConstructorChainingEg5 {
    public static void main(String[] args) {
//      Child4 c1 = new Child4();
      Child4 c2 = new Child4(10);   //1,

    }


}
