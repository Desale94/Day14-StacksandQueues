package com.bridgelabz.collection;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack=new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.peak();
        myStack.printStack();

    }
}
