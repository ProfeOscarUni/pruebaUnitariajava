package com.ejemplo;

public class PicoPlaca {
    public boolean permitir(Ciudad ciudad, Dias dias, String placa){
        boolean resultado = true;
        if (placa==null || placa.length()==0){
            throw new IllegalArgumentException("");
        }
        int ultimoDigito = placa.charAt(placa.length()-1);
        if (ciudad==Ciudad.CALI) {
            switch (dias) {
                case LUNES:
                    resultado = ultimoDigito == 7 || ultimoDigito==8;
                    break;
                case MARTES:
                    resultado = ultimoDigito == 9 || ultimoDigito==0;
                    break;
                case MIERCOLES:
                    resultado = ultimoDigito == 1 || ultimoDigito==2;
                    break;
                case JUEVES:
                    resultado = ultimoDigito == 3 || ultimoDigito==4;
                    break;
                case VIERNES:
                    resultado = ultimoDigito == 5 || ultimoDigito==6;
                    break;
                
            }
            
        }
        return resultado;
    }
}
