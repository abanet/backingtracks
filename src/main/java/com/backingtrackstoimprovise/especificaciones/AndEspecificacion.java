package com.backingtrackstoimprovise.especificaciones;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class AndEspecificacion<T> implements Especificacion<T> {
    @Singular
    private List<Especificacion<T>> especificacions;

    public AndEspecificacion(List<Especificacion<T>> especs) {
        this.especificacions = especs;
    }

    @Override
    public boolean seCumpleEn(T context) {
        for (Especificacion<T> espec : especificacions) {
            if (!espec.seCumpleEn(context)) {
                return false;
            }
        }
        return true;
    }
}