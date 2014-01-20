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

package com.learningoop.practica01;

/**
 *                  - - - Introduccion a objetos - - -
 * La primera practica es para mostrar el uso basico de los objetos, en esta
 * practica se crea una clases 'Operaciones' que contiene metodos para realizar
 * operaciones matematicas, posteriormente se instancia desde la clase 
 * 'AppOperaciones'en la cual se muestra como crear objetos y llamar a sus 
 * metodos.
 * 
 * @author Aguirre Alvarez j Giovanni (@DiganmeGiovanni)
 */
public class Operaciones 
{
    
    private int a;
    private int b;
    
    /**
     * Constructor con parametros para la clase Operaciones
     * 
     * @param a El valor que se asignara a la variable 'a'
     * @param b El valor que se asignara a la variable 'b'
     */
    public Operaciones(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public int suma()
    {
        return a + b;
    }
    
    public int resta()
    {
        return a - b;
    }

    public int multiplicacion()
    {
        return a * b;
    }

    public double division()
    {
        return a / b;
    }
    
}
