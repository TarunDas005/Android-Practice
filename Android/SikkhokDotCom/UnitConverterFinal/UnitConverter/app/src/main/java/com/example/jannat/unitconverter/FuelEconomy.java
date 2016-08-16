package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/21/2016.
 */
public class FuelEconomy {
    float USmilespergallonToMilespergallon(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.20095042*val);
        return res;
    }
    float USmilespergallonToKilometerperliter(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/2.352145833)*val);
        return res;
    }
    float USmilespergallonToLiterper100kilometers(String value){
        float val=Float.parseFloat(value);
        float res= (float) (235.2145833/val);
        return res;
    }


    float MilespergallonToUSmilespergallon(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/1.2009499255398)*val);
        return res;
    }
    float MilespergallonToKilometerperliter(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.35400619*val);
        return res;
    }
    float MilespergallonToLiterper100kilometers(String value){
        float val=Float.parseFloat(value);
        float res= (float) (282.480936/val);
        return res;
    }



    float KilometerperliterToUSmilespergallon(String value){
        float val=Float.parseFloat(value);
        float res= (float) (2.352145833*val);
        return res;
    }
    float KilometerperliterToMilespergallon(String value){
        float val=Float.parseFloat(value);
        float res= (float) (2.824809363*val);
        return res;
    }
    float KilometerperliterToLiterper100kilometers(String value){
        float val=Float.parseFloat(value);
        float res= (float) (100.0/val);
        return res;
    }


    float Literper100kilometersToUSmilespergallon(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((2.352145833*100)*val);
        return res;
    }
    float Literper100kilometersToMilespergallon(String value){
        float val=Float.parseFloat(value);
        float res= (float) (2.824809363*100.0*val);
        return res;
    }
    float Literper100kilometersToKilometerperliter(String value){
        float val=Float.parseFloat(value);
        float res= (float) (100.0/val);
        return res;
    }
}
