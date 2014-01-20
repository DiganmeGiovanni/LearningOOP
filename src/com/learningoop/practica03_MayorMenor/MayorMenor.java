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
 *      --- El EJERCICIO CONSISTE EN LO SIGUIENTE ---
 * - Crear una clase llamada MayorMenor.
 * - Declarar en ella dos numeros enteros 'a' y 'b'
 * - Crear metodos para realizar las siguientes operaciones con 'a' y 'b':
 *      * Metodo para determinar el mayor de dos numeros
 *      * Metodo para determinar el menor de dos numeros
 *      * Metodo para determinar si dos numeros son iguales
 *      * Metodo para determinar si dos numeros son diferentes
 * - Sobrecargar los metodos anteriores, en esta ocasion trabajaran con 
 *   dos numeros recibidos como parametros
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class MayorMenor 
{
    private int a;
    private int b;
    private boolean sonIguales = false;
    
    public MayorMenor(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public int detmayor ()
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public int detmenor ()
    {
        if (a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    // Funciona para iguales o para saber si son distintos
    public int iguales()
    {
        if (a == b)
        {
            sonIguales = true;
            return a;
        }
        else
        {
            sonIguales = false;
            return b;
        }
    }
    
    public int detmayor (int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public int detmenor (int a, int b)
    {
        if (a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    // Funciona para iguales o para saber si son distintos
    public int iguales(int a, int b)
    {
        if (a == b)
        {
            sonIguales = true;
            return a;
        }
        else
        {
            sonIguales = false;
            return b;
        }
    }
    
    /**
     * Dado que la variable 'sonIguales' es de acceso privado
     * utilizaremos metodos accesores para poder ver su contenido
     * desde fuera de esta clase.
     * 
     * @return El valor de la variable 'sonIguales'
     */
    public boolean getIguales()
    {
        return sonIguales;
    }
}
