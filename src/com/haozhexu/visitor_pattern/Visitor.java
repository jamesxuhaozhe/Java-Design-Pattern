package com.haozhexu.visitor_pattern;

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
