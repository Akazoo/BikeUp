package pl.akazoo.BikeUp.domain.dto;

import lombok.Data;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class UserRegistry {

    @NotBlank(message = "To pole nie może być puste.")
    private String login;
    @NotBlank(message = "To pole nie może być puste.")
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Hasło musi zawierać conajmniej jedna wielka,mała literę, cyfrę oraz znak specjalny. Minimum 8 znaków.")
    private String password;
    @NotBlank(message = "To pole nie może być puste.")
    private String password2;
    @AssertTrue(message = "Potwierdź zapoznanie się z regulaminem.")
    private boolean loyalty;
}