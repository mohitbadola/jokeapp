package mohit.spring.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class jokeserviceImpl implements jokeservice {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public jokeserviceImpl() {
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
