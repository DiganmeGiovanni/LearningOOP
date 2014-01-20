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

package com.learningoop.practica02;

/**
 *                  - - - Introduccion a objetos 2 - - -
 * Segunda parte de la practica 01, en este caso se muestra la utilizacion de
 * objetos de una manera mas compleja, tambien se muestra como pasar el resultado
 * de algun metodo como parametro para otro. Asi como el uso de metodos definidos
 * en la clase Math de la libreria Java, por otro lado se muestra el uso de metodos
 * sobre-cargados
 * 
 * @author Aguirre Alvarez j Giovanni (@DiganmeGiovanni)
 */
public class Operaciones 
{
    
    private double a;
    private double b;
    
    public boolean sinError = true;
    public String cadena;
    
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
    
    public double suma()
    {
        return a + b;
    }
    
    public double resta()
    {
        return a - b;
    }

    public double multiplicacion()
    {
        return a * b;
    }

    public double division()
    {
        return a / b;
    }
    

    // Ahora sobrecargamos los metodos anteriores, es decir
    // los declaramos nuevamente pero con diferente numero de parametros
    
    public double suma(double a, double b)
    {
        return a+b;
    }

    public double resta(double a, double b)
    {
        return a-b;
    }

    public double multiplicacion(double a, double b)
    {
        return a*b;
    }

    public double division(double a, double b)
    {
        if (b == 0)
        {
            cadena = "NO EXISTE LA DIVISION SOBRE CERO";
            sinError = false;
            return 0.0;
        }
        else
        {
            return a/b;
        }
    }

    public double raiz(double a)
    {
        if (a <= 0)
        {
            cadena = "error... no hay raices imaginarias";
            sinError = false;
            return 0.0;
        }
        else
        {
            return Math.sqrt(a);
        }
    }

    /**
     * Eleva 'a' a la potencia 'b'
     */
    public double potencia(double a, double b)
    {
        return Math.pow(a, b);
    }
}
