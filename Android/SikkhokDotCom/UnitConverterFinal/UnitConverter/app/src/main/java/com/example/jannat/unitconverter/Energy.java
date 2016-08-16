package com.example.jannat.unitconverter;


public class Energy {

    float JouleToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.001*val);
        return res;
    }
    float JouleToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/4.184)*val);
        return res;
    }
    float JouleToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/4184.0)*val);
        return res;
    }
    float JouleToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/3600.0)*val);
        return res;
    }
    float JouleToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/3600000.0)*val);
        return res;
    }
    float JouleToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/1055.05585262)*val);
        return res;
    }
    float JouleToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/105480400.0)*val);
        return res;
    }
    float JouleToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/1.35581795)*val);
        return res;
    }



    float KilojouleToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000.0*val);
        return res;
    }
    float KilojouleToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/4.184)*val);
        return res;
    }
    float KilojouleToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/4184.0)*val);
        return res;
    }
    float KilojouleToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/3600.0)*val);
        return res;
    }
    float KilojouleToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/3600000.0)*val);
        return res;
    }
    float KilojouleToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/1055.05585262)*val);
        return res;
    }
    float KilojouleToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/105480400.0)*val);
        return res;
    }
    float KilojouleToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1000.0/1.35581795)*val);
        return res;
    }



    float GramCalorieToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (4.184*val);
        return res;
    }
    float GramCalorieToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((4.184/1000.0)*val);
        return res;
    }
    float GramCalorieToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.001*val);
        return res;
    }
    float GramCalorieToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/860.420652)*val);
        return res;
    }
    float GramCalorieToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1/(1000.0*860.420652))*val);
        return res;
    }
    float GramCalorieToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/251.99579349178)*val);
        return res;
    }
    float GramCalorieToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((1.0/25199579.5308)*val);
        return res;
    }
    float GramCalorieToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3.08596003*val);
        return res;
    }



    float WattHourToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3600.0*val);
        return res;
    }
    float WattHourToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3.6*val);
        return res;
    }
    float WattHourToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (860.420652*val);
        return res;
    }
    float WattHourToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((860.420652/1000.0)*val);
        return res;
    }
    float WattHourToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.001*val);
        return res;
    }
    float WattHourToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3.412141633*val);
        return res;
    }
    float WattHourToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0000341295634*val);
        return res;
    }
    float WattHourToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) (2655.22374*val);
        return res;
    }



    float KilowattHourToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3600000.0*val);
        return res;
    }
    float KilowattHourToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3600.0*val);
        return res;
    }

    float KilowattHourToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) ((860.420652*1000.0)*val);
        return res;
    }
    float KilowattHourToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (860.420652*val);
        return res;
    }
    float KilowattHourToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1000.0*val);
        return res;
    }
    float KilowattHourToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) (3412.14163*val);
        return res;
    }
    float KilowattHourToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.0341295634*val);
        return res;
    }
    float KilowattHourToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) (2655223.74*val);
        return res;
    }



    float BritishThermalUnitToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1055.05585*val);
        return res;
    }
    float BritishThermalUnitToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.05505585*val);
        return res;
    }

    float BritishThermalUnitToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (252.164401*val);
        return res;
    }
    float BritishThermalUnitToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.252164401*val);
        return res;
    }
    float BritishThermalUnitToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.29307107*val);
        return res;
    }
    float BritishThermalUnitToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00029307107*val);
        return res;
    }
    float BritishThermalUnitToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000000009*val);
        return res;
    }
    float BritishThermalUnitToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) (778.169262*val);
        return res;
    }



    float USThermToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (105480400.0*val);
        return res;
    }
    float USThermToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (105480.4*val);
        return res;
    }

    float USThermToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (25210420.7*val);
        return res;
    }
    float USThermToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (25210.4207*val);
        return res;
    }
    float USThermToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (29300.1111*val);
        return res;
    }
    float USThermToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (29.3001111*val);
        return res;
    }
    float USThermToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) (99976.129*val);
        return res;
    }
    float USThermToFootPound(String value){
        float val=Float.parseFloat(value);
        float res= (float) (77798350.5*val);
        return res;
    }




    float FootPoundToJoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (1.35581795*val);
        return res;
    }
    float FootPoundToKilojoule(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00135581795*val);
        return res;
    }

    float FootPoundToGramCalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.324048267*val);
        return res;
    }
    float FootPoundToKilocalorie(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000324048267*val);
        return res;
    }
    float FootPoundToWattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000376616097*val);
        return res;
    }
    float FootPoundToKilowattHour(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000000376616097*val);
        return res;
    }
    float FootPoundToBritishThermalUnit(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.00128506746*val);
        return res;
    }
    float FootPoundToUSTherm(String value){
        float val=Float.parseFloat(value);
        float res= (float) (0.000000012853743*val);
        return res;
    }
}
