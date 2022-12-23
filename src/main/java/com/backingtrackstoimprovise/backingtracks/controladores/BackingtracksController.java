package com.backingtrackstoimprovise.backingtracks.controladores;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BackingtracksController {

    @GetMapping("/")
    public ModelAndView inicio(HttpServletRequest request, HttpSession session) throws Exception {
        return new ModelAndView("VistaBackingtracksConsulta");
    }

}
