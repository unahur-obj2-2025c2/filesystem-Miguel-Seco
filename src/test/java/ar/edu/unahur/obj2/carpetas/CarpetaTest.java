package ar.edu.unahur.obj2.carpetas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.archivos.Archivo;



public class CarpetaTest {

    Archivo txt = new Archivo("notas", ".txt", 250);
    Archivo mp3 = new Archivo("rock", ".mp3", 400);
    Archivo img = new Archivo("foto1", ".jpg", 600);
    Archivo video = new Archivo("video1", ".mp4", 450);
    Carpeta root = new Carpeta("root");
    Carpeta sub1 = new Carpeta("sub-1");
    Carpeta sub2 = new Carpeta("sub-2");



    @Test
    void dadaUnaCarpetaQueContieneSubCarpetasObtengoElTamanioTotal() {
        sub1.agregarElemento(txt);
        sub2.agregarElemento(mp3);
        sub2.agregarElemento(img);
        root.agregarElemento(sub1);
        root.agregarElemento(sub2);
        root.agregarElemento(video);

        assertEquals(1700,root.tamanio());
        assertEquals(250,sub1.tamanio());
        assertEquals(1000,sub2.tamanio());
    }



    @Test
    void dadaUnaCarpetaQueContieneSubCarpetasObtengoElArchivoMasPesado() {
        sub1.agregarElemento(txt);
        sub2.agregarElemento(mp3);
        sub2.agregarElemento(img);
        root.agregarElemento(sub1);
        root.agregarElemento(sub2);
        root.agregarElemento(video);

        assertEquals(img,root.archivoMasPesado());
    }
}