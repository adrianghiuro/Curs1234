package com.programming.bydoing;

public class Adunare extends Operatie {
    public Adunare(int factorStang, int factorDrept){
        super(factorStang, factorDrept);
    }
    @Override
    public int calculate(){
        return getFactorDrept() + getFactorDrept();
    }
}
