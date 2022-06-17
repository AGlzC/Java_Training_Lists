package com.training.collections.list.linkedlist;

import com.training.collections.list.Iterator;
import com.training.collections.list.List;


public class LinkedList implements List{
    private Node head;
    private Node tail;
    private int currentSize;

    public void add(String data)
    {
        Node current = new Node(data, null, tail);
        if (head == null)
        {
            head = current;
        }
        else
        {
            tail.next = current;
        }

        tail = current;
        currentSize ++;
    }

    public void insert(int index, String data)
    {
        if (index == 0)
        {
            head = new Node(data, head, null);
            currentSize++;
        }
        else if (index > 0 && index < currentSize)
        {
            Node temporal = getNodeAt(index- 1);
            Node current = new Node(data, temporal.next, temporal);
            temporal.next.previous = current;
            temporal.next = current;
            currentSize++;
        }
    }

    public String getAt(int index)
    {
        if (index == 0 && currentSize > 0)
        {
            return head.data;
        }
        else if (index == currentSize - 1 && currentSize > 0)
        {
            return tail.data;
        }
        else if (index > 0 && index < currentSize -1)
        {
            return getNodeAt(index).data;
        }
        return "";
    }

    public void setAt(int index, String data)
    {
        if (index == 0 && currentSize > 0)
        {
            head.data = data;
        }
        else if (index == currentSize - 1)
        {
            tail.data = data;
        }
        else if (index > 0 && index < currentSize)
        {
            getNodeAt(index).data = data;
        }
    }

    public void remove(int index)
    {
        Node temporal;
        if (index >= 0 && index < currentSize)
        {
            if (index == 0)
            {
                temporal = head;
                head = temporal.next;
                head.previous = null;
                currentSize --;
            }
            else if (index == currentSize - 1)
            {
                temporal = tail;
                tail = temporal.previous;
                tail.next = null;
                currentSize --;
            }
            else if (index < currentSize - 1)
            {
                temporal = getNodeAt(index);
                temporal.previous.next = temporal.next;
                temporal.next.previous = temporal.previous;
                currentSize --;
            }
        }
    }

    public void removeAll()
    {
        head = null;
        tail = null;
        currentSize = 0;
    }

    public int size()
    {
        return currentSize;
    }

    public boolean contains(String data)
    {
        Node temporal = head;
        while (temporal != null)
        {
            if (temporal.data.equals(data))
            {
                return true;
            }
            temporal = temporal.next;
        }
        return false;
    }

    @Override
    public int indexOf(String data) {
        int index = 0;
        Node temporal = head;
        while (temporal != null)
        {
            if (temporal.data.equals(data))
            {
                return index;
            }
            temporal = temporal.next;
            index ++;
        }
        return -1;
    }

    public Iterator iterator()
    {
        return new Iterator() {
            private Node currentNode = head;

            @Override
            public String next() {
                String data = null;
                if (currentNode != null)
                {
                    data = currentNode.data;
                    currentNode = currentNode.next;
                }
                return data;
            }

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }
        };
    }

    private Node getNodeAt(int index)
    {
        Node current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current;
    }

}
