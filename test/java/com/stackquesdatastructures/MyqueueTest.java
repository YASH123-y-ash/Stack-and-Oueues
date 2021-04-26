package com.stackquesdatastructures;

import com.stackqueuesdatastructure.INode;
import com.stackqueuesdatastructure.MyNode;
import com.stackqueuesdatastructure.MyQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyqueueTest {

    @Test
    void givenElements_WhenAdded_ShouldPass() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode peak = myQueue.peak();
        myQueue.printQueue();
        Assertions.assertEquals(peak, myFirstNode);
    }

    @Test
    public void givenelements_WhenDequeue_ShouldFirstAddedToNode(){
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode dequeue = myQueue.dequeue();
        myQueue.printQueue();
        Assertions.assertEquals(dequeue, myFirstNode);
    }
}
