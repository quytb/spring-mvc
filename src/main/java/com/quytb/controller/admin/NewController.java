package com.quytb.controller.admin;

import com.quytb.model.NewModel;
import com.quytb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "newControllerOfAdmin")
public class NewController {
    @Autowired
    private INewService newService;

    @GetMapping(value = "/quan-tri/bai-viet/danh-sach")
    public ModelAndView showList(@ModelAttribute("model") NewModel model) {
        ModelAndView mav = new ModelAndView("admin/new/list");
        model.setListResult(newService.findAll());
        mav.addObject("model", model);
        return mav;
    }
}
