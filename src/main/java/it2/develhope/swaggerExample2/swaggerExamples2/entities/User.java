package it2.develhope.swaggerExample2.swaggerExamples2.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @ApiModelProperty(value = "The first name of the user", example = "john")
    private String firstName;
    @ApiModelProperty(value = "The last name of the user", example = "Doe")
    private String lastName;
    @ApiModelProperty(value = "The city name of the user", example = "London")
    private String city;
    @ApiModelProperty(value = "The place of birth of the user", example = "Glasgow")
    private String placeOfBirth;
}
