package com.backingtrackstoimprovise.backingtracks.utilidades;

import com.backingtrackstoimprovise.backingtracks.excepciones.BackingGeneralException;

public final class Youtube {

    private Youtube() {
        throw new BackingGeneralException("Youtube no se puede instanciar");
    }

    public static String urlVideoConCodigo(String codigo) {
        return "https://www.youtube.com/watch?v=".concat(codigo);
    }

}
