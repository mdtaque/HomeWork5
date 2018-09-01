package useQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseofQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("NZ");
        queue.add("JP");
        queue.add("IND");

//        for(String x : queue){
//            System.out.println(x);
//        }

//        Iterator it = queue.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
