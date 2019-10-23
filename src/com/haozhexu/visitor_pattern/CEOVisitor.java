package com.haozhexu.visitor_pattern;

public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("Engineer: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Manager: " + manager.name + ", kPI: " + manager.kpi + ", New products: " + manager.getProductNums());
    }
}
