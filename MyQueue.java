package com.bridgelabz.collection;


    public class MyQueue {
        private final MyLinkedList myLinkedList;

        public MyQueue(){
            this.myLinkedList = new MyLinkedList();
        }
        public void enque(INode myNode){

            myLinkedList.append(myNode);
        }
        public INode peak() {
            return myLinkedList.head;
        }
        public INode deQueue(){
            return myLinkedList.pop();
        }
        public void printQueue(){
            myLinkedList.printMyNode();
        }

        public static void main(String[] args) {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyQueue myQueue = new MyQueue();
            myQueue.enque(myFirstNode);
            myQueue.enque(mySecondNode);
            myQueue.enque(myThirdNode);
            myQueue.peak();
            myQueue.printQueue();
            myQueue.deQueue();
            myQueue.printQueue();
        }
    }


