package com.practice.linkedlist;

public class LinkedList<E> {
    Node<E> head;
    Node<E> current;
    int size = 0;

    public void add(E val){
       Node<E> temp = new Node<E>(val);
        if(head == null){
            head = temp;
        }
        if(current != null){
            current.next = temp;
        }
        current = temp;
        size++;
    }

    public void addFirst(E val){
        Node<E> temp = new Node<E>(val);
        temp.next = head;
        head = temp;
        size++;
    }

    public void add(E val, int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == size) {
            add(val);
            return;
        }

        Node<E> nn = new Node<E>(val);
        Node<E> prev = head;
        for(int i=1; i<= index-1; i++){
            prev = prev.next;
        }
        System.out.println("Prev: "+prev.val);
        nn.next = prev.next;
        prev.next = nn;
        size++;
    }

    public void remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        size--;
        if(index == 0){
            head = head.next;
            return;
        }
        Node<E> prev = head;
        for(int i=1; i<=index-1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }


    @Override
    public String toString(){
        Node<E> temp = head;
        StringBuilder sb = new StringBuilder("[");
        sb.append(temp.val);
        while(temp.next != null){
            temp = temp.next;
            sb.append(", ").append(temp.val);
        }
        sb.append("]");
        return sb.toString();
    }

    public void reverse(){
        if(size == 0){
            return;
        }
        Node<E> prev = null;
        Node<E> curr = head;
        Node<E> next = curr.next;
        curr.next  = prev;
        prev = curr;


    }

    private static class Node<E>{
        E val;
        Node<E> next;

        Node(E val){
            this.val = val;
        }
    }
}


