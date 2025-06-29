package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            boolean result = super.add(element);
            return result;
        }
        return false;
    }

    @Override
    public void add(int index, T element) {
        if (!this.contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(java.util.Collection<? extends T> collection) {
        boolean modified = false;
        for (T element : collection) {
            modified |= this.add(element);
        }
        return modified;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            this.sort();
        }
        return removed;
    }

    public void sort() {
        Collections.sort(this);
    }
}
