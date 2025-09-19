package ar.edu.unahur.obj2.archivos;

import ar.edu.unahur.obj2.IElemento;

public class Archivo implements IElemento {
    private String nombre;
    private String extension;
    private Integer tamanio;

    public Archivo(String nombre, String extension, Integer tamanio) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public Integer tamanio() {
        return this.tamanio;
    }

    @Override
    public void mostrar(Integer identacion) {
        System.out.println( "   |-"+this.nombre() + this.extension());
    }

    private String extension() {
        return extension;
    }

    @Override
    public IElemento archivoMasPesado() {
        return this;
    }

}