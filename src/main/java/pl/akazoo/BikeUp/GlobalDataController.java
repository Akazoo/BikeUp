package pl.akazoo.BikeUp;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akazoo.BikeUp.structure.ApplicationData;
import pl.akazoo.BikeUp.structure.Level;
import pl.akazoo.BikeUp.service.impl.UserService;
import pl.akazoo.BikeUp.web.app.AppHomeController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ControllerAdvice(basePackageClasses = {AppHomeController.class})
@RequiredArgsConstructor
public class GlobalDataController {

    private final UserService userService;
    private final ApplicationData applicationData;
    private final Level level;

    @ModelAttribute
    public void globalData(Model model) {
        List<String> didUKnow = applicationData.getAnecdotes();
        Long points = userService.loggedUser().getPoints();
        if (points == null) {
            model.addAttribute("userPoints", 0);
            model.addAttribute("level", level.countLevel(0L));
        }else{
            model.addAttribute("userPoints", points);
            model.addAttribute("level", level.countLevel(points));
        }
        Random random = new Random();
        int chosen = random.nextInt(didUKnow.size());
        model.addAttribute("didUKnow", didUKnow.get(chosen));
        model.addAttribute("logged",userService.loggedUser().getUsername());
    }
}