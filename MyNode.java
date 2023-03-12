package com.bridgelabz.collection;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;

    public MyNode(K key){
        this.key=key;
        this.next=null;
    }

    @Override
    public K getkey() {
        return key;
    }

    @Override
    public void setkey(K key) {
        this.key = key;

    }

    public INode getNext(){
        return next;
    }
    public void setNext(INode<K> next) {
        this.next = (MyNode<K>)next;
    }

}