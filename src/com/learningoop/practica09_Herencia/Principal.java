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
 * - Crear una clase con las propiedades: 'nombre' y 'expediente'
 * - Crear un constructor que reciba estos dos valores como parametro
 * - Crear un constructor sin parametros que asigne valores por default a las propiedades
 *   del objeto
 * - Crear un metodo 'desp()' que muestre por consola los valores de las propiedades
 *   del objeto
 * - Crear metodos accesores y asignadores para las propiedades de la clase y
 *   encapsular estas como privadas.
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class Principal
{
    private int expediente;
    private String nombre;

    public Principal()
    {
        expediente = 0;
        nombre = "Sin nombre";
    }

    public Principal (int expediente, String nombre)
    {
        this.expediente = expediente;
        this.nombre = nombre;
    }
    
    public String desp()
    {
        return "Expediente: " + expediente + "\n"
                + "Nombre: " + nombre + "\n";
    }

    /**
     * @return the expediente
     */
    public int getExpediente()
    {
        return expediente;
    }

    /**
     * @param expediente the expediente to set
     */
    public void setExpediente(int expediente)
    {
        this.expediente = expediente;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

}