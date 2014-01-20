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

package com.learningoop.practica08_Strings;

/**
 * - Declarar un arreglo de Strings
 * - Crear un constructor que inicialice el arreglo y asigne valores a cada posicion
 * - Crear un metodo que despliegue en pantalla el contenido del arreglo
 * - Crear un metodo que ordene (mediante el algoritmo burbuja y el metodo compareTo())
 *   el arreglo
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class Cadenas
{
    String [] cads;

    public Cadenas()
    {
        cads = new String [3];
        cads [0] = "Crisel";
        cads [1] = "Aleks";
        cads [2] = "Claudia";
    }

    public void desp()
    {
        for (String elemento: cads)
        {
            System.out.println(elemento);
        }
    }

    //Metodo de la bubuja
    public void ordena()
    {
        for (int i=0; i<cads.length - 1; i++)
        {
            for (int j=0; j<cads.length-1-i; j++)
            {
                if (cads[j].compareTo(cads[j+1]) > 0)
                {
                    String aux = cads[j];
                    cads [j] = cads [j+1];
                    cads [j+1] = aux;
                }
            }
        }
    }

}
