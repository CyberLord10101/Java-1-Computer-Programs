/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class LinkedList {
    private class Node{
        int data;
        Node next;
    public Node(int data){
        this.data = data;
        next = null;
        }
    }
    Node head;
    int curSize;
    
    //Make the linked 
    public LinkedList(){
        head = null;
        curSize = 0;
    }
    
    public void add(int data){
        Node position = null,previous = null;
        //Create a node for the data to be added
        Node toAdd = new Node(data);
        
        //See if the list is empty
        if(curSize == 0){
            head = toAdd;
        }
        else{
            position = head;
            //Add to the head of the list
            if(position.data > data){
                toAdd.next = head;
                head = toAdd;
            }
            else{
                while(position.next != null && position.data < data){
                    previous = position;
                    position = position.next;
                }
                //If linked list data is less than added data
                if(position.data >= data){
                    toAdd.next = position;
                    previous.next = toAdd;
                }
                //Add to the end of the list
                else
                    position.next = toAdd;
            }
        }
        //Update the size of the list
        curSize++;
    }
    @Override
        public String toString(){
            if(curSize == 0)
                return "";
            
            Node curNode = head;
            StringBuilder list = new StringBuilder();
            while(curNode.next != null){
                list.append(curNode.data + ",");
                curNode = curNode.next;
            }
            list.append(curNode.data);
            
            return list.toString();
        }
        public boolean isEmpty(){
            return(curSize == 0)?true:false;
        }
        public int size(){
            return curSize;
        }
        public int indexOf(int value){
            Node iter = head;
            int index = 0;
            do{
                if(value == iter.data)
                    return index;
                iter = iter.next;
                index++;
            }while(iter != null);
             return -1;
        }
        
        public boolean contains(int value){
            return indexOf(value)>= 0;
        }
        public void remove(int value){
            int index = indexOf(value);
            Node iter = head, temp = null;
            if(index >= 0){
                if(index == 0){
                    temp = head.next;
                    head = temp;
                }
                else{
                    for(int i = 1; i< index; i++)
                        iter = iter.next;
                    temp = iter.next;
                    iter.next = temp.next;
                    temp.next = null;
                    
                }
                curSize--;
            }
            
        }
}


