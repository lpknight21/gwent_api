package cards;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;

public class CardRepository {

    @Autowired
    private DB mongoDb;

    public Card getCardByName(String name) {
        DBCollection cardCollection = mongoDb.getCollection("cards");
        BasicDBObject fields = new BasicDBObject();
        fields.put("name", name);
        DBObject cardJson = cardCollection.findOne(fields);
        Card card = new Gson().fromJson(cardJson.toString(), Card.class);
        return card;
    }
}
