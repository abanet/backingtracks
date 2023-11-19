package com.backingtrackstoimprovise.especificaciones;

public class NotEspecificacion<T> implements Especificacion<T> {
    private Especificacion<T> especificacionANegar;
    public NotEspecificacion(Especificacion<T> especificacionANegar) {
        this.especificacionANegar = especificacionANegar;
    }

    @Override
    public boolean seCumpleEn(T context) {
        return !especificacionANegar.seCumpleEn(context);
    }
}
