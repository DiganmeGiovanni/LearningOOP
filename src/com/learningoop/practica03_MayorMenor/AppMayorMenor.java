/*
 * Copyright (c) 2014, Owner
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

package com.learningoop.practica03_MayorMenor;

/**
 * - - - EL EJERCICIO CONSISTE EN LO SIGUIENTE - - -
 * Determinar el mayor y menor de tres numeros declarados en tres variables
 * mediante el uso de un objeto de la clase MayorMenor
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class AppMayorMenor 
{
    public static void main(String[] args) 
    {
        MayorMenor obj = new MayorMenor(5, 3);
        
        // Numeros a evaluar:
        int a = 3;
        int b = 8;
        int c = 7;
        int numMayor;
        int numMenor;
        
        //Validar que no sean iguales
        obj.iguales(obj.iguales(a, b), c);
        if (obj.getIguales() == false)
        {
            numMayor = obj.detmayor(obj.detmayor(a, b), c);
            numMenor = obj.detmenor(obj.detmenor(a, b), c);
            System.out.println("El numero mayor es: " + numMayor + " y el numero menor es: " + numMenor);
        } 
        else
        {
            System.out.println("LOS TRES NUMEROS SON IGUALES");
        }
        
    }
}