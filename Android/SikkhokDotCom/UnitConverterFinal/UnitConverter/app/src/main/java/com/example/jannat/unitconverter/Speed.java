package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/22/2016.
 */
public class Speed {
    float MilesperhourToFootpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.46666667*val);
        return res;
    }
    float MilesperhourToMeterpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.44704*val);
        return res;
    }
    float MilesperhourToKilometerperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.609344*val);
        return res;
    }
    float MilesperhourToKnot(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.868976242*val);
        return res;
    }



    float FootpersecondToMilesperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.681818182*val);
        return res;
    }
    float FootpersecondToMeterpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.3048*val);
        return res;
    }
    float FootpersecondToKilometerperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.09728*val);
        return res;
    }
    float FootpersecondToKnot(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.592483801*val);
        return res;
    }



    float MeterpersecondToMilesperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (2.23693629*val);
        return res;
    }
    float MeterpersecondToFootpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3.2808399*val);
        return res;
    }
    float MeterpersecondToKilometerperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3.6*val);
        return res;
    }
    float MeterpersecondToKnot(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.94384449*val);
        return res;
    }



    float KilometerperhourToMilesperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.621371192*val);
        return res;
    }
    float KilometerperhourToFootpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.911344415*val);
        return res;
    }
    float KilometerperhourToMeterpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.277777778*val);
        return res;
    }
    float KilometerperhourToKnot(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.539956803*val);
        return res;
    }



    float KnotToMilesperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.15077945*val);
        return res;
    }
    float KnotToFootpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.68780986*val);
        return res;
    }
    float KnotToMeterpersecond(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.514444444*val);
        return res;
    }
    float KnotToKilometerperhour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.852*val);
        return res;
    }
}
