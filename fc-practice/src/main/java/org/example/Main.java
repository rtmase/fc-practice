package org.example;

import org.example.logic.BubbleSort;
import org.example.logic.Sort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 해당 메인클래스가 버블정렬에 강결합되어 있는 상태
        // 즉, 메인은 현재 정렬하기 하기 위한 방법을 알고 있는 상태
        // BubbleSort<String> sort = new BubbleSort<>();

        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));


    }
}
