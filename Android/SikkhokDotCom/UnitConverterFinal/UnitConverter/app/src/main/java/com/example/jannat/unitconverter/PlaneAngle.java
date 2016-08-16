package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/21/2016.
 */
public class PlaneAngle {

    float AngularmilToDegree(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/17.777777777778)*val);
        return res;
    }
    float AngularmilToGradian(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/16.0)*val);
        return res;
    }
    float AngularmilToMinuteofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/0.2962962962963)*val);
        return res;
    }
    float AngularmilToRadian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00098174770424681*val);
        return res;
    }
    float AngularmilToSecondofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/0.0049382716049383)*val);
        return res;
    }



    float DegreeToAngularmil(String value){
        float val=Float.parseFloat(value);
        float res= (float) (17.777777777778*val);
        return res;
    }
    float DegreeToGradian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.1111111111111*val);
        return res;
    }
    float DegreeToMinuteofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/0.0166666666667)*val);
        return res;
    }
    float DegreeToRadian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0174532925*val);
        return res;
    }
    float DegreeToSecondofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3600.0*val);
        return res;
    }



    float GradianToAngularmil(String value){
        float val=Float.parseFloat(value);
        float res= (float) (16.0*val);
        return res;
    }
    float GradianToDegree(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.9*val);
        return res;
    }
    float GradianToMinuteofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) (54.0*val);
        return res;
    }
    float GradianToRadian(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/63.66197723676)*val);
        return res;
    }
    float GradianToSecondofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3240.0*val);
        return res;
    }



    float MinuteofarcToAngularmil(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.296296296*val);
        return res;
    }
    float MinuteofarcToDegree(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0166666666666667*val);
        return res;
    }
    float MinuteofarcToGradian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0185185185185185*val);
        return res;
    }
    float MinuteofarcToRadian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000290888208666*val);
        return res;
    }
    float MinuteofarcToSecondofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) (60.0*val);
        return res;
    }


    float RadianToAngularmil(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1018.591635790*val);
        return res;
    }
    float RadianToDegree(String value){
        float val=Float.parseFloat(value);
        float res= (float) (57.2957795*val);
        return res;
    }
    float RadianToGradian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (63.66197723676*val);
        return res;
    }
    float RadianToMinuteofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3437.74677078*val);
        return res;
    }
    float RadianToSecondofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) (206264.806247*val);
        return res;
    }




    float SecondofarcToAngularmil(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0049382716049383*val);
        return res;
    }
    float SecondofarcToDegree(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0002777777777778*val);
        return res;
    }
    float SecondofarcToGradian(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/3240.0)*val);
        return res;
    }
    float SecondofarcToMinuteofarc(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/60.0)*val);
        return res;
    }
    float SecondofarcToRadian(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0000048481368111*val);
        return res;
    }
}
