package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.archivos.Archivo;
import ar.edu.unahur.obj2.carpetas.Carpeta;



public class FileSystemTest {
    Archivo txt = new Archivo("Notas", ".txt", 250);
    Archivo pos = new Archivo("posticks.txt", ".txt", 250);
    Archivo notas2 = new Archivo("Notas rapidas.txt", ".txt", 250);
    Archivo dibujo = new Archivo("Dibujo-A", ".jpg", 250);
    Archivo mp3 = new Archivo("Rock", ".mp3", 400);
    Archivo mp31 = new Archivo("Rap.mp3", ".mp3", 400);
    Archivo img = new Archivo("Imagen-A", ".jpg", 600);
    Archivo video = new Archivo("video1", ".mp4", 450);
    Archivo video2 = new Archivo("video-parte-II.mp4", ".mp4", 450);
    Archivo video3 = new Archivo("video-parte-I.mp4", ".mp4", 450);
    Carpeta root = new Carpeta("root");
    Carpeta carpeta1 = new Carpeta("Carpeta A Nivel 1");
    Carpeta carpeta2 = new Carpeta("Carpeta B Nivel 1");
    Carpeta carpeta3 = new Carpeta("Carpeta A Nivel 2");
    FileSystem fs = new FileSystem();

    
    @Test
    void dadoUnaCarpetaRootListarLosArchivosDeSistema() {
        root.agregarElemento(txt);
        root.agregarElemento(dibujo);
        root.agregarElemento(carpeta1);
        carpeta1.agregarElemento(img);
        carpeta1.agregarElemento(mp3);
        root.agregarElemento(carpeta2);
        carpeta2.agregarElemento(video2);
        carpeta2.agregarElemento(carpeta3);
        carpeta3.agregarElemento(notas2);
        carpeta3.agregarElemento(mp31);
        carpeta2.agregarElemento(video3);
        carpeta2.agregarElemento(pos);
        fs.agregarElemento(root);
        fs.listar();
    }

    
}