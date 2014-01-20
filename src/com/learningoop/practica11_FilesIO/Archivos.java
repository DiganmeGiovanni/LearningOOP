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

package com.learningoop.practica11_FilesIO;
import java.io.*;

/**
 *      - - - FilesIO - - -
 * - Crear una clase capaz de leer el archivo: 'ArchPlano.txt' del proyecto actual
 * - Crear un constructor que se encargue de cargar el archivo.
 * - Crear metodos desplegar el contenido del archivo y editar el archivo (Agregar nuevas lineas)
 * 
 * @author Aguirre A;varez J Giovanni
 */
public class Archivos
{
    File arch;
    BufferedReader brArch;
    PrintWriter printWArch;

    public Archivos()
    {
        // Cargamos el archivo
        arch = new File("ArchPlano.txt");
    }

    public void desplegarArch()
    {
        int i=0;
        String s;
        try {
            brArch = new BufferedReader(new FileReader(arch));
            s = brArch.readLine();
            while (s != null) {
                System.out.println(++i + "\t" + s);
                s = brArch.readLine();
            }
            brArch.close();
        }
        catch (IOException arr) {
            System.out.println("No se pudo acceder a los datos del archivo");
        }
    }

    public void escribirArch()
    {
        try {
            printWArch = new PrintWriter(new FileWriter(arch));
            String s;
            
            System.out.println("Proporciona los datos para el archivo.\nPara salir escriba '**'");
            s = Lectura.stringD();
            while(s != null)
            {
                if(s.equals("*"))
                {
                    break;
                }
                else
                {
                    printWArch.append(s + "\n");
                }
                s = Lectura.stringD();
            }
            printWArch.close();
        }
        catch (IOException ex)
        {
            System.err.println("No se pudieron escribir los datos");
        }
    }

}
