package uz.pdp.restapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AnswerDto {

    private String text;
    private String task_id;
    private String user_id;
    private String is_correct;

}
