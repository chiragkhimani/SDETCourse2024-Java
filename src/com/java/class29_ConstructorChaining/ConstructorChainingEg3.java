package com.java.class29_ConstructorChaining;

class Parent2 {
    Parent2(){
     System.out.println("1.Non Para in Parent2");
    }
    Parent2(int a){
    System.out.println("2. Parameterised Const in Parent2");
    }
}

class Child2 extends Parent2{
      Child2(){
         this(10);  //1,4
      System.out.println("3. Non Para in Child ");
    }
    Child2(int a){
      System.out.println("4. Parameterised Const in Child2");
    }
}

public class ConstructorChainingEg3 {
    public static void main(String[] args) {
//      Child2 c1 = new Child2();           //1,4
      Child2 c2 = new Child2(10);     //

    }


}
