package com.backingtrackstoimprovise.backingtracks.controladores;

import com.backingtrackstoimprovise.backingtracks.dto.BackingtrackDto;
import com.backingtrackstoimprovise.backingtracks.servicio.BackingtrackServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("videos")
public class BackingtracksController {

    @Autowired
    BackingtrackServicio backingtrackServicio;

    @GetMapping("/")
    public ModelAndView inicio() {
        return new ModelAndView("VistaBackingtracksConsulta");
    }

    @GetMapping("listaVideos/")
    @ResponseBody
    public List<BackingtrackDto> listaVideos()  {
        return backingtrackServicio.obtenerTodosLosVideos();
    }

}
