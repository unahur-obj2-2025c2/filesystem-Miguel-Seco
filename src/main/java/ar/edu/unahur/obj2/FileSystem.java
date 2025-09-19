package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private List <IElemento> elementos = new ArrayList<>();

    public void agregarElemento(IElemento unElemento){
        elementos.add(unElemento);

    }

    public void listar(){
        elementos.stream().forEach(e ->e.mostrar(0));
    }
}