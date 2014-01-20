/*
 * Copyright (c) 2014, Giovanni Aguirre
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.learningoop.practica11_FilesIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *      - - - CLASE DE LECTURA DE DATOS - - -
 * Construir una clase con metodos estaticos capaz de leer entradas
 * de datos por el teclado y validar el formato correcto para cada tipo
 * de datos primitivos.
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class Lectura 
{
    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader flujo  = new BufferedReader(isr);
    
    public static int intD()
    {
        boolean datoCorrecto = false;
        int numLeido=0;
        do {
            try {
                numLeido = Integer.parseInt(flujo.readLine());
                datoCorrecto = true;
            }
            catch(Exception err) {
                System.out.println("formato inapropiado, introduzca un numero entero valido.");
            }
        } while (!datoCorrecto);
        return numLeido;
    }
    
    public static short shortD()
    {
        boolean datoCorrecto = false;
        short numLeido=0;
        do {
            try {
                numLeido = Short.parseShort(flujo.readLine());
                datoCorrecto = true;
            }
            catch(Exception err) {
                System.out.println("formato inapropiado, introduzca un dato valido.");
            }
        } while (!datoCorrecto);
        return numLeido;
    }
    
    public static long longD()
    {
        boolean datoCorrecto = false;
        long datoLeido = 0;
        do {
            try {
                datoLeido = Long.parseLong(flujo.readLine());
                datoCorrecto = true;
            }
            catch(Exception err) {
                System.out.println("formato inapropiado, introduzca un dato valido.");
            }
        } while (!datoCorrecto);
        return datoLeido;
    }
    
    public static float floatD()
    {
        boolean datoCorrecto = false;
        float datoLeido = 0;
        do {
            try {
                datoLeido = Float.parseFloat(flujo.readLine());
                datoCorrecto = true;
            }
            catch(Exception err) {
                System.out.println("formato inapropiado, introduzca un dato valido.");
            }
        } while (!datoCorrecto);
        return datoLeido;
    }
    
    public static double doubleD()
    {
        boolean datoCorrecto = false;
        double datoLeido = 0;
        do {
            try {
                datoLeido = Double.parseDouble(flujo.readLine());
                datoCorrecto = true;
            }
            catch(Exception err) {
                System.out.println("formato inapropiado, introduzca un dato valido.");
            }
        } while (!datoCorrecto);
        return datoLeido;
    }
    
    public static String stringD()
    {
        boolean datoCorrecto = false;
        String datoLeido = "";
        do {
            try {
                //flujo.read(); // Eliminar basura del Buffer
                datoLeido = flujo.readLine();
                datoCorrecto = true;
            }
            catch(IOException err) {
                System.out.println("formato inapropiado, introduzca un dato valido.");
            }
        } while (!datoCorrecto);
        return datoLeido;
    }
    
    public static char charD()
    {
        boolean datoCorrecto = false;
        char datoLeido = ' ';
        do {
            try {
                datoLeido = (char)flujo.read();
                datoCorrecto = true;
            }
            catch(IOException err) {
                System.out.println("formato inapropiado, introduzca un dato valido.");
            }
        } while (!datoCorrecto);
        return datoLeido;
    }

}
