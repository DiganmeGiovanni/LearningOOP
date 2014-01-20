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
 * - Crear una clase que herede de la clase 'Principal'
 * - Declarar de forma privada las propiedades clinica, especialidad, y fecha
 * - Crear un constructor sin parametros que asigne un valor por default para estas
 *   propiedades y llame al constructor sin parametros de la clase padre.
 * - Crear un constructor que reciba como parametros las propiedades propias
 *   de la clase asi como las del constructor parametrizado de la clase padre,
 *   y llame al constructor parametrizado de la clase padre.
 * - Crear un metodo 'desp()' que muestre los valores de las propiedades de la clase
 *   y que ejecute el metodo 'desp()' contenido en la clase padre.
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class Secundaria extends Principal
{
    private String clinica;
    private String especialidad;
    private String fecha;

    public Secundaria ()
    {
        super();
        clinica = "sin clinica";
        especialidad = "Sin especialidad";
        fecha = "Sin fecha";
    }

    public Secundaria (String clinica, String especialidad, String fecha, String nombre, int expediente)
    {
        super(expediente, nombre);
        this.clinica = clinica;
        this.especialidad = especialidad;
        this.fecha = fecha;
    }

    public String desp()
    {
        return super.desp() + "\n" + "Clinica: " + getClinica() +"\n"
                + "Especialidad: " + getEspecialidad() +"\n"
                + "Fecha: " + getFecha() +"\n";
    }

    /**
     * @return the clinica
     */
    public String getClinica()
    {
        return clinica;
    }

    /**
     * @param clinica the clinica to set
     */
    public void setClinica(String clinica)
    {
        this.clinica = clinica;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad()
    {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }

    /**
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

}
