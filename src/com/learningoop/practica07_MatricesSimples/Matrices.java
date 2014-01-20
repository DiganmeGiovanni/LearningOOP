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

package com.learningoop.practica07_MatricesSimples;

/**
 *      --- Muy simple ---
 * - Declarar una matriz de numeros enteros.
 * - Crear un constructor que reciba los valores de 'n' y 'm' como parametro e
 *   inicialice la matriz con estas diemenciones y la llene con el metodo cargarMatriz()
 * - Crear un metodo llamado cargarMatriz(), que se encargue de colocar valores
 *   enteros aleatorios en la matriz
 * - Crear un metodo que despligue en la consola los valores de la matriz
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class Matrices
{
    int [][] mat;

    public Matrices (int n, int m)
    {
        mat = new int [n] [m];
        cargaMatriz();
    }

    public void cargaMatriz()
    {
        for (int i=0; i<mat.length; i++)
        {
            for (int j=0; j<mat[i].length; j++)
            {
                mat [i][j] = (int)(Math.random()*100);
            }
        }
    }

    public void desp()
    {
        for (int i=0; i<mat.length; i++)
        {
            for (int j=0; j<mat[i].length; j++)
            {
                System.out.print(mat [i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
