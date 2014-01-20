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

package com.learningoop.practica09_Herencia;

/**
 * - Crear objetos de la clase Principal y Secundaria,
 * - Crear un arreglo de objetos
 * - Desplegar los valores de cada objeto
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class PrbPrincipal
{
    public static void main(String[] args)
    {
        Principal obj1 = new Principal();
        Secundaria obj2 = new Secundaria();

        System.out.println(obj1.desp());
        System.out.println(obj2.desp());
        
        Principal []arr = new Principal[3];
        arr[0] = new Principal();
        arr[1] = new Secundaria();
        arr[2] = new Principal();

        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i].desp());
            System.out.println("******************************");
        }

        Secundaria tmp = (Secundaria)arr[1];

    }

}
