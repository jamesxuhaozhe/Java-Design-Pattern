package com.haozhexu.demo;

import java.util.*;

public class main {

    private static class Data {
        private int num;

        private Data(int num) {
            this.num = num;
        }


    }

    public static void main(String[] args) {
        List<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(1));
        arrayList.add(new Data(2));
        arrayList.add(new Data(3));
        arrayList.add(new Data(4));

        List<Data> umoList = Collections.unmodifiableList(arrayList);
        umoList.get(0).num++;
    }
}
