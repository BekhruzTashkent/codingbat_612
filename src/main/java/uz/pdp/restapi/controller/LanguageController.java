package uz.pdp.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.restapi.entity.Language;
import uz.pdp.restapi.payload.ApiResponse;
import uz.pdp.restapi.service.LanguageService;

@RestController
public class LanguageController {

    @Autowired
    LanguageService languageService;

    @PostMapping("api/addLanguage")
    public ApiResponse addLanguage(@RequestBody Language language){
        languageService.addLanguage(language);
        return new ApiResponse("language added", true);
    }

}
