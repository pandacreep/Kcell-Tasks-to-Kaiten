package kz.kcell.kaiten.controller;

import kz.kcell.kaiten.config.Param;
import kz.kcell.kaiten.services.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/properties")
public class PropertyController {
    private final PropertyService propertyService;

    @GetMapping("/")
    public String checkProperty() {
        propertyService.getSelectedValues(Param.CUSTOM_PROPERTY_ID);
        return "index";
    }

    @GetMapping("/a")
    public String checkProperty2() {
        propertyService.getSelectedValues(23280);
        return "index";
    }
}
