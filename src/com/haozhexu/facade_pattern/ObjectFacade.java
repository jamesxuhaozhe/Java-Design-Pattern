package com.haozhexu.facade_pattern;

/**
 * Created by haozhexu on 1/8/16.
 */
public class ObjectFacade {
    private ObjectA objectA;
    private ObjectB objectB;
    private ObjectC objectC;
    private ObjectD objectD;

    public ObjectFacade(ObjectA objectA, ObjectB objectB, ObjectC objectC, ObjectD objectD) {
        this.objectA = objectA;
        this.objectB = objectB;
        this.objectC = objectC;
        this.objectD = objectD;
    }

    public void doSutff() {
        this.objectA.doA();
        this.objectB.doB();;
        this.objectC.doC();
        this.objectD.doD();
    }
}
