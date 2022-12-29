package com.backingtrackstoimprovise.backingtracks.repositorio;

import com.backingtrackstoimprovise.backingtracks.modelo.Backingtrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackingtrackRepositorio extends JpaRepository<Backingtrack, Integer> {

}
