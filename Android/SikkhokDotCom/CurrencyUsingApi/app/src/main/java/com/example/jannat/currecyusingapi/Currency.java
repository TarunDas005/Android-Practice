package com.example.jannat.currecyusingapi;

/**
 * Created by JANNAT on 5/3/2016.
 */
public class Currency {

    public double bdtTk;

    public double getBdtTk() {
        return bdtTk;
    }

    public void setBdtTk(double bdtTk) {
        this.bdtTk = bdtTk;
    }

    public Currency(double bdtTk) {
        this.bdtTk = bdtTk;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "bdtTk=" + bdtTk +
                '}';
    }
}
