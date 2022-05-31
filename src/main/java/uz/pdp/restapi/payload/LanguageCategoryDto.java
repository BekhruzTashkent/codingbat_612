package uz.pdp.restapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LanguageCategoryDto {

    private String language_id;
    private String category_id;

}
