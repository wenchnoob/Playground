package com.student.DataStructures;

import java.util.Arrays;
import java.util.Iterator;

public class Stack implements Iterable<String> {
    private String[] s;
    int index;
    
    public Stack() {
        s = new String[10];
        index = 0;
    }
    
    public void push(String string) {
        if(index >= s.length) resize (1);
        
        s[index] = string;
        index++;
    }
    
    public String pop() {
        String string = s[index-1];
        s[index-1] = null;
        index--;
        
        if(s.length/4 == index) resize(-1);
        
        return string;
    }
    
    @Override
    public Iterator<String> iterator() {
        return  new ArrayIterator();
    }
    
    private void resize(int scale) {
        if (scale == 1) s = Arrays.copyOf(s, s.length * 2);
        s = Arrays.copyOf(s, s.length/2);
    }
 
    
    private class ArrayIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public String next() {
            // TODO Auto-generated method stub
            return null;
        }
        
    }
    
    public static void main(String[] args) {
        Stack sStack = new Stack();
        
        sStack.push("apples");
        sStack.push("Oranges");
        sStack.push("Peach");
        
        System.out.println(sStack.pop());
        System.out.println(sStack.pop());
    }
}
