package useStack;

import java.util.Stack;

public class UseofStack {
    public static void main(String[] args) {

        Stack<String> list = new Stack<String>();
        list.push("USA");
        list.push("UK");
        list.push("BD");

//        if(list.peek().equalsIgnoreCase("BD")){
//            System.out.println(list.pop());
//        }
//
        while(!list.empty()){
            System.out.println(list.pop());
        }

    }
}
