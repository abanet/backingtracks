package com.backingtrackstoimprovise.backingtracks.servicio;

import com.backingtrackstoimprovise.backingtracks.dto.BackingtrackDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BackingtrackServicio {

    List<BackingtrackDto> obtenerTodosLosVideos();

}
