package com.backingtrackstoimprovise.repositorios;

import com.backingtrackstoimprovise.modelo.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepositorio  extends JpaRepository<Video, Integer> {
    List<Video> findAllBy();
}
