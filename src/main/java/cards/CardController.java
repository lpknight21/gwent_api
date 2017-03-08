package cards;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @RequestMapping("/")
    public String getCards() {
        return "All the cards";
    }
}
