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

package com.learningoop.practica04;

/**
 *      - - - EL EJERCICIO ES EL SIGUIENTE - - -
 * 
 * Mediante el uso de la instruccion 'switch', crear un metodo 'califNumerica'
 * que en base a una determinada calificacion imprima un mensaje, los rangos
 * los siguiente:
 *      - (0-5) 'Bajo rendimiento'
 *      - (6-8) 'Rendimiento aceptable'
 *      - (9)   'Rendimiento alto'
 *      - (10)  'Excelente rendimiento
 *      - default-case 'Error de dato'
 * 
 * Mediante el uso de la intruccion 'if-else'
 * Crear otro metodo que en base a una determinada calificacion 
 * (Dada en letra/char) imprima lo siguiente:
 *      - (A-D) 'Bajo rendimiento'
 *      - (E-F) 'Rendimiento aceptable'
 *      - (G)   'Rendimiento alto'
 *      - (H)  'Excelente rendimiento
 *      - else 'Error de dato'
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class SwitchVSif 
{
    // Calificacion
    private int cf;
    
    // Calificacion con letra
    private char cl = 'A';

    public SwitchVSif()
    {

    }

    public SwitchVSif (int cf, char cl)
    {
        this.cf = cf;
        this.cl = cl;
    }

    public void califNum()
    {
        switch(getCf())
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Bajo rendimiento");
                    break;
            case 6:
            case 7:
            case 8: System.out.println("Rendimiento aceptable");
                    break;
            case 9: System.out.println("Rendimiento alto");
                    break;
            case 10:System.out.println("Excelente rendimiento");
                    break;
            default:System.out.println("Error de dato");
        }
    }

    public void califLetra ()
    {
        if (getCl() >= 'A' && getCl() <= 'D')
        {
            System.out.println("Bajo rendimiento");
        }
        else
        {
            if ( getCl() =='E' || getCl() == 'F')
            {
                System.out.println("Rendimiento aceptable");
            }
            else
            {
                if (getCl() == 'G')
                {
                    System.out.println("Rendimiento alto");
                }
                else
                {
                    if(getCl() == 'H')
                    {
                        System.out.println("Excelente");
                    }
                    else
                    {
                        System.out.println("Error de dato");
                    }
                }
            }
        }
    }

    
  // Accesores y Asignadores:
    
    /**
     * @return the cf
     */
    public int getCf()
    {
        return cf;
    }

    /**
     * @param cf the cf to set
     */
    public void setCf(int cf)
    {
        this.cf = cf;
    }

    /**
     * @return the cl
     */
    public char getCl()
    {
        return cl;
    }

    /**
     * @param cl the cl to set
     */
    public void setCl(char cl)
    {
        this.cl = cl;
    }

}
