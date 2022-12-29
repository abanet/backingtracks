package com.backingtrackstoimprovise.backingtracks.servicio;

import com.backingtrackstoimprovise.backingtracks.dto.BackingtrackDto;
import com.backingtrackstoimprovise.backingtracks.repositorio.BackingtrackRepositorio;
import com.backingtrackstoimprovise.backingtracks.utilidades.ConversorEntityToBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackingtrackServicioImpl implements BackingtrackServicio {

    @Autowired
    BackingtrackRepositorio backingtrackRepositorio;


    @Override
    public List<BackingtrackDto> obtenerTodosLosVideos() {
        return ConversorEntityToBean.backingtrackToBackingTrackDtoList(
                backingtrackRepositorio.findAll()
        );
    }
}
