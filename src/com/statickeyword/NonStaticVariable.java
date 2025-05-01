package com.statickeyword;

public class NonStaticVariable {
    int count = 0; // Instance variable (NOT shared)

    NonStaticVariable() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }



    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.displayCount();
        obj2.displayCount(); 
        obj3.displayCount(); 
    }
}
