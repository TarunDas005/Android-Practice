package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/22/2016.
 */
public class Pressure {

    float AtmosphereToBar(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.01325*val);
        return res;
    }
    float AtmosphereToPascal(String value){
        float val=Float.parseFloat(value);
        float res= (float) (101325.0*val);
        return res;
    }
    float AtmosphereToPoundforce(String value){
        float val=Float.parseFloat(value);
        float res= (float) (14.6959488*val);
        return res;
    }
    float AtmosphereToTorr(String value){
        float val=Float.parseFloat(value);
        float res= (float) (760.0*val);
        return res;
    }



    float BarToAtmosphere(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.986923267*val);
        return res;
    }
    float BarToPascal(String value){
        float val=Float.parseFloat(value);
        float res= (float) (100000.0*val);
        return res;
    }
    float BarToPoundforce(String value){
        float val=Float.parseFloat(value);
        float res= (float) (14.5037738*val);
        return res;
    }
    float BarToTorr(String value){
        float val=Float.parseFloat(value);
        float res= (float) (750.061683*val);
        return res;
    }



    float PascalToAtmosphere(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00000986923267*val);
        return res;
    }
    float PascalToBar(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00001*val);
        return res;
    }
    float PascalToPoundforce(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000145037738*val);
        return res;
    }
    float PascalToTorr(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00750061683*val);
        return res;
    }


    float PoundforceToAtmosphere(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0680459369*val);
        return res;
    }
    float PoundforceToBar(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0689475729*val);
        return res;
    }
    float PoundforceToPascal(String value){
        float val=Float.parseFloat(value);
        float res= (float) (6894.75729*val);
        return res;
    }
    float PoundforceToTorr(String value){
        float val=Float.parseFloat(value);
        float res= (float) (51.7149326*val);
        return res;
    }



    float TorrToAtmosphere(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00131578947*val);
        return res;
    }
    float TorrToBar(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00133322368*val);
        return res;
    }
    float TorrToPascal(String value){
        float val=Float.parseFloat(value);
        float res= (float) (133.322368*val);
        return res;
    }
    float TorrToPoundforce(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0193367747*val);
        return res;
    }
}
