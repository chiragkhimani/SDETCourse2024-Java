package com.java.class29_ConstructorChaining;

class Parent3 {
    Parent3(){
     System.out.println("1.Non Para in Parent3");
    }
    Parent3(int a){
    System.out.println("2. Parameterised Const in Parent3");
    }
}

class Child3 extends Parent3{
      Child3(){

      System.out.println("3. Non Para in Child ");
    }
    Child3(int a){
      super(99);
    }
}

public class ConstructorChainingEg4 {
    public static void main(String[] args) {
//      Child3 c1 = new Child3();
      Child3 c2 = new Child3(10);     //2,2

    }


}
