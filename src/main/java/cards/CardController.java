package cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @RequestMapping("/")
    public String getCards() {
        return "All the cards";
    }

    @RequestMapping("/name/{name}")
    public Card getCardByName(@RequestParam String name) {
        return cardRepository.getCardByName(name);
    }
}
