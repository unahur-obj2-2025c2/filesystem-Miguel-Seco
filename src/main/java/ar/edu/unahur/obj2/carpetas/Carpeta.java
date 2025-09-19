package ar.edu.unahur.obj2.carpetas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.IElemento;

public class Carpeta implements IElemento{
    private String nombre;
    private List<IElemento> elementosDelSistema = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(IElemento unElemento){
        elementosDelSistema.add(unElemento);
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public Integer tamanio() {
        return elementosDelSistema.stream().mapToInt(e -> e.tamanio()).sum();
    }
 
    @Override
    public void mostrar(Integer identacion) {
        System.out.println( " " + nombre + " ( "+ this.tamanio() +" - Bytes ) ")  ;
        elementosDelSistema.stream().forEach(e -> e.mostrar(1));
    }

    @Override
    public IElemento archivoMasPesado() {
        return elementosDelSistema.stream()
                    .map(e -> e.archivoMasPesado())
                    .max(Comparator.comparingInt(e -> e.tamanio()))
                    .orElseThrow();
    }

    
}