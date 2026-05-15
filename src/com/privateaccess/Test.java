package com.privateaccess;

public class Test {

    private void show() {
        System.out.println("Private method working inside class");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();   // allowed (same class)
    }
}