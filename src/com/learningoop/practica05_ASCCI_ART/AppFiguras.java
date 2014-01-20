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

package com.learningoop.practica05_ASCCI_ART;

/**
 * Crear un objeto de la clase 'Figuras' y probar el funcionamiento de sus
 * metodos.
 * 
 * @author Aguirre Alvarez J Giovanni
 */
public class AppFiguras 
{
    public static void main(String[] args)
    {
        Figuras obj = new Figuras(8);

        System.out.println("TRIANGULO IZQUIERDO DESCENDENTE:");
        obj.tid(obj.getN(), '▲');

        System.out.println("\nTRIANGULO IZQUIERDO ASCENDENTE:");
        obj.tia(obj.getN(), '^');

        System.out.println("\nTRIANGULO DERECHO DESCENDENTE:");
        obj.tdd(obj.getN(), '*');

        System.out.println("\nTRIANGULO DERECHO ASCENDENTE:");
        obj.tda(obj.getN(), '@');

        System.out.println("\nTRIANGULO INVERTIDO:");
        obj.tinv(obj.getN(),'+');

        System.out.println("\nRELOJ DE ARENA:");
        obj.reloj(obj.getN(), '$');

        System.out.println("\nRELOJ DE ARENA RECURSIVO:");
        obj.relojRecursivo(15, '=', 10);

        System.out.println("Genial !!");

    }

}
