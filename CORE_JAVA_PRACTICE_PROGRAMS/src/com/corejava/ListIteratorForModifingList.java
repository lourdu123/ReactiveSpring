package com.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorForModifingList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            if (listIterator.next() == 4) {

                listIterator.nextIndex(); // TO GET THE INDEX OF THE ELEMENT

                listIterator.add(10);  // if you does the samething with Iterator
                                      // interface, you will get
                                      // concurrent modification exception. With
                                      // ListIterator you will not get any
                                      // error.
            }
        }

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == 4) {
                // iterator.add(10); // compilation error. NO SUCH METHOD.

                iterator.remove(); // if you does the samething with Iterator
                                   // interface, you will get
                                   // concurrent modification exception. With
                                   // ListIterator you will not get any
                                   // error.
            }
        }

        System.out.println(list);

    }

}
