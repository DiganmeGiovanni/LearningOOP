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

package com.learningoop.practica10_LecturaDeTeclado;

/**
 *      - - - AppLectura - - -
 * Utilizando la clase 'Lectura'(Sin instanciar objetos), solicitar
 * un dato de cada tipo al usuario por teclado y mostrarselos al final.
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class AppLectura 
{
    public static void main(String[] args) 
    {
        int intD;
        short shortD;
        long longD;
        float floatD;
        double doubleD;
        String stringD;
        char charD;
        
        System.out.println("Introdusca un dato de tipo short: ");
        shortD = Lectura.shortD();
        
        System.out.println("Introdusca un dato entero: ");
        intD = Lectura.intD();
        
        System.out.println("Introdusca un dato long: ");
        longD = Lectura.longD();
        
        System.out.println("Introdusca un dato flotante: ");
        floatD = Lectura.floatD();
        
        System.out.println("Introdusca un dato double: ");
        doubleD = Lectura.doubleD();
        
        System.out.println("Introdusca un dato char: ");
        charD = Lectura.charD();
        
        System.out.print("Introdusca una cadena de caracteres: ");
        stringD = Lectura.stringD();

        System.out.println("Excelente, estos son los datos leidos: ");
        System.out.println("Integer \t Short \t Long \t Float \t Double \t String \t Char");
        System.out.println( intD + " \t " + shortD + " \t " + longD + " \t " + floatD + " \t " + doubleD + " \t " + stringD + " \t " + charD);
    }

}
