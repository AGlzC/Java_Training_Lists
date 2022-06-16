package com.training.collections.list.arraylist;

import com.training.collections.list.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    void testArrayListCreation()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        int size = arrayList.size();

        // then
        Assertions.assertEquals(0, size);
    }

    @Test
    void testArrayListAdd1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        int size = arrayList.size();
        String data = arrayList.getAt(0);

        // then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("uno", data);
    }
    @Test
    void testArrayListAdd2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("IV");
        arrayList.add("Lilo");
        int size = arrayList.size();
        String data = arrayList.getAt(4);

        // then
        Assertions.assertEquals(5, size);
        Assertions.assertEquals("Lilo", data);
    }

    @Test
    void testArrayListInsert1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.insert(0,"uno");
        int size = arrayList.size();
        String data = arrayList.getAt(0);

        // then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("uno", data);
    }

    @Test
    void testArrayListInsert2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.insert(1,"dos");
        int size = arrayList.size();
        String data = arrayList.getAt(1);

        // then
        Assertions.assertEquals(4, size);
        Assertions.assertEquals("dos", data);
    }

    @Test
    void testArrayListInsert3()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("for");
        arrayList.insert(1,"dos");
        int size = arrayList.size();
        String data = arrayList.getAt(1);

        // then
        Assertions.assertEquals(5, size);
        Assertions.assertEquals("dos", data);
    }

    @Test
    void testArrayListGetAt1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        String data = arrayList.getAt(-1);

        // then
        Assertions.assertEquals("", data);
    }

    @Test
    void testArrayListGetAt2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        String data = arrayList.getAt(99);

        // then
        Assertions.assertEquals("", data);
    }

    @Test
    void testArrayListGetAt3()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        String data = arrayList.getAt(1);

        // then
        Assertions.assertEquals("two", data);
    }

    @Test
    void testArrayListSetAt1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.setAt(1, "dos");
        String data = arrayList.getAt(1);

        // then
        Assertions.assertEquals("dos", data);
    }

    @Test
    void testArrayListSetAt2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.setAt(-1, "dos");
        String data = arrayList.getAt(1);

        // then
        Assertions.assertEquals("two", data);
    }

    @Test
    void testArrayListSetAt3()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.setAt(99, "dos");
        String data = arrayList.getAt(1);

        // then
        Assertions.assertEquals("two", data);
    }

    @Test
    void testArrayListRemove1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.remove(1);
        int size = arrayList.size();
        String data = arrayList.getAt(0);

        // then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("uno", data);
    }

    @Test
    void testArrayListRemove2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("for");
        arrayList.add("Lilo");
        arrayList.remove(0);
        int size = arrayList.size();
        String data = arrayList.getAt(0);

        // then
        Assertions.assertEquals(4, size);
        Assertions.assertEquals("two", data);
    }

    @Test
    void testArrayListRemoveAll()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.removeAll();
        int size = arrayList.size();

        // then
        Assertions.assertEquals(0, size);
    }

    @Test
    void testArrayListContains1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("for");
        arrayList.add("Lilo");
        boolean flag = arrayList.contains("tri");

        // then
        Assertions.assertEquals(true, flag);
    }

    @Test
    void testArrayListContains2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("for");
        arrayList.add("Lilo");
        boolean flag = arrayList.contains("tres");

        // then
        Assertions.assertEquals(false, flag);
    }

    @Test
    void testArrayListIterator1()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("for");
        arrayList.add("Lilo");
        Iterator iterator = arrayList.iterator();
        boolean flag = iterator.hasNext();

        // then
        Assertions.assertEquals(true, flag);
    }

    @Test
    void testArrayListIterator2()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        Iterator iterator = arrayList.iterator();
        boolean flag = iterator.hasNext();

        // then
        Assertions.assertEquals(false, flag);
    }

    @Test
    void testArrayListIterator3()
    {
        // given:
        ArrayList arrayList = new ArrayList();

        // when:
        arrayList.add("uno");
        arrayList.add("two");
        arrayList.add("tri");
        arrayList.add("for");
        arrayList.add("Lilo");
        Iterator iterator = arrayList.iterator();
        String data = iterator.next();

        // then
        Assertions.assertEquals("uno", data);
    }
}