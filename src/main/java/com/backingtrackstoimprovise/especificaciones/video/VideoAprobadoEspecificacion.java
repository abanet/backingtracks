package com.backingtrackstoimprovise.especificaciones.video;

import com.backingtrackstoimprovise.especificaciones.Especificacion;

public class VideoAprobadoEspecificacion implements Especificacion<VideoContext> {
    @Override
    public boolean seCumpleEn(VideoContext context) {
        return context.getVideo().getAprobado();
    }
}
