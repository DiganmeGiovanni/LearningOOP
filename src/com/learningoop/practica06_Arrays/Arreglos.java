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

package com.learningoop.practica06_Arrays;

/**
 * - Declarar un arreglo de numeros enteros
 * - Declarar un arreglo de caracteres
 * - Crear una clase que permita manipular arreglos mediante los siguientes metodos
 *      * Desplegar el contenido del arreglo de enteros
 *      * Desplegar el contenido del arreglo de caracteres
 *      - Copiar (Crear una copia de un arreglo)
 *      - Redimensionar el arreglo de enteros
 *      - Agregar un elemento al arreglo de enteros
 *      - Agregar un elemento al arreglo de caracteres
 *      - Ordenar el arreglo de enteros mediante el algoritmo 'burbuja'
 * - Crear un constructor que reciba como parametro el tamño de los arreglos
 *   y los inicialice con datos aleatorios.
 *
 * @author Aguirre Alvarez J Giovanni
 */
public class Arreglos
{
    int [] x;   //Arreglo de enteros
    char [] c;  //Arreglo de caracteres

    public Arreglos ()
    {
        x = new int [3];
        c = new char [3];
        x[0]=65;
        c[0]= (char)x[0];
        x[1]=66;
        c[1]= (char)x[1];
        x[2]=67;
        c[2]= (char)x[2];
    }

    public Arreglos (int n)
    {
        x = new int [n];
        c = new char[n];
        for (int i=0; i<n; i++)
        {
            x[i] = (int)(Math.random() * 100);
            c[i] = (char)x[i];
        }
    }
    

    /**
     * Imprime en pantalla todos los elementos del arreglo de enteros (x)
     */
    public void desp()
    {
        for (int i=0; i<x.length; i++)
        {
            System.out.print(x[i] + " ");
        }
    }

    /**
     * Imprime en pantalla todos los elementos del arreglo de caracteres (c)
     */
    public void despC()
    {
        for (int i=0; i<c.length; i++)
        {
            System.out.print(c[i] + " ");
        }
    }

   /**
    * Crea una copia/replica de un arreglo
    * @param x El arreglo que se pretende duplicar
    */
   public void copia( int [] x )
   {
       this.x = new int [x.length];
       System.arraycopy(x, 0, this.x, 0, x.length);
   }

   public void redimensionArreglo(int n)
   {
       if (n > x.length)
       {
           int [] y = x;
           x = new int [n];
           System.arraycopy(y, 0, x, 0, y.length);
       }
       else
       {
           System.out.println("No se pudo redimensionar");
       }
   }

   /**
    * Agrega un nuevo elemento al arreglo de enteros (redimensiona el arreglo)
    * @param n - El nuevo elemento a agregar en el arreglo.
    */
   public void nvoElemento(int n)
   {
       int [] tmp = new int[x.length + 1];
       int i=0;

       for (i=0; i<x.length; i++)
       {
           tmp[i] = x[i];
       }
       tmp[i] = n;
       this.x = tmp;
   }

   /**
    * Agrega un nuevo elemento al arreglo de caracteres
    * @param n - El caracter que se agregara al arreglo
    */
   public void nvoElementoC(char n)
   {
       char [] tmp = new char[c.length + 1];
       int i=0;

       for (i=0; i<c.length; i++)
       {
           tmp[i] = c[i];
       }
       tmp[i] = n;
       this.c = tmp;
   }

   /**
    * Ordena el arreglo de enteros de menor a mayor (METODO BURBUJA)
    * @param arr - El arreglo que ordenara
    * @return - El arreglo ya ordenado
    */
   public int [] ordenaX(int [] arr)
   {
        for(int i=0; i< x.length-1; i++)
        {
            for(int j= 0; j<x.length-1-i; j++)
            {
                if(x[j] > x[j+1])
                {
                    int aux=x[j];
                    x[j]=x[j+1];
                    x[j+1]=aux;
                }
            }
        }
        return x;
    }

}