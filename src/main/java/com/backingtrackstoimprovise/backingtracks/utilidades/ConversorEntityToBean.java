package com.backingtrackstoimprovise.backingtracks.utilidades;

import java.util.*;
import com.backingtrackstoimprovise.backingtracks.dto.BackingtrackDto;
import com.backingtrackstoimprovise.backingtracks.excepciones.BackingGeneralException;
import com.backingtrackstoimprovise.backingtracks.modelo.Backingtrack;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


/*
 * Conversor Entity a Bean
 */
public final class ConversorEntityToBean {

	private ConversorEntityToBean() {
		throw new BackingGeneralException("ConversorEntityToBean no se puede instanciar");
	}

	public static BackingtrackDto backingtrackToBackingtrackDto(Backingtrack backingtrack) {
		var backingtrackDto = new BackingtrackDto();
		backingtrackDto.setId(backingtrack.getId());
		backingtrackDto.setTitulo(backingtrack.getTitulo());
		backingtrackDto.setUrl(Youtube.urlVideoConCodigo(backingtrack.getUrl()));
		backingtrackDto.setFechaCatalogacion(backingtrack.getFechaCatalogacion());
		backingtrackDto.setBpm(backingtrack.getBpm());
		backingtrackDto.setTono(backingtrack.getTono());
		backingtrackDto.setPuntuacion(backingtrack.getPuntuacion());
		return backingtrackDto;
	}

	public static List<BackingtrackDto> backingtrackToBackingTrackDtoList(List<Backingtrack> listaBackingtrack) {
		return listaBackingtrack
				.stream()
				.map(ConversorEntityToBean::backingtrackToBackingtrackDto)
				.toList();
	}



}
