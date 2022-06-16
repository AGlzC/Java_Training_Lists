package com.training.collections.list.linkedlist;

import com.training.collections.list.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    void testLinkedListCreation()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        int size = linkedList.size();

        // then
        Assertions.assertEquals(0, size);
    }

    @Test
    void testLinkedListAdd1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        int size = linkedList.size();
        String data = linkedList.getAt(0);

        // then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("uno", data);
    }
    @Test
    void testLinkedListAdd2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("IV");
        linkedList.add("Lilo");
        int size = linkedList.size();
        String data = linkedList.getAt(4);

        // then
        Assertions.assertEquals(5, size);
        Assertions.assertEquals("Lilo", data);
    }

    @Test
    void testLinkedListInsert1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.insert(0,"uno");
        int size = linkedList.size();
        String data = linkedList.getAt(0);

        // then
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("uno", data);
    }

    @Test
    void testLinkedListInsert2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.insert(1,"dos");
        int size = linkedList.size();
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals(4, size);
        Assertions.assertEquals("dos", data);
    }

    @Test
    void testLinkedListInsert3()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.insert(1,"dos");
        int size = linkedList.size();
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals(5, size);
        Assertions.assertEquals("dos", data);
    }

    @Test
    void testLinkedListGetAt1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        String data = linkedList.getAt(-1);

        // then
        Assertions.assertEquals("", data);
    }

    @Test
    void testLinkedListGetAt2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        String data = linkedList.getAt(99);

        // then
        Assertions.assertEquals("", data);
    }

    @Test
    void testLinkedListGetAt3()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals("two", data);
    }

    @Test
    void testLinkedListGetAt4()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        String data = linkedList.getAt(0);

        // then
        Assertions.assertEquals("uno", data);
    }

    @Test
    void testLinkedListSetAt1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.setAt(1, "dos");
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals("dos", data);
    }

    @Test
    void testLinkedListSetAt2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.setAt(-1, "dos");
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals("two", data);
    }

    @Test
    void testLinkedListSetAt3()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.setAt(99, "dos");
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals("two", data);
    }

    @Test
    void testLinkedListSetAt4()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.setAt(0, "one");
        String data = linkedList.getAt(0);

        // then
        Assertions.assertEquals("one", data);
    }

    @Test
    void testLinkedListSetAt5()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.setAt(2, "III");
        String data = linkedList.getAt(2);

        // then
        Assertions.assertEquals("III", data);
    }

    @Test
    void testLinkedListRemove1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.remove(1);
        int size = linkedList.size();
        String data = linkedList.getAt(1);

        // then
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("tri", data);
    }

    @Test
    void testLinkedListRemove2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.add("Lilo");
        linkedList.remove(0);
        int size = linkedList.size();
        String data = linkedList.getAt(0);

        // then
        Assertions.assertEquals(4, size);
        Assertions.assertEquals("two", data);
    }

    @Test
    void testLinkedListRemove3()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.add("Lilo");
        linkedList.remove(4);
        int size = linkedList.size();

        // then
        Assertions.assertEquals(4, size);
    }

    @Test
    void testLinkedListRemoveAll()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.removeAll();
        int size = linkedList.size();

        // then
        Assertions.assertEquals(0, size);
    }

    @Test
    void testLinkedListContains1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.add("Lilo");
        boolean flag = linkedList.contains("tri");

        // then
        Assertions.assertTrue(flag);
    }

    @Test
    void testLinkedListContains2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.add("Lilo");
        boolean flag = linkedList.contains("tres");

        // then
        Assertions.assertFalse(flag);
    }

    @Test
    void testLinkedListIterator1()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.add("Lilo");
        Iterator iterator = linkedList.iterator();
        boolean flag = iterator.hasNext();

        // then
        Assertions.assertTrue(flag);
    }

    @Test
    void testLinkedListIterator2()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        Iterator iterator = linkedList.iterator();
        boolean flag = iterator.hasNext();

        // then
        Assertions.assertFalse(flag);
    }

    @Test
    void testLinkedListIterator3()
    {
        // given:
        LinkedList linkedList = new LinkedList();

        // when:
        linkedList.add("uno");
        linkedList.add("two");
        linkedList.add("tri");
        linkedList.add("for");
        linkedList.add("Lilo");
        Iterator iterator = linkedList.iterator();
        String data = iterator.next();

        // then
        Assertions.assertEquals("uno", data);
    }
}
