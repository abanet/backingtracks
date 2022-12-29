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
@Component
public final class ConversorEntityToBean {

	private ConversorEntityToBean() {
		throw new BackingGeneralException("ConversorEntityToBean no se puede instanciar");
	}

	public static List<BackingtrackDto> backingtrackToBackingTrackDtoList(List<Backingtrack> listaBackingtrack) {
		ModelMapper modelMapper = new ModelMapper();
		return listaBackingtrack
				.stream()
				.map(e->modelMapper.map(e, BackingtrackDto.class))
				.toList();
	}



}
