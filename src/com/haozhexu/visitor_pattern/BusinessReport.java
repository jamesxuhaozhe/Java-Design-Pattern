package com.haozhexu.visitor_pattern;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {

    private List<Staff> staff = new LinkedList<>();

    public BusinessReport() {
        staff.add(new Manager("Manager - A"));
        staff.add(new Manager("Engineer - A"));
        staff.add(new Manager("Manager - B"));
        staff.add(new Manager("Engineer - B"));
        staff.add(new Manager("Engineer - C"));
        staff.add(new Manager("Engineer - D"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : staff) {
            staff.accept(visitor);
        }
    }
}
