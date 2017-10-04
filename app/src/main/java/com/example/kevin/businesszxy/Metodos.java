package com.example.kevin.businesszxy;

/**
 * Created by Kevin Ariza on 03/10/2017.
 */

public class Metodos {
    public static double total(int quant, boolean isWoman, boolean isMan, boolean isSneaker, boolean isClasic, boolean isNike, boolean isAdidas, boolean isPuma){
        double result = 0;
        if (isMan == true && isSneaker == true && isNike == true){
            result = quant * 120000;
        }else if(isMan == true && isSneaker == true && isAdidas == true){
            {
                result = quant * 140000;
            }
        }else if(isMan == true && isSneaker == true && isPuma == true){
            {
                result = quant * 130000;
            }
        }else if(isMan == true && isClasic == true && isNike == true){
            {
                result = quant * 50000;
            }
        }else if(isMan == true && isClasic == true && isAdidas == true){
            {
                result = quant * 80000;
            }
        }else if(isMan == true && isClasic == true && isPuma == true){
            {
                result = quant * 100000;
            }
        }else if(isWoman == true && isSneaker == true && isNike == true){
            {
                result = quant * 100000;
            }
        }else if(isWoman == true && isSneaker == true && isAdidas == true){
            {
                result = quant * 130000;
            }
        }else if(isWoman == true && isSneaker == true && isPuma == true){
            {
                result = quant * 110000;
            }
        }else if(isWoman == true && isClasic && isNike == true){
            {
                result = quant * 60000;
            }
        }else if(isWoman == true && isClasic && isAdidas == true){
            {
                result = quant * 70000;
            }
        }else if(isWoman == true && isClasic && isPuma == true){
            {
                result = quant * 120000;
            }
        }
        return result;
    }
}
