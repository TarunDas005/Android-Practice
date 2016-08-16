package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/21/2016.
 */
public class Frequency {
    float HertzToKilohertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.001*val);
        return res;
    }
    float HertzToMegahertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000001*val);
        return res;
    }
    float HertzToGigahertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000000001*val);
        return res;
    }


    float KilohertzToHertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000.0*val);
        return res;
    }
    float KilohertzToMegahertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.001*val);
        return res;
    }
    float KilohertzToGigahertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000001*val);
        return res;
    }


    float MegahertzToHertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000000.0*val);
        return res;
    }
    float MegahertzToKilohertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000.0*val);
        return res;
    }
    float MegahertzToGigahertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.001*val);
        return res;
    }


    float GigahertzToHertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000000000.0*val);
        return res;
    }
    float GigahertzToKilohertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000000.0*val);
        return res;
    }
    float GigahertzToMegahertz(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000.0*val);
        return res;
    }
}
