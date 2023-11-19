package com.backingtrackstoimprovise.especificaciones;

public interface Especificacion<T> {
    boolean seCumpleEn(T context);
}