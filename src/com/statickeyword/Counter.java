package com.statickeyword;

public class Counter {
    static int count = 0; // Shared across all instances

    Counter() {
        count++; // Increases count every time an object is created
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }



    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.displayCount();  // Output: Count: 3
        obj2.displayCount();  // Output: Count: 3
        obj3.displayCount();  // Output: Count: 3
    }
}

/*
 * Why Does count Stay the Same Across Objects? The variable count is declared
 * as static, meaning there is only one copy of it in memory.
 * 
 * Every time a Counter object is created, count is incremented.
 * 
 * Since all instances share the same count, printing count from any instance
 * gives the same value.
 */



