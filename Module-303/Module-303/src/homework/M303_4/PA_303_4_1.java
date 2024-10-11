package homework.M303_4;

import java.util.Scanner;
import java.util.Stack;


public class PA_303_4_1 {


    private Stack<Integer> inQueue;
    private Stack<Integer> outQueue;


    public PA_303_4_1() {
        this.inQueue = new Stack<>();
        this.outQueue = new Stack<>();

    }

    public void push(int x) {

        if(outQueue.isEmpty()) {
            outQueue.push(x);
        } else {
            inQueue.push(x);
        }
    }

    public int pop() {
        int result = outQueue.pop();
        if(outQueue.isEmpty()) {
            while(!inQueue.isEmpty()) {
                outQueue.push(inQueue.pop());
            }
        }
        return result;
    }

    public int peek() {
        return outQueue.peek();

    }

    public boolean empty() {
        return inQueue.isEmpty() && outQueue.isEmpty();

    }
}

