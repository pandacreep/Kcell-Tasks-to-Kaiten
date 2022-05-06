package kz.kcell.kaiten.controller;

import kz.kcell.kaiten.config.Param;
import kz.kcell.kaiten.dto.CardAddDto;
import kz.kcell.kaiten.dto.CardRetriveDto;
import kz.kcell.kaiten.dto.PropertySelectValueDto;
import kz.kcell.kaiten.model.CardRetrive;
import kz.kcell.kaiten.services.CardServices;
import kz.kcell.kaiten.services.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/cards")
public class CardController {
    private final CardServices cardServices;
    private final PropertyService propertyService;

    @GetMapping("/0")
    public String showTestCard(Model model) {
        CardRetriveDto card = cardServices.getCardById(3143856);
        model.addAttribute("card", card);
        return "card";
    }

    @GetMapping("/{id}")
    public String showCardById(@PathVariable int id, Model model) {
        CardRetriveDto card = cardServices.getCardById(id);
        model.addAttribute("card", card);
        return "card";
    }

    @GetMapping("/add")
    public String showAddCardPage(Model model) {
        List<PropertySelectValueDto> selectedValues = propertyService.getSelectedValues(Param.CUSTOM_PROPERTY_ID);
        model.addAttribute("selectedValues", selectedValues);
        return "card_add";
    }

    @PostMapping("/add")
    public String add(@Valid CardAddDto card,
                      BindingResult validationResult,
                      RedirectAttributes attributes) {
        attributes.addFlashAttribute("card", card);
        if (validationResult.hasErrors()) {
            attributes.addFlashAttribute("errors", validationResult.getFieldErrors());
            return "redirect:/cards/add";
        }
        CardRetrive cardCreated = cardServices.add(card);
        return "redirect:/cards/" + cardCreated.getId();
    }
}
