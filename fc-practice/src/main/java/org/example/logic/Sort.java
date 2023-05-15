package org.example.logic;

import java.util.List;

public interface Sort<T extends Comparable> {
    List<T> sort(List<T> list);
}
