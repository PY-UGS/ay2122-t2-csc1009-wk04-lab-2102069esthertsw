package com.esther.lab.wk04;

import java.util.Scanner;

public class StackOfIntegers {
    private int[] elements;
    private int actualSize = 0;
    private int size=0;
    private int capacity;
    public static final int MAX = 16;

    public StackOfIntegers(){
        capacity = 16;
    }

    public StackOfIntegers(int capacity){
        if (capacity<16)
            {
                this.capacity = 16;
            }
        else {
            this.capacity = capacity;
        }
        elements = new int[capacity];
    }

    public boolean empty(){
        if (actualSize ==0 ){
            return true;
        }
        else {
            return false;
        }
    }

    public int peek(){
        return elements[size-1];    //don't use size-- bc will change value of size
    }

    public void push(int value){    //like a setter
        if (actualSize < capacity){
            elements[size++] = value;
            actualSize++;
//            if (actualSize==capacity){    //don't use size++ here bc will change value of size.
//                System.out.println("Capacity reached!");
//            }
            //If above use size++ in comparison, must add size-- in a nested else loop here
        }
        else{
            System.out.println("Error: Stack is full. Use pop() before adding a new value.");
        }
    }

    public int pop() {
        int topValue = elements[size-1];
        size--;
        actualSize--;
        return topValue;
    }

    public int getSize(){
        return actualSize;
    }

    public static void main(String[] args) {
        StackOfIntegers stack1 = new StackOfIntegers(10);
        if (stack1.empty() == true) {
            for (int i = 0; i < 10; i++) {
                stack1.push(i);
            }
        }
        while (!stack1.empty())
        {
            System.out.print(stack1.pop() + " ");
        }








    }
        /*Scanner input = new Scanner(System.in);
        System.out.println("Is your stack capacity more than 16? (y/n)");
        String custom = input.next();

//        Create stack of required capacity
        if (custom== "y") {
            System.out.println("Stack capacity (integer): ");
            int capacity = input.nextInt();
            StackOfIntegers stack1 = new StackOfIntegers();
            stack1.StackOfIntegers(capacity);
        }
        else if (custom == "n") {
            StackOfIntegers stack1 = new StackOfIntegers();
        }

//        Pop/push/empty/peek/getSize

        int exitFlag = 0;
        int choice =0;
        while(exitFlag == 0){
            System.out.println("Choose a function below: ");
            System.out.println("1. Stack empty? | 2. Peek at top of stack | 3. Push");
            System.out.println("4. Pop | 5. View stack size | 6. Exit (delete stack)");
            choice = input.nextInt();
            while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6){
                System.out.println("Enter a choice from 1-6: ");
                choice = input.nextInt();
            }
            //use switch & break for diff method calling
            switch (choice){
                case 1:
                    System.out.println(stack1.empty());
                    break;
                case 2:
                    System.out.println(stack1.peek());
                    break;
                case 3:
                    System.out.println("Enter integer value to push: ");
                    stack1.push(input.nextInt());
                    break;
                case 4:
                    System.out.println(stack1.pop());
                    break;
                case 5:
                    System.out.println(stack1.getSize());
                    break;
                case 6:
                    exitFlag = 1;
            }
        }
    }*/
}
