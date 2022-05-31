package uz.pdp.restapi.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TaskDto {

  private String  name;
  private String  text;
  private String  solution;
  private String  hint;
  private String  method;
  private boolean  has_star= true;
  private Integer language_id;


}
