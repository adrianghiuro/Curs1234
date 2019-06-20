package com.programming.bydoing;

public abstract class Operatie {

    private int factorStang;
    private int factorDrept;

    public int getFactorStang(){return factorStang;}
    public int getFactorDrept(){return factorDrept;}

    public Operatie(int factorStang, int factorDrept){
        this.factorStang = factorStang;
        this.factorDrept = factorDrept;
    }

    public abstract int calculate();
}
