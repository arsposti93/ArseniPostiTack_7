package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetClassCards {
    private Set set;

    {
        set = new HashSet<>();
    }

    {
        set.add(new Cards(3));
        set.add(new Cards(4));
        set.add(new Cards(5));
        set.add(new Cards(3));
    }

    public void cardsprint() {
        for (Object element : set) {
            System.out.println(element);
        }
    }

    public Set getSet() {
        return set;
    }

    public class Cards {

        private final int NUM;

        public Cards(int NUM) {
            this.NUM = NUM;

        }

        @Override
        public String toString() {
            return "Cards{" +
                    "NUM=" + NUM +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cards)) return false;
            Cards cards = (Cards) o;
            return NUM == cards.NUM;
        }

        @Override
        public int hashCode() {
            return Objects.hash(NUM);
        }
    }

}






