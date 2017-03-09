package cards;

import com.mongodb.DB;
import com.mongodb.MongoException;
import com.mongodb.MongoURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

@Configuration
public class MongoConfig {

    private static final String MONGOHQ_URL  = "MONGOHQ_URL";

    @Bean
    public DB getDb() throws UnknownHostException, MongoException {
        MongoURI mongoURI = new MongoURI(System.getenv(MONGOHQ_URL));
        DB db = mongoURI.connectDB();
        db.authenticate(mongoURI.getUsername(), mongoURI.getPassword());
        return db;
    }

    @Bean
    public CardRepository getCardRepository() {
        return new CardRepository();
    }
}
