package com.backingtrackstoimprovise.especificaciones.video;

import com.backingtrackstoimprovise.modelo.Video;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideoContext {
    private Video video;
}
