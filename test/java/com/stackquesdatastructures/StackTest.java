package com.stackquesdatastructures;

import com.stackqueuesdatastructure.INode;
import com.stackqueuesdatastructure.MyNode;
import com.stackqueuesdatastructure.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void givenElementsWhenAdded_ShouldAddedToTop() {
        Stack myStack = new Stack();
        MyNode<Integer> myFirstNode= new MyNode<>(70);
        MyNode<Integer> mySecondNode= new MyNode<>(30);
        MyNode<Integer> myThirdNode= new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, peak);
    }
}
