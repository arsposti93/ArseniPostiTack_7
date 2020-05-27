package com.company;

import java.util.*;

public class QueueDeque {


  private ArrayDeque deque;


  public QueueDeque(ArrayDeque deque) {
    this.deque = deque;
  }

  public void delete(ArrayDeque deque) {
    int count = 0;
    while (!deque.isEmpty()) {
      if (deque.size() == 1) {
        deque.removeLast();
      } else if (count < 2) {
        deque.removeFirst();
        count++;
      } else {
        System.out.println(deque.getLast());
        deque.removeLast();
        count = 0;
      }
      System.out.println(deque);
    }
  }

  public void delete2 ( Deque deque) {
    while (deque.size() != 1) {
      Collections.shuffle((LinkedList) deque);
      deque.removeLast();
      System.out.println(deque);

    }
  }


}
