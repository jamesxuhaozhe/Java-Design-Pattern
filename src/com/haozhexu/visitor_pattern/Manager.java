package com.haozhexu.visitor_pattern;

import java.util.Random;

public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProductNums() {
        return new Random().nextInt(10);
    }
}
