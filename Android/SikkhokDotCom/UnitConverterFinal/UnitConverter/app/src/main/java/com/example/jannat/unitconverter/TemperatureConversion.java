package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/16/2016.
 */
public class TemperatureConversion {

    float CelciusToFarenheit(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((val*9.0/5.0)+32.0);
        return res;
    }
    float CelciusToKelvin(String value){
        float val=Float.parseFloat(value);
        float res= (float) (val+273.15);
        return res;
    }
    float FarenheitToCelCius(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((val-32.0)*(5.0/9.0));
        return res;
    }
    float FarenheitToKelvin(String value){
        float val=Float.parseFloat(value);
        float res= (float) (((val-32.0)*(5.0/9.0))+273.15);
        return res;
    }
    float KelvinToCelCius(String value){
        float val=Float.parseFloat(value);
        float res= (float) (val-273.15);
        return res;
    }
    float KelvinToFarenheit(String value){
        float val=Float.parseFloat(value);
        float res= (float) (((val-273.15)*(9.0/5.0))+32.0);
        return res;
    }

}
