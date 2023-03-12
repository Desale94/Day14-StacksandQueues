package com.bridgelabz.collection;

public interface INode<k> {

    k getkey();
    void setkey(k key);
    INode getNext();
    void setNext(INode<k> next);


}
