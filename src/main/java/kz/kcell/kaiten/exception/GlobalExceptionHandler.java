package kz.kcell.kaiten.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@Controller
public class GlobalExceptionHandler {
    @ExceptionHandler
    public String handlerException(HttpClientErrorException e, Model model) {
        List<String> strings = new ArrayList<>();
        strings.add("Ошибка авторизации");
        strings.add(e.getMessage().toString());
        model.addAttribute("strings", strings);
        return "errors/error-strings";
    }

    @ExceptionHandler
    public String handlerException(ResourceAccessException e, Model model) {
        List<String> strings = new ArrayList<>();
        strings.add("Ошибка доступа к ресурсу");
        strings.add(e.getMessage().toString());
        strings.add("Попробуйте изменить настройки прокси");
        model.addAttribute("strings", strings);
        return "errors/error-strings";
    }

    @ExceptionHandler
    public String handlerException(Exception e, Model model) {
        ErrorInfo data = new ErrorInfo();
        data.setInfo(e.getMessage());
        model.addAttribute("error", e);
        return "errors/error-details";
    }
}
