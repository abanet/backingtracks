package com.backingtrackstoimprovise.controladores;

import com.backingtrackstoimprovise.repositorios.VideoRepositorio;
import com.backingtrackstoimprovise.servicios.APIYoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @Autowired
    private APIYoutubeService apiYoutubeService;

    @Autowired
    private VideoRepositorio videoRepositorio;

    @GetMapping("/")
    public String index() {
        var videos = videoRepositorio.findAll();


        return "index";
    }

    @GetMapping("/v")
    public String informacionVideoYoutube() {
        return apiYoutubeService.getVideoDetails("PqK-b9-JxCA");
    }
}
