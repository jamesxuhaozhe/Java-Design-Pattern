package com.haozhexu.visitor_pattern;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("Engineer: " + engineer.name + ", Code lines: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Manager: " + manager.name + ", New products: " + manager.getProductNums());
    }
}
