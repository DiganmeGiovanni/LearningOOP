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

package com.learningoop.practica02_ObjetosComplejos;

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
public class AppOperaciones 
{
    
    public static void main(String[] args) 
    {
        // Creamos un objeto de la clase Operaciones 
        // utilizando el contructor sin parametros
        Operaciones obj = new Operaciones(5, 5);
        
     // Ahora mediante el uso de los metodos sobre cargados
     // hacemos calculos mas complejos.
        
        // TEOREMA DE PITAGORAS
        double m = obj.raiz(obj.suma(obj.potencia(5, 2),obj.potencia(3, 2)));
        System.out.println("El resultado Pitagoras es: " + m);
        
        // FORMULA GENERAL //a=5, b=3, c=7
        // Esfuerzate por entender estas dos lineas de codigo:
        double x1 = obj.division(obj.suma(obj.multiplicacion(-1, 3), obj.raiz(obj.resta(obj.potencia(3, 2), obj.multiplicacion(4, obj.multiplicacion(5, 7))))),obj.multiplicacion(2, 5));
        double x2 = obj.division(obj.resta(obj.multiplicacion(-1,3), obj.raiz(obj.resta(obj.potencia(3, 2), obj.multiplicacion(4, obj.multiplicacion(5, 7))))),obj.multiplicacion(2, 5));
        
        if (obj.sinError == true)
        {
            System.out.println("Los resultados de la formula general son: x1:"+x1+"\tx2:"+x2);
        }
        else
        {
            System.out.println("No se pudo realizar la operacion con esos valores");
            System.out.println(obj.cadena);
        }
        
    }
    
}
