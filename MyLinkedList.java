package com.bridgelabz.collection;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    //public INode<k> key;

    public MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void add(INode<K> newNode){
        if (this.tail == null){
            this.tail= newNode;
        }
        if (this.head == null){
            this.head=newNode;
        }else {
            INode<K> tempNode = this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode<K> myNode) {
        if (this.head == null){
            this.head=myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        }else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    public void insert(INode<K> myNode,INode<K> newNode) {
        INode tempNode=myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode<K> pop(){
        INode<K> tepNode=this.head;
        this.head=head.getNext();
        return tepNode;
    }
    public INode<K> popLast(){
        INode<K> tempNode=head;
        while (!tempNode.getNext().equals(tail)){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }
    public INode<K> search(K key) {
        INode<K> tempNode=head;
        while (tempNode != null && tempNode.getNext() != null){
            if (tempNode.getkey().equals(key)){
                return tempNode;
            }
            tempNode=tempNode.getNext();
        }
        return null;
    }
    public void printMyNode(){
        StringBuffer myNode=new StringBuffer("My Nodes: ");
        INode tempNode=head;
        while (tempNode.getNext() != null){
            myNode.append(tempNode.getkey());
            if (!tempNode.equals(tail))myNode.append("-->");
            tempNode=tempNode.getNext();
        }
        myNode.append(tempNode.getkey());
        System.out.println(myNode);
    }

}
