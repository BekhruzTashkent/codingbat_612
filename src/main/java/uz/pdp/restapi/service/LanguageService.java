package uz.pdp.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.restapi.entity.Language;
import uz.pdp.restapi.payload.ApiResponse;
import uz.pdp.restapi.repository.LanguageRepository;

@Service
public class LanguageService {

    @Autowired
    LanguageRepository languageRepository;

    public ApiResponse addLanguage(Language language){
        boolean existsByName = languageRepository.existsByName(language.getName());
        if(existsByName){
            return new ApiResponse("no such language name", false);
        }

        languageRepository.save(language);
        return new ApiResponse("added", true);

    }

}
