package com.example.jannat.unitconverter;

/**
 * Created by JANNAT on 4/17/2016.
 */
public class Conversion {
    public float temperature(String fromType, String toType, String value) {
        float result;
        TemperatureConversion temperatureConversion = new TemperatureConversion();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Celcius") && toType.equals("Farenheit")) {
            result = temperatureConversion.CelciusToFarenheit(value);
        } else if (fromType.equals("Celcius") && toType.equals("Kelvin")) {
            result = temperatureConversion.CelciusToKelvin(value);
        } else if (fromType.equals("Kelvin") && toType.equals("Celcius")) {
            result = temperatureConversion.KelvinToCelCius(value);
        } else if (fromType.equals("Kelvin") && toType.equals("Farenheit")) {
            result = temperatureConversion.KelvinToFarenheit(value);
        } else if (fromType.equals("Farenheit") && toType.equals("Celcius")) {
            result = temperatureConversion.FarenheitToCelCius(value);
        } else {
            result = temperatureConversion.FarenheitToKelvin(value);
        }
        return result;
    }

    public float area(String fromType, String toType, String value) {
        float result = (float) 0.0;
        AreaConversion areaConversion = new AreaConversion();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Square meter")) {
            result = areaConversion.SquareKilometerToSquareMeter(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Square mile")) {
            result = areaConversion.SquareKilometerToSquareMile(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Square yard")) {
            result = areaConversion.SquareKilometerToSquareYard(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Square foot")) {
            result = areaConversion.SquareKilometerToSquareFoot(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Square inch")) {
            result = areaConversion.SquareKilometerToSquareinch(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Hactare")) {
            result = areaConversion.SquareKilometerToHactare(value);
        } else if (fromType.equals("Square kilometer") && toType.equals("Acre")) {
            result = areaConversion.SquareKilometerToAcre(value);
        } else if (fromType.equals("Square meter") && toType.equals("Square kilometer")) {
            result = areaConversion.SquareMeterToSquareKilometer(value);
        } else if (fromType.equals("Square meter") && toType.equals("Square mile")) {
            result = areaConversion.SquareMeterToSquareMile(value);
        } else if (fromType.equals("Square meter") && toType.equals("Square yard")) {
            result = areaConversion.SquareMeterToSquareYard(value);
        } else if (fromType.equals("Square meter") && toType.equals("Square foot")) {
            result = areaConversion.SquareMeterToSquareFoot(value);
        } else if (fromType.equals("Square meter") && toType.equals("Square inch")) {
            result = areaConversion.SquareMeterToSquareinch(value);
        } else if (fromType.equals("Square meter") && toType.equals("Hactare")) {
            result = areaConversion.SquareMeterToHactare(value);
        } else if (fromType.equals("Square meter") && toType.equals("Acre")) {
            result = areaConversion.SquareMeterToAcre(value);
        } else if (fromType.equals("Square mile") && toType.equals("Square kilometer")) {
            result = areaConversion.SquareMileToSquareKilometer(value);
        } else if (fromType.equals("Square mile") && toType.equals("Square meter")) {
            result = areaConversion.SquareMileToSquareMeter(value);
        } else if (fromType.equals("Square mile") && toType.equals("Square yard")) {
            result = areaConversion.SquareMileToSquareYard(value);
        } else if (fromType.equals("Square mile") && toType.equals("Square foot")) {
            result = areaConversion.SquareMileToSquareFoot(value);
        } else if (fromType.equals("Square mile") && toType.equals("Square inch")) {
            result = areaConversion.SquareMileToSquareInch(value);
        } else if (fromType.equals("Square mile") && toType.equals("Hactare")) {
            result = areaConversion.SquareMileToHactare(value);
        } else if (fromType.equals("Square mile") && toType.equals("Acre")) {
            result = areaConversion.SquareMileToAcre(value);
        } else if (fromType.equals("Square yard") && toType.equals("Square kilometer")) {
            result = areaConversion.SquareYardToSquareKilometer(value);
        } else if (fromType.equals("Square yard") && toType.equals("Square meter")) {
            result = areaConversion.SquareYardToSquareMeter(value);
        } else if (fromType.equals("Square yard") && toType.equals("Square mile")) {
            result = areaConversion.SquareYardToSquareMile(value);
        } else if (fromType.equals("Square yard") && toType.equals("Square foot")) {
            result = areaConversion.SquareYardToSquareFoot(value);
        } else if (fromType.equals("Square yard") && toType.equals("Square inch")) {
            result = areaConversion.SquareYardToSquareInch(value);
        } else if (fromType.equals("Square yard") && toType.equals("Hactare")) {
            result = areaConversion.SquareYardToHactare(value);
        } else if (fromType.equals("Square yard") && toType.equals("Acre")) {
            result = areaConversion.SquareYardToAcre(value);
        } else if (fromType.equals("Square foot") && toType.equals("Square kilometer")) {
            result = areaConversion.SquareFootToSquareKilometer(value);
        } else if (fromType.equals("Square foot") && toType.equals("Square meter")) {
            result = areaConversion.SquareFootToSquareMeter(value);
        } else if (fromType.equals("Square foot") && toType.equals("Square mile")) {
            result = areaConversion.SquareFootToSquareMile(value);
        } else if (fromType.equals("Square foot") && toType.equals("Square yard")) {
            result = areaConversion.SquareFootToSquareYard(value);
        } else if (fromType.equals("Square foot") && toType.equals("Square inch")) {
            result = areaConversion.SquareFootToSquareInch(value);
        } else if (fromType.equals("Square foot") && toType.equals("Hactare")) {
            result = areaConversion.SquareFootToHactare(value);
        } else if (fromType.equals("Square foot") && toType.equals("Acre")) {
            result = areaConversion.SquareFootToAcre(value);
        } else if (fromType.equals("Square inch") && toType.equals("Square kilometer")) {
            result = areaConversion.SquareInchToSquareKilometer(value);
        } else if (fromType.equals("Square inch") && toType.equals("Square meter")) {
            result = areaConversion.SquareInchToSquareMeter(value);
        } else if (fromType.equals("Square inch") && toType.equals("Square mile")) {
            result = areaConversion.SquareInchToSquareMile(value);
        } else if (fromType.equals("Square inch") && toType.equals("Square yard")) {
            result = areaConversion.SquareInchToSquareYard(value);
        } else if (fromType.equals("Square inch") && toType.equals("Square foot")) {
            result = areaConversion.SquareInchToSquareFoot(value);
        } else if (fromType.equals("Square inch") && toType.equals("Hactare")) {
            result = areaConversion.SquareInchToHactare(value);
        } else if (fromType.equals("Square inch") && toType.equals("Acre")) {
            result = areaConversion.SquareInchToAcre(value);
        } else if (fromType.equals("Hactare") && toType.equals("Square kilometer")) {
            result = areaConversion.HactareToSquareKilometer(value);
        } else if (fromType.equals("Hactare") && toType.equals("Square meter")) {
            result = areaConversion.HactareToSquareMeter(value);
        } else if (fromType.equals("Hactare") && toType.equals("Square mile")) {
            result = areaConversion.HactareToSquareMile(value);
        } else if (fromType.equals("Hactare") && toType.equals("Square yard")) {
            result = areaConversion.HactareToSquareYard(value);
        } else if (fromType.equals("Hactare") && toType.equals("Square foot")) {
            result = areaConversion.HactareToSquareFoot(value);
        } else if (fromType.equals("Hactare") && toType.equals("Square inch")) {
            result = areaConversion.HactareToSquareInch(value);
        } else if (fromType.equals("Hactare") && toType.equals("Acre")) {
            result = areaConversion.HactareToAcre(value);
        } else if (fromType.equals("Acre") && toType.equals("Square kilometer")) {
            result = areaConversion.AcreToSquareKilometer(value);
        } else if (fromType.equals("Acre") && toType.equals("Square meter")) {
            result = areaConversion.AcreToSquareMeter(value);
        } else if (fromType.equals("Acre") && toType.equals("Square mile")) {
            result = areaConversion.AcreToSquareMile(value);
        } else if (fromType.equals("Acre") && toType.equals("Square yard")) {
            result = areaConversion.AcreToSquareYard(value);
        } else if (fromType.equals("Acre") && toType.equals("Square foot")) {
            result = areaConversion.AcreToSquareFoot(value);
        } else if (fromType.equals("Acre") && toType.equals("Square inch")) {
            result = areaConversion.AcreToSquareInch(value);
        } else if (fromType.equals("Acre") && toType.equals("Hactare")) {
            result = areaConversion.AcreToHactare(value);
        }
        return result;
    }


    public float dataTransfer(String fromType, String toType, String value) {
        float result = 0;
        DataTransferRate dataTransferRate = new DataTransferRate();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.BitToKiloBit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.BitToKiloByte(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.BitToKibibit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.BitToMegabit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.BitToMegabyte(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.BitToMebibit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.BitToGigabit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.BitToGigabyte(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.BitToGibibit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.BitToTerabit(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.BitToTerabyte(value);
        } else if (fromType.equals("Bit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.BitToTebibit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.KiloBitToBit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.KiloBitToKiloByte(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.KiloBitToKibibit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.KiloBitToMegabit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.KiloBitToMegabyte(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.KiloBitToMebibit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.KiloBitToGigabit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.KiloBitToGigabyte(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.KiloBitToGibibit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.KiloBitToTerabit(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.KiloBitToTerabyte(value);
        } else if (fromType.equals("Kilobit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.KiloBitToTebibit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.KibibitToBit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.KibibitToKiloBit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.KibibitToKiloByte(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.KibibitToMegabit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.KibibitToMegabyte(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.KibibitToMebibit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.KibibitToGigabit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.KibibitToGigabyte(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.KibibitToGibibit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.KibibitToTerabit(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.KibibitToTerabyte(value);
        } else if (fromType.equals("Kibibit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.KibibitToTebibit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.MegabitToBit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.MegabitToKiloBit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.MegabitToKiloByte(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.MegabitToKibibit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.MegabitToMegabyte(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.MegabitToMebibit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.MegabitToGigabit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.MegabitToGigabyte(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.MegabitToGibibit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.MegabitToTerabit(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.MegabitToTerabyte(value);
        } else if (fromType.equals("Megabit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.MegabitToTebibit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.MegabyteToBit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.MegabyteToKiloBit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.MegabyteToKiloByte(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.MegabyteToKibibit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.MegabyteToMegabit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.MegabyteToMebibit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.MegabyteToGigabit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.MegabyteToGigabyte(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.MegabyteToGibibit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.MegabyteToTerabit(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.MegabyteToTerabyte(value);
        } else if (fromType.equals("Megabyte Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.MegabyteToTebibit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.MebibitToBit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.MebibitToKiloBit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.MebibitToKiloByte(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.MebibitToKibibit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.MebibitToMegabit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.MebibitToMegabyte(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.MebibitToGigabit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.MebibitToGigabyte(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.MebibitToGibibit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.MebibitToTerabit(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.MebibitToTerabyte(value);
        } else if (fromType.equals("Mebibit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.MebibitToTebibit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.GigabitToBit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.GigabitToKiloBit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.GigabitToKiloByte(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.GigabitToKibibit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.GigabitToMegabit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.GigabitToMegabyte(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.GigabitToMebibit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.GigabitToGigabyte(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.GigabitToGibibit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.GigabitToTerabit(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.GigabitToTerabyte(value);
        } else if (fromType.equals("Gigabit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.GigabitToTebibit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.GigabyteToBit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.GigabyteToKiloBit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.GigabyteToKiloByte(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.GigabyteToKibibit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.GigabyteToMegabit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.GigabyteToMegabyte(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.GigabyteToMebibit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.GigabyteToGigabit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.GigabyteToGibibit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.GigabyteToTerabit(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.GigabyteToTerabyte(value);
        } else if (fromType.equals("Gigabyte Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.GigabyteToTebibit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.GibibitToBit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.GibibitToKiloBit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.GibibitToKiloByte(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.GibibitToKibibit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.GibibitToMegabit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.GibibitToMegabyte(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.GibibitToMebibit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.GibibitToGigabit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.GibibitToGigabyte(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.GibibitToTerabit(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.GibibitToTerabyte(value);
        } else if (fromType.equals("Gibibit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.GibibitToTebibit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.TerabitToBit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.TerabitToKiloBit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.TerabitToKiloByte(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.TerabitToKibibit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.TerabitToMegabit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.TerabitToMegabyte(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.TerabitToMebibit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.TerabitToGigabit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.TerabitToGigabyte(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.TerabitToGibibit(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.TerabitToTerabyte(value);
        } else if (fromType.equals("Terabit Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.TerabitToTebibit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.TerabyteToBit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.TerabyteToKiloBit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.TerabyteToKiloByte(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.TerabyteToKibibit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.TerabyteToMegabit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.TerabyteToMegabyte(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.TerabyteToMebibit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.TerabyteToGigabit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.TerabyteToGigabyte(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.TerabyteToGibibit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.TerabyteToTerabit(value);
        } else if (fromType.equals("Terabye Per Second") && toType.equals("Tebibit Per Second")) {
            result = dataTransferRate.TerabyteToTebibit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Bit Per Second")) {
            result = dataTransferRate.TebibitToBit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Kilobit Per Second")) {
            result = dataTransferRate.TebibitToKiloBit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Kilobyte Per Second")) {
            result = dataTransferRate.TebibitToKiloByte(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Kibibit Per Second")) {
            result = dataTransferRate.TebibitToKibibit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Megabit Per Second")) {
            result = dataTransferRate.TebibitToMegabit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Megabyte Per Second")) {
            result = dataTransferRate.TebibitToMegabyte(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Mebibit Per Second")) {
            result = dataTransferRate.TebibitToMebibit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Gigabit Per Second")) {
            result = dataTransferRate.TebibitToGigabit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Gigabyte Per Second")) {
            result = dataTransferRate.TebibitToGigabyte(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Gibibit Per Second")) {
            result = dataTransferRate.TebibitToGibibit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Terabit Per Second")) {
            result = dataTransferRate.TebibitToTerabit(value);
        } else if (fromType.equals("Tebibit Per Second") && toType.equals("Terabye Per Second")) {
            result = dataTransferRate.TebibitToTerabyte(value);
        }
        return result;
    }

    public float digitalStorage(String fromType, String toType, String value) {
        float result = 0;
        DigitalStorage digitalStorage = new DigitalStorage();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Bit")) {
            if (toType.equals("Kilobit")) {
                result = digitalStorage.DsBitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsBitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsBitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsBitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsBitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsBitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsBitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsBitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsBitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsBitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsBitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsBitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsBitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsBitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsBitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsBitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsBitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsBitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsBitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsBitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsBitToDsPebibyte(value);
            }
        } else if (fromType.equals("Kilobit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsKiloBitToDsBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsKiloBitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsKiloBitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsKiloBitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsKiloBitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsKiloBitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsKiloBitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsKiloBitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsKiloBitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsKiloBitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsKiloBitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsKiloBitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsKiloBitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsKiloBitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsKiloBitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsKiloBitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsKiloBitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsKiloBitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsKiloBitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsKiloBitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsKiloBitToDsPebibyte(value);
            }
        } else if (fromType.equals("Kibibit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsKibibitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsKibibitToDsKiloBit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsKibibitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsKibibitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsKibibitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsKibibitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsKibibitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsKibibitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsKibibitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsKibibitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsKibibitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsKibibitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsKibibitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsKibibitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsKibibitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsKibibitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsKibibitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsKibibitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsKibibitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsKibibitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsKibibitToDsPebibyte(value);
            }
        } else if (fromType.equals("Megabit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsMegabitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsMegabitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsMegabitToDsKibibit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsMegabitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsMegabitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsMegabitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsMegabitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsMegabitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsMegabitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsMegabitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsMegabitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsMegabitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsMegabitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsMegabitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsMegabitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsMegabitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsMegabitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsMegabitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsMegabitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsMegabitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsMegabitToDsPebibyte(value);
            }
        } else if (fromType.equals("Mebibit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsMebibitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsMebibitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsMebibitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsMebibitToDsMegabit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsMebibitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsMebibitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsMebibitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsMebibitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsMebibitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsMebibitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsMebibitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsMebibitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsMebibitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsMebibitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsMebibitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsMebibitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsMebibitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsMebibitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsMebibitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsMebibitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsMebibitToDsPebibyte(value);
            }
        } else if (fromType.equals("Gigabit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsGigabitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsGigabitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsGigabitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsGigabitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsGigabitToDsMebibit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsGigabitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsGigabitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsGigabitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsGigabitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsGigabitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsGigabitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsGigabitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsGigabitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsGigabitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsGigabitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsGigabitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsGigabitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsGigabitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsGigabitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsGigabitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsGigabitToDsPebibyte(value);
            }
        } else if (fromType.equals("Gibibit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsGibibitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsGibibitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsGibibitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsGibibitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsGibibitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsGibibitToDsGigabit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsGibibitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsGibibitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsGibibitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsGibibitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsGibibitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsGibibitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsGibibitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsGibibitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsGibibitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsGibibitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsGibibitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsGibibitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsGibibitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsGibibitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsGibibitToDsPebibyte(value);
            }
        } else if (fromType.equals("Terabit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsTerabitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsTerabitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsTerabitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsTerabitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsTerabitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsTerabitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsTerabitToDsGibibit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsTerabitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsTerabitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsTerabitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsTerabitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsTerabitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsTerabitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsTerabitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsTerabitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsTerabitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsTerabitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsTerabitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsTerabitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsTerabitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsTerabitToDsPebibyte(value);
            }
        } else if (fromType.equals("Tebibit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsTebibitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsTebibitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsTebibitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsTebibitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsTebibitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsTebibitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsTebibitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsTebibitToDsTerabit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsTebibitToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsTebibitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsTebibitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsTebibitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsTebibitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsTebibitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsTebibitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsTebibitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsTebibitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsTebibitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsTebibitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsTebibitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsTebibitToDsPebibyte(value);
            }
        } else if (fromType.equals("Petabit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsPetabitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsPetabitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsPetabitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsPetabitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsPetabitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsPetabitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsPetabitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsPetabitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsPetabitToDsTebibit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsPetabitToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsPetabitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsPetabitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsPetabitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsPetabitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsPetabitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsPetabitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsPetabitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsPetabitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsPetabitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsPetabitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsPetabitToDsPebibyte(value);
            }
        } else if (fromType.equals("Pebibit")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsPebibitToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsPebibitToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsPebibitToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsPebibitToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsPebibitToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsPebibitToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsPebibitToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsPebibitToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsPebibitToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsPebibitToDsPetabit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsPebibitToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsPebibitToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsPebibitToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsPebibitToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsPebibitToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsPebibitToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsPebibitToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsPebibitToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsPebibitToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsPebibitToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsPebibitToDsPebibyte(value);
            }
        } else if (fromType.equals("Byte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsByteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsByteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsByteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsByteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsByteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsByteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsByteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsByteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsByteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsByteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsByteToDsPebibit(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsByteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsByteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsByteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsByteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsByteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsByteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsByteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsByteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsByteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsByteToDsPebibyte(value);
            }
        } else if (fromType.equals("Kilobyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsKilobyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsKilobyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsKilobyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsKilobyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsKilobyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsKilobyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsKilobyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsKilobyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsKilobyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsKilobyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsKilobyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsKilobyteToDsByte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsKilobyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsKilobyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsKilobyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsKilobyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsKilobyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsKilobyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsKilobyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsKilobyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsKilobyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Kibibyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsKibibyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsKibibyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsKibibyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsKibibyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsKibibyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsKibibyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsKibibyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsKibibyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsKibibyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsKibibyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsKibibyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsKibibyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsKibibyteToDsKilobyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsKibibyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsKibibyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsKibibyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsKibibyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsKibibyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsKibibyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsKibibyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsKibibyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Megabyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsMegabyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsMegabyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsMegabyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsMegabyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsMegabyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsMegabyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsMegabyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsMegabyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsMegabyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsMegabyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsMegabyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsMegabyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsMegabyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsMegabyteToDsKibibyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsMegabyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsMegabyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsMegabyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsMegabyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsMegabyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsMegabyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsMegabyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Mebibyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsMebibyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsMebibyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsMebibyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsMebibyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsMebibyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsMebibyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsMebibyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsMebibyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsMebibyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsMebibyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsMebibyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsMebibyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsMebibyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsMebibyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsMebibyteToDsMegabyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsMebibyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsMebibyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsMebibyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsMebibyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsMebibyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsMebibyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Gigabyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsGigabyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsGigabyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsGigabyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsGigabyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsGigabyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsGigabyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsGigabyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsGigabyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsGigabyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsGigabyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsGigabyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsGigabyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsGigabyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsGigabyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsGigabyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsGigabyteToDsMebibyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsGigabyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsGigabyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsGigabyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsGigabyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsGigabyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Gibibyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsGibibyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsGibibyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsGibibyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsGibibyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsGibibyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsGibibyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsGibibyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsGibibyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsGibibyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsGibibyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsGibibyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsGibibyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsGibibyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsGibibyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsGibibyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsGibibyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsGibibyteToDsGigabyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsGibibyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsGibibyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsGibibyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsGibibyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Terabyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsTerabyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsTerabyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsTerabyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsTerabyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsTerabyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsTerabyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsTerabyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsTerabyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsTerabyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsTerabyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsTerabyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsTerabyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsTerabyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsTerabyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsTerabyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsTerabyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsTerabyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsTerabyteToDsGibibyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsTerabyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsTerabyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsTerabyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Tebibyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsTebibyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsTebibyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsTebibyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsTebibyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsTebibyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsTebibyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsTebibyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsTebibyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsTebibyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsTebibyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsTebibyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsTebibyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsTebibyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsTebibyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsTebibyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsTebibyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsTebibyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsTebibyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsTebibyteToDsTerabyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsTebibyteToDsPetabyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsTebibyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Petabyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsPetabyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsPetabyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsPetabyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsPetabyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsPetabyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsPetabyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsPetabyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsPetabyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsPetabyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsPetabyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsPetabyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsPetabyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsPetabyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsPetabyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsPetabyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsPetabyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsPetabyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsPetabyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsPetabyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsPetabyteToDsTebibyte(value);
            } else if (toType.equals("Pebibyte")) {
                result = digitalStorage.DsPetabyteToDsPebibyte(value);
            }
        } else if (fromType.equals("Pebibyte")) {
            if (toType.equals("Bit")) {
                result = digitalStorage.DsPebibyteToDsBit(value);
            } else if (toType.equals("Kilobit")) {
                result = digitalStorage.DsPebibyteToDsKiloBit(value);
            } else if (toType.equals("Kibibit")) {
                result = digitalStorage.DsPebibyteToDsKibibit(value);
            } else if (toType.equals("Megabit")) {
                result = digitalStorage.DsPebibyteToDsMegabit(value);
            } else if (toType.equals("Mebibit")) {
                result = digitalStorage.DsPebibyteToDsMebibit(value);
            } else if (toType.equals("Gigabit")) {
                result = digitalStorage.DsPebibyteToDsGigabit(value);
            } else if (toType.equals("Gibibit")) {
                result = digitalStorage.DsPebibyteToDsGibibit(value);
            } else if (toType.equals("Terabit")) {
                result = digitalStorage.DsPebibyteToDsTerabit(value);
            } else if (toType.equals("Tebibit")) {
                result = digitalStorage.DsPebibyteToDsTebibit(value);
            } else if (toType.equals("Petabit")) {
                result = digitalStorage.DsPebibyteToDsPetabit(value);
            } else if (toType.equals("Pebibit")) {
                result = digitalStorage.DsPebibyteToDsPebibit(value);
            } else if (toType.equals("Byte")) {
                result = digitalStorage.DsPebibyteToDsByte(value);
            } else if (toType.equals("Kilobyte")) {
                result = digitalStorage.DsPebibyteToDsKilobyte(value);
            } else if (toType.equals("Kibibyte")) {
                result = digitalStorage.DsPebibyteToDsKibibyte(value);
            } else if (toType.equals("Megabyte")) {
                result = digitalStorage.DsPebibyteToDsMegabyte(value);
            } else if (toType.equals("Mebibyte")) {
                result = digitalStorage.DsPebibyteToDsMebibyte(value);
            } else if (toType.equals("Gigabyte")) {
                result = digitalStorage.DsPebibyteToDsGigabyte(value);
            } else if (toType.equals("Gibibyte")) {
                result = digitalStorage.DsPebibyteToDsGibibyte(value);
            } else if (toType.equals("Terabyte")) {
                result = digitalStorage.DsPebibyteToDsTerabyte(value);
            } else if (toType.equals("Tebibyte")) {
                result = digitalStorage.DsPebibyteToDsTebibyte(value);
            } else if (toType.equals("Petabyte")) {
                result = digitalStorage.DsPebibyteToDsPetabyte(value);
            }
        }

        return result;
    }

    public float energy(String fromType, String toType, String value) {
        float result = 0;
        Energy energy = new Energy();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Joule")) {
            if (toType.equals("Kilojoule")) {
                result = energy.JouleToKilojoule(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.JouleToGramCalorie(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.JouleToKilocalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.JouleToWattHour(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.JouleToKilowattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.JouleToBritishThermalUnit(value);
            } else if (toType.equals("US therm")) {
                result = energy.JouleToUSTherm(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.JouleToFootPound(value);
            }
        } else if (fromType.equals("Kilojoule")) {
            if (toType.equals("Joule")) {
                result = energy.KilojouleToJoule(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.KilojouleToGramCalorie(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.KilojouleToKilocalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.KilojouleToWattHour(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.KilojouleToKilowattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.KilojouleToBritishThermalUnit(value);
            } else if (toType.equals("US therm")) {
                result = energy.KilojouleToUSTherm(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.KilojouleToFootPound(value);
            }
        } else if (fromType.equals("Gram calorie")) {
            if (toType.equals("Joule")) {
                result = energy.GramCalorieToJoule(value);
            } else if (toType.equals("Kilojoule")) {
                result = energy.GramCalorieToKilojoule(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.GramCalorieToKilocalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.GramCalorieToWattHour(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.GramCalorieToKilowattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.GramCalorieToBritishThermalUnit(value);
            } else if (toType.equals("US therm")) {
                result = energy.GramCalorieToUSTherm(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.GramCalorieToFootPound(value);
            }
        } else if (fromType.equals("Watt hour")) {
            if (toType.equals("Joule")) {
                result = energy.WattHourToJoule(value);
            } else if (toType.equals("Kilojoule")) {
                result = energy.WattHourToKilojoule(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.WattHourToKilocalorie(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.WattHourToGramCalorie(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.WattHourToKilowattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.WattHourToBritishThermalUnit(value);
            } else if (toType.equals("US therm")) {
                result = energy.WattHourToUSTherm(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.WattHourToFootPound(value);
            }
        } else if (fromType.equals("Kilowatt hour")) {
            if (toType.equals("Joule")) {
                result = energy.KilowattHourToJoule(value);
            } else if (toType.equals("Kilojoule")) {
                result = energy.KilowattHourToKilojoule(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.KilowattHourToKilocalorie(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.KilowattHourToGramCalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.KilowattHourToWattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.KilowattHourToBritishThermalUnit(value);
            } else if (toType.equals("US therm")) {
                result = energy.KilowattHourToUSTherm(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.KilowattHourToFootPound(value);
            }
        } else if (fromType.equals("British thermal unit")) {
            if (toType.equals("Joule")) {
                result = energy.BritishThermalUnitToJoule(value);
            } else if (toType.equals("Kilojoule")) {
                result = energy.BritishThermalUnitToKilojoule(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.BritishThermalUnitToKilocalorie(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.BritishThermalUnitToGramCalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.BritishThermalUnitToWattHour(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.BritishThermalUnitToKilowattHour(value);
            } else if (toType.equals("US therm")) {
                result = energy.BritishThermalUnitToUSTherm(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.BritishThermalUnitToFootPound(value);
            }
        } else if (fromType.equals("US therm")) {
            if (toType.equals("Joule")) {
                result = energy.USThermToJoule(value);
            } else if (toType.equals("Kilojoule")) {
                result = energy.USThermToKilojoule(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.USThermToKilocalorie(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.USThermToGramCalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.USThermToWattHour(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.USThermToKilowattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.USThermToBritishThermalUnit(value);
            } else if (toType.equals("Foot-pound")) {
                result = energy.USThermToFootPound(value);
            }
        } else if (fromType.equals("Foot-pound")) {
            if (toType.equals("Joule")) {
                result = energy.FootPoundToJoule(value);
            } else if (toType.equals("Kilojoule")) {
                result = energy.FootPoundToKilojoule(value);
            } else if (toType.equals("Kilocalorie")) {
                result = energy.FootPoundToKilocalorie(value);
            } else if (toType.equals("Gram calorie")) {
                result = energy.FootPoundToGramCalorie(value);
            } else if (toType.equals("Watt hour")) {
                result = energy.FootPoundToWattHour(value);
            } else if (toType.equals("Kilowatt hour")) {
                result = energy.FootPoundToKilowattHour(value);
            } else if (toType.equals("British thermal unit")) {
                result = energy.FootPoundToBritishThermalUnit(value);
            } else if (toType.equals("US therm")) {
                result = energy.FootPoundToUSTherm(value);
            }
        }
        return result;
    }

    public float frequency(String fromType, String toType, String value) {
        float result = 0;
        Frequency frequency = new Frequency();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        }
        else if (fromType.equals("Hertz")) {
            if (toType.equals("Kilohertz")) {
                result = frequency.HertzToKilohertz(value);
            }
            else if (toType.equals("Megahertz")) {
                result = frequency.HertzToMegahertz(value);
            }
            else if (toType.equals("Gigahertz")) {
                result = frequency.HertzToGigahertz(value);
            }
        }

        else if (fromType.equals("Kilohertz")) {
            if (toType.equals("Hertz")) {
                result = frequency.KilohertzToHertz(value);
            }
            else if (toType.equals("Megahertz")) {
                result = frequency.KilohertzToMegahertz(value);
            }
            else if (toType.equals("Gigahertz")) {
                result = frequency.KilohertzToGigahertz(value);
            }
        }


        else if (fromType.equals("Megahertz")) {
            if (toType.equals("Hertz")) {
                result = frequency.MegahertzToHertz(value);
            }
            else if (toType.equals("Kilohertz")) {
                result = frequency.MegahertzToKilohertz(value);
            }
            else if (toType.equals("Gigahertz")) {
                result = frequency.MegahertzToGigahertz(value);
            }
        }


        else if (fromType.equals("Gigahertz")) {
            if (toType.equals("Hertz")) {
                result = frequency.GigahertzToHertz(value);
            }
            else if (toType.equals("Kilohertz")) {
                result = frequency.GigahertzToKilohertz(value);
            }
            else if (toType.equals("Megahertz")) {
                result = frequency.GigahertzToMegahertz(value);
            }
        }

        return result;
    }

    public float fuelEconomy(String fromType, String toType, String value) {
        float result = 0;
        FuelEconomy fuelEconomy = new FuelEconomy();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("US Miles per gallon")) {
            if (toType.equals("Miles per gallon (Imperial)")) {
                result = fuelEconomy.USmilespergallonToMilespergallon(value);
            }
            else if (toType.equals("Kilometer per liter")) {
                result = fuelEconomy.USmilespergallonToKilometerperliter(value);
            }
            else if (toType.equals("Liter per 100 kilometers")) {
                result = fuelEconomy.USmilespergallonToLiterper100kilometers(value);
            }
        }

        else if (fromType.equals("Miles per gallon (Imperial)")) {
            if (toType.equals("US Miles per gallon")) {
                result = fuelEconomy.MilespergallonToUSmilespergallon(value);
            }
            else if (toType.equals("Kilometer per liter")) {
                result = fuelEconomy.MilespergallonToKilometerperliter(value);
            }
            else if (toType.equals("Liter per 100 kilometers")) {
                result = fuelEconomy.MilespergallonToLiterper100kilometers(value);
            }
        }

        else if (fromType.equals("Kilometer per liter")) {
            if (toType.equals("US Miles per gallon")) {
                result = fuelEconomy.KilometerperliterToUSmilespergallon(value);
            }
            else if (toType.equals("Miles per gallon (Imperial)")) {
                result = fuelEconomy.KilometerperliterToMilespergallon(value);
            }
            else if (toType.equals("Liter per 100 kilometers")) {
                result = fuelEconomy.KilometerperliterToLiterper100kilometers(value);
            }
        }


        else if (fromType.equals("Liter per 100 kilometers")) {
            if (toType.equals("US Miles per gallon")) {
                result = fuelEconomy.Literper100kilometersToUSmilespergallon(value);
            }
            else if (toType.equals("Miles per gallon (Imperial)")) {
                result = fuelEconomy.Literper100kilometersToMilespergallon(value);
            }
            else if (toType.equals("Kilometer per liter")) {
                result = fuelEconomy.Literper100kilometersToKilometerperliter(value);
            }
        }

        return result;
    }


    public float lengthFunc(String fromType, String toType, String value) {
        float result = 0;
        LengthClass lengthClass = new LengthClass();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Kilometer")) {
            if (toType.equals("Meter")) {
                result = lengthClass.KilometerToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.KilometerToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.KilometerToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.KilometerToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.KilometerToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.KilometerToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.KilometerToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.KilometerToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.KilometerToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.KilometerToNauticalMile(value);
            }
        }

        else if (fromType.equals("Meter")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.MeterToKilometer(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.MeterToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.MeterToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.MeterToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.MeterToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.MeterToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.MeterToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.MeterToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.MeterToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.MeterToNauticalMile(value);
            }
        }


        else if (fromType.equals("Centimeter")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.CentimeterToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.CentimeterToMeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.CentimeterToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.CentimeterToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.CentimeterToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.CentimeterToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.CentimeterToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.CentimeterToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.CentimeterToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.CentimeterToNauticalMile(value);
            }
        }


        else if (fromType.equals("Millimeter")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.MillimeterToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.MillimeterToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.MillimeterToCentimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.MillimeterToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.MillimeterToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.MillimeterToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.MillimeterToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.MillimeterToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.MillimeterToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.MillimeterToNauticalMile(value);
            }
        }


        else if (fromType.equals("Micrometer")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.MicrometerToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.MicrometerToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.MicrometerToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.MicrometerToMillimeter(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.MicrometerToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.MicrometerToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.MicrometerToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.MicrometerToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.MicrometerToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.MicrometerToNauticalMile(value);
            }
        }

        else if (fromType.equals("Nanometer")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.NanometerToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.NanometerToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.NanometerToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.NanometerToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.NanometerToMicrometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.NanometerToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.NanometerToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.NanometerToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.NanometerToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.NanometerToNauticalMile(value);
            }
        }


        else if (fromType.equals("Mile")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.MileToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.MileToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.MileToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.MileToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.MileToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.MileToNanometer(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.MileToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.MileToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.MileToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.MileToNauticalMile(value);
            }
        }


        else if (fromType.equals("Yard")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.YardToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.YardToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.YardToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.YardToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.YardToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.YardToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.YardToMile(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.YardToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.YardToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.YardToNauticalMile(value);
            }
        }

        else if (fromType.equals("Foot")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.FootToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.FootToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.FootToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.FootToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.FootToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.FootToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.FootToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.FootToYard(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.FootToInch(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.FootToNauticalMile(value);
            }
        }


        else if (fromType.equals("Inch")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.InchToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.InchToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.InchToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.InchToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.InchToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.InchToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.InchToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.InchToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.InchToFoot(value);
            } else if (toType.equals("Nautical mile")) {
                result = lengthClass.InchToNauticalMile(value);
            }
        }


        else if (fromType.equals("Nautical mile")) {
            if (toType.equals("Kilometer")) {
                result = lengthClass.NauticalMileToKilometer(value);
            } else if (toType.equals("Meter")) {
                result = lengthClass.NauticalMileToMeter(value);
            } else if (toType.equals("Centimeter")) {
                result = lengthClass.NauticalMileToCentimeter(value);
            } else if (toType.equals("Millimeter")) {
                result = lengthClass.NauticalMileToMillimeter(value);
            } else if (toType.equals("Micrometer")) {
                result = lengthClass.NauticalMileToMicrometer(value);
            } else if (toType.equals("Nanometer")) {
                result = lengthClass.NauticalMileToNanometer(value);
            } else if (toType.equals("Mile")) {
                result = lengthClass.NauticalMileToMile(value);
            } else if (toType.equals("Yard")) {
                result = lengthClass.NauticalMileToYard(value);
            } else if (toType.equals("Foot")) {
                result = lengthClass.NauticalMileToFoot(value);
            } else if (toType.equals("Inch")) {
                result = lengthClass.NauticalMileToInch(value);
            }
        }
        return result;
    }


    public float mass(String fromType, String toType, String value) {
        float result = 0;
        Mass mass = new Mass();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Metric Ton")) {
            if (toType.equals("Kilogram")) {
                result = mass.MetricTonToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.MetricTonToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.MetricTonToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.MetricTonToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.MetricTonToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.MetricTonToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.MetricTonToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.MetricTonToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.MetricTonToOunce(value);
            }
        }


        else if (fromType.equals("Kilogram")) {
            if (toType.equals("Metric Ton")) {
                result = mass.KilogramToMetricTon(value);
            }else if (toType.equals("Gram")) {
                result = mass.KilogramToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.KilogramToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.KilogramToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.KilogramToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.KilogramToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.KilogramToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.KilogramToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.KilogramToOunce(value);
            }
        }

        else if (fromType.equals("Gram")) {
            if (toType.equals("Metric Ton")) {
                result = mass.GramToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.GramToKilogram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.GramToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.GramToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.GramToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.GramToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.GramToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.GramToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.GramToOunce(value);
            }
        }

        else if (fromType.equals("Milligram")) {
            if (toType.equals("Metric Ton")) {
                result = mass.MilligramToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.MilligramToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.MilligramToGram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.MilligramToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.MilligramToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.MilligramToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.MilligramToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.MilligramToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.MilligramToOunce(value);
            }
        }


        else if (fromType.equals("Microgram")) {
            if (toType.equals("Metric Ton")) {
                result = mass.MicrogramToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.MicrogramToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.MicrogramToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.MicrogramToMilligram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.MicrogramToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.MicrogramToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.MicrogramToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.MicrogramToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.MicrogramToOunce(value);
            }
        }


        else if (fromType.equals("Imperial Ton")) {
            if (toType.equals("Metric Ton")) {
                result = mass.ImperialTonToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.ImperialTonToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.ImperialTonToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.ImperialTonToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.ImperialTonToMicrogram(value);
            }else if (toType.equals("US Ton")) {
                result = mass.ImperialTonToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.ImperialTonToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.ImperialTonToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.ImperialTonToOunce(value);
            }
        }


        else if (fromType.equals("US Ton")) {
            if (toType.equals("Metric Ton")) {
                result = mass.USTonToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.USTonToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.USTonToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.USTonToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.USTonToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.USTonToImperialTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.USTonToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.USTonToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.USTonToOunce(value);
            }
        }


        else if (fromType.equals("Stone")) {
            if (toType.equals("Metric Ton")) {
                result = mass.StoneToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.StoneToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.StoneToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.StoneToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.StoneToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.StoneToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.StoneToUSTon(value);
            }else if (toType.equals("Pound")) {
                result = mass.StoneToPound(value);
            }else if (toType.equals("Ounce")) {
                result = mass.StoneToOunce(value);
            }
        }


        else if (fromType.equals("Pound")) {
            if (toType.equals("Metric Ton")) {
                result = mass.PoundToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.PoundToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.PoundToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.PoundToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.PoundToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.PoundToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.PoundToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.PoundToStone(value);
            }else if (toType.equals("Ounce")) {
                result = mass.PoundToOunce(value);
            }
        }


        else if (fromType.equals("Ounce")) {
            if (toType.equals("Metric Ton")) {
                result = mass.OunceToMetricTon(value);
            }else if (toType.equals("Kilogram")) {
                result = mass.OunceToKilogram(value);
            }else if (toType.equals("Gram")) {
                result = mass.OunceToGram(value);
            }else if (toType.equals("Milligram")) {
                result = mass.OunceToMilligram(value);
            }else if (toType.equals("Microgram")) {
                result = mass.OunceToMicrogram(value);
            }else if (toType.equals("Imperial Ton")) {
                result = mass.OunceToImperialTon(value);
            }else if (toType.equals("US Ton")) {
                result = mass.OunceToUSTon(value);
            }else if (toType.equals("Stone")) {
                result = mass.OunceToStone(value);
            }else if (toType.equals("Pound")) {
                result = mass.OunceToPound(value);
            }
        }
        return result;
    }


    public float planeAngle(String fromType, String toType, String value) {
        float result = 0;
        PlaneAngle planeAngle = new PlaneAngle();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Angular mil")) {
            if (toType.equals("Degree")) {
                result = planeAngle.AngularmilToDegree(value);
            }else if (toType.equals("Gradian")) {
                result = planeAngle.AngularmilToGradian(value);
            }else if (toType.equals("Minute of arc")) {
                result = planeAngle.AngularmilToMinuteofarc(value);
            }else if (toType.equals("Radian")) {
                result = planeAngle.AngularmilToRadian(value);
            }else if (toType.equals("Second of arc")) {
                result = planeAngle.AngularmilToSecondofarc(value);
            }
        }

        else if (fromType.equals("Degree")) {
            if (toType.equals("Angular mil")) {
                result = planeAngle.DegreeToAngularmil(value);
            }else if (toType.equals("Gradian")) {
                result = planeAngle.DegreeToGradian(value);
            }else if (toType.equals("Minute of arc")) {
                result = planeAngle.DegreeToMinuteofarc(value);
            }else if (toType.equals("Radian")) {
                result = planeAngle.DegreeToRadian(value);
            }else if (toType.equals("Second of arc")) {
                result = planeAngle.DegreeToSecondofarc(value);
            }
        }


        else if (fromType.equals("Gradian")) {
            if (toType.equals("Angular mil")) {
                result = planeAngle.GradianToAngularmil(value);
            }else if (toType.equals("Degree")) {
                result = planeAngle.GradianToDegree(value);
            }else if (toType.equals("Minute of arc")) {
                result = planeAngle.GradianToMinuteofarc(value);
            }else if (toType.equals("Radian")) {
                result = planeAngle.GradianToRadian(value);
            }else if (toType.equals("Second of arc")) {
                result = planeAngle.GradianToSecondofarc(value);
            }
        }



        else if (fromType.equals("Minute of arc")) {
            if (toType.equals("Angular mil")) {
                result = planeAngle.MinuteofarcToAngularmil(value);
            }else if (toType.equals("Degree")) {
                result = planeAngle.MinuteofarcToDegree(value);
            }else if (toType.equals("Gradian")) {
                result = planeAngle.MinuteofarcToGradian(value);
            }else if (toType.equals("Radian")) {
                result = planeAngle.MinuteofarcToRadian(value);
            }else if (toType.equals("Second of arc")) {
                result = planeAngle.MinuteofarcToSecondofarc(value);
            }
        }


        else if (fromType.equals("Radian")) {
            if (toType.equals("Angular mil")) {
                result = planeAngle.RadianToAngularmil(value);
            }else if (toType.equals("Degree")) {
                result = planeAngle.RadianToDegree(value);
            }else if (toType.equals("Gradian")) {
                result = planeAngle.RadianToGradian(value);
            }else if (toType.equals("Minute of arc")) {
                result = planeAngle.RadianToMinuteofarc(value);
            }else if (toType.equals("Second of arc")) {
                result = planeAngle.RadianToSecondofarc(value);
            }
        }
        return result;
    }




    public float pressure(String fromType, String toType, String value) {
        float result = 0;
        Pressure pressure = new Pressure();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Atmosphere")) {
            if (toType.equals("Bar")) {
                result = pressure.AtmosphereToBar(value);
            } else if (toType.equals("Pascal")) {
                result = pressure.AtmosphereToPascal(value);
            }else if (toType.equals("Pound-force/square inch")) {
                result = pressure.AtmosphereToPoundforce(value);
            }else if (toType.equals("Torr")) {
                result = pressure.AtmosphereToTorr(value);
            }
        }

        else if (fromType.equals("Bar")) {
            if (toType.equals("Atmosphere")) {
                result = pressure.BarToAtmosphere(value);
            } else if (toType.equals("Pascal")) {
                result = pressure.BarToPascal(value);
            }else if (toType.equals("Pound-force/square inch")) {
                result = pressure.BarToPoundforce(value);
            }else if (toType.equals("Torr")) {
                result = pressure.BarToTorr(value);
            }
        }

        else if (fromType.equals("Pascal")) {
            if (toType.equals("Atmosphere")) {
                result = pressure.PascalToAtmosphere(value);
            } else if (toType.equals("Bar")) {
                result = pressure.PascalToBar(value);
            }else if (toType.equals("Pound-force/square inch")) {
                result = pressure.PascalToPoundforce(value);
            }else if (toType.equals("Torr")) {
                result = pressure.PascalToTorr(value);
            }
        }


        else if (fromType.equals("Pound-force/square inch")) {
            if (toType.equals("Atmosphere")) {
                result = pressure.PoundforceToAtmosphere(value);
            } else if (toType.equals("Bar")) {
                result = pressure.PoundforceToBar(value);
            }else if (toType.equals("Pascal")) {
                result = pressure.PoundforceToPascal(value);
            }else if (toType.equals("Torr")) {
                result = pressure.PoundforceToTorr(value);
            }
        }

        else if (fromType.equals("Torr")) {
            if (toType.equals("Atmosphere")) {
                result = pressure.TorrToAtmosphere(value);
            } else if (toType.equals("Bar")) {
                result = pressure.TorrToBar(value);
            }else if (toType.equals("Pascal")) {
                result = pressure.TorrToPascal(value);
            }else if (toType.equals("Pound-force/square inch")) {
                result = pressure.TorrToPoundforce(value);
            }
        }
        return result;
    }


    public float speed(String fromType, String toType, String value) {
        float result = 0;
        Speed speed = new Speed();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Miles per hour")) {
            if (toType.equals("Foot per second")) {
                result = speed.MilesperhourToFootpersecond(value);
            } else if (toType.equals("Meter per second")) {
                result = speed.MilesperhourToMeterpersecond(value);
            }else if (toType.equals("Kilometer per hour")) {
                result = speed.MilesperhourToKilometerperhour(value);
            }else if (toType.equals("Knot")) {
                result = speed.MilesperhourToKnot(value);
            }
        }

        else if (fromType.equals("Foot per second")) {
            if (toType.equals("Miles per hour")) {
                result = speed.FootpersecondToMilesperhour(value);
            } else if (toType.equals("Meter per second")) {
                result = speed.FootpersecondToMeterpersecond(value);
            }else if (toType.equals("Kilometer per hour")) {
                result = speed.FootpersecondToKilometerperhour(value);
            }else if (toType.equals("Knot")) {
                result = speed.FootpersecondToKnot(value);
            }
        }


        else if (fromType.equals("Meter per second")) {
            if (toType.equals("Miles per hour")) {
                result = speed.MeterpersecondToMilesperhour(value);
            } else if (toType.equals("Foot per second")) {
                result = speed.MeterpersecondToFootpersecond(value);
            }else if (toType.equals("Kilometer per hour")) {
                result = speed.MeterpersecondToKilometerperhour(value);
            }else if (toType.equals("Knot")) {
                result = speed.MeterpersecondToKnot(value);
            }
        }


        else if (fromType.equals("Kilometer per hour")) {
            if (toType.equals("Miles per hour")) {
                result = speed.KilometerperhourToMilesperhour(value);
            } else if (toType.equals("Foot per second")) {
                result = speed.KilometerperhourToFootpersecond(value);
            }else if (toType.equals("Meter per second")) {
                result = speed.KilometerperhourToMeterpersecond(value);
            }else if (toType.equals("Knot")) {
                result = speed.KilometerperhourToKnot(value);
            }
        }


        else if (fromType.equals("Knot")) {
            if (toType.equals("Miles per hour")) {
                result = speed.KnotToMilesperhour(value);
            } else if (toType.equals("Foot per second")) {
                result = speed.KnotToFootpersecond(value);
            }else if (toType.equals("Meter per second")) {
                result = speed.KnotToMeterpersecond(value);
            }else if (toType.equals("Kilometer per hour")) {
                result = speed.KnotToKilometerperhour(value);
            }
        }
        return result;
    }


    public float timeFunc(String fromType, String toType, String value) {
        float result = 0;
        TimeClass timeClass = new TimeClass();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("Nanosecond")) {
            if (toType.equals("Microsecond")) {
                result = timeClass.NanosecondToMicrosecond(value);
            } else if (toType.equals("Millisecond")) {
                result = timeClass.NanosecondToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.NanosecondToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.NanosecondToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.NanosecondToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.NanosecondToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.NanosecondToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.NanosecondToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.NanosecondToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.NanosecondToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.NanosecondToCentury(value);
            }
        }


        else if (fromType.equals("Microsecond")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.MicrosecondToNanosecond(value);
            } else if (toType.equals("Millisecond")) {
                result = timeClass.MicrosecondToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.MicrosecondToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.MicrosecondToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.MicrosecondToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.MicrosecondToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.MicrosecondToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.MicrosecondToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.MicrosecondToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.MicrosecondToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.MicrosecondToCentury(value);
            }
        }


        else if (fromType.equals("Millisecond")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.MillisecondToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.MillisecondToMicrosecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.MillisecondToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.MillisecondToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.MillisecondToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.MillisecondToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.MillisecondToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.MillisecondToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.MillisecondToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.MillisecondToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.MillisecondToCentury(value);
            }
        }


        else if (fromType.equals("Second")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.SecondToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.SecondToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.SecondToMillisecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.SecondToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.SecondToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.SecondToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.SecondToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.SecondToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.SecondToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.SecondToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.SecondToCentury(value);
            }
        }



        else if (fromType.equals("Minute")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.MinuteToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.MinuteToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.MinuteToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.MinuteToSecond(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.MinuteToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.MinuteToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.MinuteToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.MinuteToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.MinuteToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.MinuteToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.MinuteToCentury(value);
            }
        }


        else if (fromType.equals("Hour")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.HourToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.HourToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.HourToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.HourToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.HourToMinute(value);
            }else if (toType.equals("Day")) {
                result = timeClass.HourToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.HourToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.HourToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.HourToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.HourToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.HourToCentury(value);
            }
        }


        else if (fromType.equals("Day")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.DayToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.DayToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.DayToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.DayToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.DayToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.DayToHour(value);
            }else if (toType.equals("Week")) {
                result = timeClass.DayToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.DayToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.DayToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.DayToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.DayToCentury(value);
            }
        }

        else if (fromType.equals("Week")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.WeekToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.WeekToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.WeekToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.WeekToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.WeekToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.WeekToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.WeekToDay(value);
            }else if (toType.equals("Month")) {
                result = timeClass.WeekToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.WeekToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.WeekToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.WeekToCentury(value);
            }
        }


        else if (fromType.equals("Month")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.MonthToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.MonthToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.MonthToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.MonthToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.MonthToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.MonthToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.MonthToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.MonthToWeek(value);
            }else if (toType.equals("Year")) {
                result = timeClass.MonthToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.MonthToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.MonthToCentury(value);
            }
        }


        else if (fromType.equals("Year")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.YearToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.YearToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.YearToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.YearToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.YearToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.YearToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.YearToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.YearToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.YearToMonth(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.YearToDecade(value);
            }else if (toType.equals("Century")) {
                result = timeClass.YearToCentury(value);
            }
        }


        else if (fromType.equals("Decade")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.DecadeToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.DecadeToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.DecadeToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.DecadeToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.DecadeToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.DecadeToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.DecadeToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.DecadeToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.DecadeToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.DecadeToYear(value);
            }else if (toType.equals("Century")) {
                result = timeClass.DecadeToCentury(value);
            }
        }



        else if (fromType.equals("Century")) {
            if (toType.equals("Nanosecond")) {
                result = timeClass.CenturyToNanosecond(value);
            } else if (toType.equals("Microsecond")) {
                result = timeClass.CenturyToMicrosecond(value);
            }else if (toType.equals("Millisecond")) {
                result = timeClass.CenturyToMillisecond(value);
            }else if (toType.equals("Second")) {
                result = timeClass.CenturyToSecond(value);
            }else if (toType.equals("Minute")) {
                result = timeClass.CenturyToMinute(value);
            }else if (toType.equals("Hour")) {
                result = timeClass.CenturyToHour(value);
            }else if (toType.equals("Day")) {
                result = timeClass.CenturyToDay(value);
            }else if (toType.equals("Week")) {
                result = timeClass.CenturyToWeek(value);
            }else if (toType.equals("Month")) {
                result = timeClass.CenturyToMonth(value);
            }else if (toType.equals("Year")) {
                result = timeClass.CenturyToYear(value);
            }else if (toType.equals("Decade")) {
                result = timeClass.CenturyToDecade(value);
            }
        }
        return result;
    }


    public float volume(String fromType, String toType, String value) {
        float result = 0;
        Volume volume = new Volume();
        if (fromType.equals(toType)) {
            result = Float.parseFloat(value);
        } else if (fromType.equals("US liquid gallon")) {
            if (toType.equals("US liquid quart")) {
                result = volume.USliquidgallonToUSliquidquart(value);
            } else if (toType.equals("US liquid pint")) {
                result = volume.USliquidgallonToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.USliquidgallonToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.USliquidgallonToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.USliquidgallonToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.USliquidgallonToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.USliquidgallonToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.USliquidgallonToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.USliquidgallonToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.USliquidgallonToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.USliquidgallonToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.USliquidgallonToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.USliquidgallonToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.USliquidgallonToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.USliquidgallonToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.USliquidgallonToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.USliquidgallonToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.USliquidgallonToCubicinch(value);
            }
        }

        else if (fromType.equals("US liquid quart")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.USliquidquartToUSliquidgallon(value);
            } else if (toType.equals("US liquid pint")) {
                result = volume.USliquidquartToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.USliquidquartToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.USliquidquartToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.USliquidquartToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.USliquidquartToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.USliquidquartToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.USliquidquartToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.USliquidquartToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.USliquidquartToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.USliquidquartToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.USliquidquartToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.USliquidquartToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.USliquidquartToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.USliquidquartToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.USliquidquartToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.USliquidquartToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.USliquidquartToCubicinch(value);
            }
        }


        else if (fromType.equals("US liquid pint")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.USliquidpintToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.USliquidpintToUSliquidquart(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.USliquidpintToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.USliquidpintToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.USliquidpintToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.USliquidpintToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.USliquidpintToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.USliquidpintToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.USliquidpintToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.USliquidpintToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.USliquidpintToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.USliquidpintToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.USliquidpintToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.USliquidpintToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.USliquidpintToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.USliquidpintToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.USliquidpintToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.USliquidpintToCubicinch(value);
            }
        }



        else if (fromType.equals("US legal cup")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.USlegalcupToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.USlegalcupToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.USlegalcupToUSliquidpint(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.USlegalcupToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.USlegalcupToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.USlegalcupToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.USlegalcupToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.USlegalcupToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.USlegalcupToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.USlegalcupToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.USlegalcupToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.USlegalcupToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.USlegalcupToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.USlegalcupToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.USlegalcupToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.USlegalcupToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.USlegalcupToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.USlegalcupToCubicinch(value);
            }
        }



        else if (fromType.equals("US fluid ounce")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.USfluidounceToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.USfluidounceToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.USfluidounceToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.USfluidounceToUSlegalcup(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.USfluidounceToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.USfluidounceToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.USfluidounceToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.USfluidounceToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.USfluidounceToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.USfluidounceToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.USfluidounceToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.USfluidounceToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.USfluidounceToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.USfluidounceToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.USfluidounceToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.USfluidounceToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.USfluidounceToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.USfluidounceToCubicinch(value);
            }
        }


        else if (fromType.equals("US tablespoon")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.UStablespoonToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.UStablespoonToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.UStablespoonToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.UStablespoonToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.UStablespoonToUSfluidounce(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.UStablespoonToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.UStablespoonToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.UStablespoonToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.UStablespoonToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.UStablespoonToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.UStablespoonToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.UStablespoonToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.UStablespoonToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.UStablespoonToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.UStablespoonToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.UStablespoonToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.UStablespoonToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.UStablespoonToCubicinch(value);
            }
        }


        else if (fromType.equals("US teaspoon")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.USteaspoonToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.USteaspoonToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.USteaspoonToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.USteaspoonToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.USteaspoonToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.USteaspoonToUStablespoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.USteaspoonToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.USteaspoonToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.USteaspoonToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.USteaspoonToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.USteaspoonToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.USteaspoonToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.USteaspoonToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.USteaspoonToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.USteaspoonToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.USteaspoonToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.USteaspoonToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.USteaspoonToCubicinch(value);
            }
        }


        else if (fromType.equals("Cubic meter")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.CubicmeterToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.CubicmeterToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.CubicmeterToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.CubicmeterToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.CubicmeterToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.CubicmeterToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.CubicmeterToUSteaspoon(value);
            }else if (toType.equals("Liter")) {
                result = volume.CubicmeterToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.CubicmeterToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.CubicmeterToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.CubicmeterToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.CubicmeterToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.CubicmeterToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.CubicmeterToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.CubicmeterToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.CubicmeterToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.CubicmeterToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.CubicmeterToCubicinch(value);
            }
        }



        else if (fromType.equals("Liter")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.LiterToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.LiterToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.LiterToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.LiterToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.LiterToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.LiterToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.LiterToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.LiterToCubicmeter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.LiterToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.LiterToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.LiterToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.LiterToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.LiterToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.LiterToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.LiterToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.LiterToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.LiterToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.LiterToCubicinch(value);
            }
        }


        else if (fromType.equals("Milliliter")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.MilliliterToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.MilliliterToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.MilliliterToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.MilliliterToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.MilliliterToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.MilliliterToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.MilliliterToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.MilliliterToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.MilliliterToLiter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.MilliliterToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.MilliliterToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.MilliliterToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.MilliliterToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.MilliliterToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.MilliliterToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.MilliliterToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.MilliliterToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.MilliliterToCubicinch(value);
            }
        }



        else if (fromType.equals("Imperial gallon")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialgallonToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialgallonToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialgallonToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialgallonToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialgallonToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialgallonToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialgallonToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialgallonToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialgallonToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialgallonToMilliliter(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.ImperialgallonToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.ImperialgallonToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.ImperialgallonToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.ImperialgallonToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.ImperialgallonToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.ImperialgallonToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialgallonToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialgallonToCubicinch(value);
            }
        }


        else if (fromType.equals("Imperial quart")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialquartToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialquartToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialquartToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialquartToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialquartToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialquartToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialquartToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialquartToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialquartToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialquartToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.ImperialquartToImperialgallon(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.ImperialquartToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.ImperialquartToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.ImperialquartToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.ImperialquartToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.ImperialquartToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialquartToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialquartToCubicinch(value);
            }
        }


        else if (fromType.equals("Imperial pint")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialpintToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialpintToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialpintToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialpintToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialpintToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialpintToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialpintToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialpintToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialpintToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialpintToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.ImperialpintToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.ImperialpintToImperialquart(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.ImperialpintToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.ImperialpintToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.ImperialpintToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.ImperialpintToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialpintToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialpintToCubicinch(value);
            }
        }



        else if (fromType.equals("Imperial cup")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialcupToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialcupToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialcupToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialcupToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialcupToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialcupToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialcupToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialcupToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialcupToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialcupToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.ImperialcupToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.ImperialcupToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.ImperialcupToImperialpint(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.ImperialcupToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.ImperialcupToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.ImperialcupToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialcupToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialcupToCubicinch(value);
            }
        }


        else if (fromType.equals("Imperial fluid ounce")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialfluidounceToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialfluidounceToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialfluidounceToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialfluidounceToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialfluidounceToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialfluidounceToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialfluidounceToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialfluidounceToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialfluidounceToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialfluidounceToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.ImperialfluidounceToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.ImperialfluidounceToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.ImperialfluidounceToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.ImperialfluidounceToImperialcup(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.ImperialfluidounceToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.ImperialfluidounceToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialfluidounceToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialfluidounceToCubicinch(value);
            }
        }



        else if (fromType.equals("Imperial tablespoon")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialtablespoonToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialtablespoonToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialtablespoonToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialtablespoonToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialtablespoonToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialtablespoonToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialtablespoonToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialtablespoonToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialtablespoonToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialtablespoonToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.ImperialtablespoonToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.ImperialtablespoonToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.ImperialtablespoonToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.ImperialtablespoonToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.ImperialtablespoonToImperialfluidounce(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.ImperialtablespoonToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialtablespoonToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialtablespoonToCubicinch(value);
            }
        }



        else if (fromType.equals("Imperial teaspoon")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.ImperialteaspoonToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.ImperialteaspoonToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.ImperialteaspoonToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.ImperialteaspoonToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.ImperialteaspoonToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.ImperialteaspoonToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.ImperialteaspoonToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.ImperialteaspoonToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.ImperialteaspoonToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.ImperialteaspoonToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.ImperialteaspoonToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.ImperialteaspoonToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.ImperialteaspoonToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.ImperialteaspoonToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.ImperialteaspoonToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.ImperialteaspoonToImperialtablespoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.ImperialteaspoonToCubicfoot(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.ImperialteaspoonToCubicinch(value);
            }
        }


        else if (fromType.equals("Cubic foot")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.CubicfootToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.CubicfootToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.CubicfootToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.CubicfootToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.CubicfootToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.CubicfootToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.CubicfootToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.CubicfootToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.CubicfootToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.CubicfootToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.CubicfootToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.CubicfootToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.CubicfootToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.CubicfootToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.CubicfootToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.CubicfootToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.CubicfootToImperialteaspoon(value);
            }else if (toType.equals("Cubic inch")) {
                result = volume.CubicfootToCubicinch(value);
            }
        }



        else if (fromType.equals("Cubic inch")) {
            if (toType.equals("US liquid gallon")) {
                result = volume.CubicinchToUSliquidgallon(value);
            } else if (toType.equals("US liquid quart")) {
                result = volume.CubicinchToUSliquidquart(value);
            }else if (toType.equals("US liquid pint")) {
                result = volume.CubicinchToUSliquidpint(value);
            }else if (toType.equals("US legal cup")) {
                result = volume.CubicinchToUSlegalcup(value);
            }else if (toType.equals("US fluid ounce")) {
                result = volume.CubicinchToUSfluidounce(value);
            }else if (toType.equals("US tablespoon")) {
                result = volume.CubicinchToUStablespoon(value);
            }else if (toType.equals("US teaspoon")) {
                result = volume.CubicinchToUSteaspoon(value);
            }else if (toType.equals("Cubic meter")) {
                result = volume.CubicinchToCubicmeter(value);
            }else if (toType.equals("Liter")) {
                result = volume.CubicinchToLiter(value);
            }else if (toType.equals("Milliliter")) {
                result = volume.CubicinchToMilliliter(value);
            }else if (toType.equals("Imperial gallon")) {
                result = volume.CubicinchToImperialgallon(value);
            }else if (toType.equals("Imperial quart")) {
                result = volume.CubicinchToImperialquart(value);
            }else if (toType.equals("Imperial pint")) {
                result = volume.CubicinchToImperialpint(value);
            }else if (toType.equals("Imperial cup")) {
                result = volume.CubicinchToImperialcup(value);
            }else if (toType.equals("Imperial fluid ounce")) {
                result = volume.CubicinchToImperialfluidounce(value);
            }else if (toType.equals("Imperial tablespoon")) {
                result = volume.CubicinchToImperialtablespoon(value);
            }else if (toType.equals("Imperial teaspoon")) {
                result = volume.CubicinchToImperialteaspoon(value);
            }else if (toType.equals("Cubic foot")) {
                result = volume.CubicinchToCubicfoot(value);
            }
        }
        return result;
    }
}