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

package com.learningoop.practica05;

/**
 *      - - - EJERCICIO - - -
 * * Crear una variable privada de tipo int llamada 'n'.
 * * Crear un constructor que reciba un valor para 'n' como parametro
 * * Crear metodos que a base de impresion de caracteres y ciclos for dibujen 
 *   las siguientes figuras, (n representa la longitud de los lados de las 
 *   figuras), los metodos reciben como parametro el caracter que utilizaran 
 *   para dibujarlas figuras
 *      - Una linea horizontal
 *      - Un cuadrado
 *      - Un triangulo izquiero descendente
 *      - Un triangulo derecho descendente
 *      - Un triangulo izquiero ascendente
 *      - Un triangulo derecho ascendente
 *      - Un triangulo invertido
 *      - Un reloj de arena
 *      - Un reloj de arena (De manera recursiva) utilizando solo el metodo linea
 *        y el metodo mismo (recursividad)
 * * Sobrecargar los metodos, permitiendo en esta ocasion recibir el valor de 'n'
 *   como parametro
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class Figuras 
{
    private int n;
    
    public Figuras(int n)
    {
        this.n = n;
    }
    
    public String linea(char c)
    {
        String cad = "";
        for (int i=1; i<=n; i++)
        {
            cad = cad + c + " ";
        }
        return cad;
    }

    public String cuadro(char c)
    {
        String cad = "";
        for (int i=1; i<=n; i++)
        {
            cad = cad + linea(n, c) + "\n";
        }
        return cad;
    }

    public String tid(char c)//Triangulo izquierdo descendente
    {
        String cad = "";
        for (int i=0; i<n; i++)
        {
            cad = cad + linea(n - i, c) + "\n";
        }
        return cad;
    }

    public String tia(char c)//Triangulo izquierdo ascendente
    {
        String cad = "";
        for (int i=0; i<n; i++)
        {
            cad = cad + linea(1 + i, c) + "\n";
        }
        return cad;
    }

    public String tdd(char c)//Triangulo derecho descendente
    {
        int aux = 0;//NUMERO DE ESPACIOS EN BLANCO
        String cad = "", cad2 = "", cad3 = "";
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<aux; j++) //Imprimir espacios en blanco
            {
                cad2 = cad2 + " " + " ";
                //System.out.print(" " + " ");//DOS ESPACIOS PARA CUBRIR EL AREA DE CARACTER Y EL ESPACIO ENTRE CADA CARACTER
            }
            cad = linea(n - i, c) + "\n";
            aux++;//incrementar numero de espacios en blanco
            cad3 = cad3 + cad2 + cad;
        }
        return cad3;
    }

    public String tda(char c)//Triangulo derecho ascendente
    {
        String cad = "", cad1 = "";
        for (int i=0; i<n; i++)
        {
            cad1 = "";
            for (int j=n-i; j>1; j--)//Imprimir espacios en blanco
            {
                cad1 = cad1 + " " + " " + " " + " " + " ";
                //System.out.print(" " + " ");//Dos espacios, para el caracter mas su respectivo espacio
            }
            cad = cad + cad1 + linea(1 + i, c) + "\n";
            //System.out.println("");
        }
        return cad;
    }

    public String tinv(char c)//Triangulo invertido
    {
        int aux = 0; String cad = "", cad1="";
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<aux; j++) //Imprimir espacios en blanco
            {
                cad1 =cad1 + " ";
                //System.out.print(" ");
            }
            cad = cad + cad1 + linea(n - i, c) + "\n";
            aux++;//incrementar numero de espacios en blanco
            //System.out.println("");
        }
        return cad;
    }

    public String linea(int n, char c)
    {
        String cad = "";
        for (int i=1; i<=n; i++)
        {
            cad = cad + c + " ";
        }
        System.out.print(cad);
        return cad;
    }

    public void cuadro(int n, char c)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.println(linea(n, c));
        }
    }
    
    public void tid(int n, char c)//Triangulo izquierdo descendente
    {
        for (int i=0; i<n; i++)
        {
            linea(n - i, c);
            System.out.println("");
        }
    }

    public void tia(int n, char c)//Triangulo izquierdo ascendente
    {
        for (int i=0; i<n; i++)
        {
            linea(1 + i, c);
            System.out.println("");
        }
    }

    public void tdd(int n, char c)//Triangulo derecho descendente
    {
        int aux = 0;//NUMERO DE ESPACIOS EN BLANCO
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<aux; j++) //Imprimir espacios en blanco
            {
                System.out.print(" " + " ");//DOS ESPACIOS PARA CUBRIR EL AREA DE CARACTER Y EL ESPACIO ENTRE CADA CARACTER
            }
            linea(n - i, c);
            System.out.println("");
            aux++;//incrementar numero de espacios en blanco
        }
    }

    public void tda(int n, char c)//Triangulo derecho ascendente
    {
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)//Imprimir espacios en blanco
            {
                System.out.print(" " + " ");//Dos espacios, para el caracter mas su respectivo espacio
            }
            linea(1 + i, c);
            System.out.println("");
        }
    }

    public void tinv(int n, char c)//Triangulo invertido
    {
        int aux = 0;
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<aux; j++) //Imprimir espacios en blanco
            {
                System.out.print(" ");
            }
            linea(n - i, c);
            aux++;//incrementar numero de espacios en blanco
            System.out.println("");
        }
    }

    //Reloj de arena
    public void reloj(int n, char c)
    {
        /* PARA LA PARTE SUPERIOR DEL RELOJ DE ARENA UTILIZAMOS PRACTICAMENTE LA MISMA TECNICA
         * QUE PARA EL TRIANGULO INVERTIDO; PARA LA PARTE INFERIOR UTILIZAMOS LA MISMA TECNICA QUE
         * PARA EL TRIANGULO DERECHO ASCENDENTE SOLO QUE EN LA IMPRECION DE ESPACIOS EN BLANCO ELIMINAMOS
         * EL ESPACIO ENTRE CARACTERES.
         */
        int aux = 0;
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j<aux; j++) //Imprimir espacios en blanco
            {
                System.out.print(" ");
            }
            linea(n - i, c);
            aux++;//incrementar numero de espacios en blanco
            System.out.println("");
        }
        //PARTE INFERIOR DEL RELOJ A CONTINUACION:
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)//Imprimir espacios en blanco
            {
                System.out.print(" ");//SOLO UN ESPACIO, YA NO DEJAMOS ESPACIO ENTRE CARACTERES
            }
            linea(1 + i, c);
            System.out.println("");
        }
    }

    //RELOJ EN MODO RECURSIVO,
    public void relojRecursivo(int n, char c, int nb)//nb = numero de blancos
    {
        if (n>0)
        {
            linea (nb, ' ');
            linea (n, c);
            System.out.println("");
            relojRecursivo(n-2, c, nb+1);
            linea (nb, ' ');
            linea (n, c);
            System.out.println("");
        }
    }

    /**
     * Permitimos el acceso a 'n' mediante un metodo accesor
     */
    public int getN()
    {
        return n;
    }
}
