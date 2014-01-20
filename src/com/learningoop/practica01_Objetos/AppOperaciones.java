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

package com.learningoop.practica01_Objetos;

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
public class AppOperaciones 
{
    
    public static void main(String[] args) 
    {
        // Creamos un objeto de la clase Operaciones 
        // utilizando el contructor con parametros
        Operaciones obj = new Operaciones(5, 15);
        
        // Llamamos a los metodos del objeto
        System.out.println("Suma: " + obj.suma());
        System.out.println("Resta: " + obj.resta());
        System.out.println("Multiplicacion: " + obj.multiplicacion());
    }
    
}
