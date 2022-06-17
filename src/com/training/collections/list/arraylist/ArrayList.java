package com.training.collections.list.arraylist;

import com.training.collections.list.Iterator;
import com.training.collections.list.List;

public class ArrayList implements List {
    private int currentSize;
    private String[] dataArray;
    private int currentStorageSize = 4;


    public ArrayList()
    {
        dataArray = new String[currentStorageSize];
    }

    public void add(String data)
    {
        if (currentSize == currentStorageSize)
        {
            resizeArray();
        }
        dataArray[currentSize] = data;
        currentSize ++;
    }

    public void insert(int index, String data)
    {
        if (index >= 0 && index <= currentSize)
        {
            if (currentSize == currentStorageSize)
            {
                resizeArray();
            }
            for (int loop = currentSize; loop > index; loop--)
            {
                dataArray[loop] = dataArray[loop - 1];
            }
            dataArray[index] = data;
            currentSize++;
        }
    }

    public String getAt(int index)
    {
        if (index >= 0 && index < currentSize)
        {
            return dataArray[index];
        }
        return "";
    }

    public void setAt(int index, String data)
    {
        if (index >= 0 && index < currentSize)
        {
            dataArray[index] = data;
        }
    }

    public void remove(int index)
    {
        if (index >= 0 && index < currentSize)
        {
            if (index != currentSize - 1)
            {
                for (int loop = index; loop < currentSize - 1; loop++)
                {
                    dataArray[loop] = dataArray[loop + 1];
                }
            }
            currentSize --;
            dataArray[currentSize] = null;
        }
    }

    public void removeAll()
    {
        for (int loop = 0; loop < currentSize; loop++)
            dataArray[loop] = null;
        currentSize = 0;
    }

    public int size()
    {
        return currentSize;
    }

    public boolean contains(String data)
    {
        for (int loop = 0; loop < currentSize; loop++)
        {
            if (dataArray[loop].equals(data))  // to compare objets
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String data)
    {
        for (int loop = 0; loop < currentSize; loop++)
        {
            if (dataArray[loop].equals(data))  // to compare objets
            {
                return loop;
            }
        }
        return -1;
    }

    public Iterator iterator()
    {
        return new Iterator() {
            private int currentIndex = 0;

            @Override
            public String next() {
                String data = null;
                if (currentIndex < currentSize)
                {
                    data = dataArray[currentIndex++];
                }
                return data;
            }

            @Override
            public boolean hasNext() {
                return (currentIndex < currentSize);
            }
        };
    }

    private void resizeArray()
    {
        currentStorageSize <<= 1;
        String[] newArray = new String[currentStorageSize];
        System.arraycopy(dataArray, 0, newArray, 0, dataArray.length);
        dataArray = newArray;
    }
}
