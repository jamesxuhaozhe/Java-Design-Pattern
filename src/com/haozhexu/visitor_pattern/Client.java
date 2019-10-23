package com.haozhexu.visitor_pattern;

public class Client {

    public static void main(String[] args) {
        // generate report
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}