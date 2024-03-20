package com.java.class39_WrapperClassandGenericsinJava;

public class bGenericEg {
    public static void main(String[] args) {

        Box<Integer> b = new Box<Integer>(10);
        System.out.println(b.getData());

        Box<String> s = new Box<>("Francis");
        System.out.println(s.getData());
    }
}

class Box <T>{

    private T data;

    Box(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
