package org.example.unicode.config;

import org.example.unicode.model.Unicode;
import org.example.unicode.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Set<Character> unicodeSet = new HashSet<>();

        // Tilføj eksempler på Unicode-tegn til sættet
        for (char c = 'A'; c <= 'Z'; c++) { // Store bogstaver A-Z
            unicodeSet.add(c);
        }
        for (char c = 'a'; c <= 'z'; c++) { // Små bogstaver a-z
            unicodeSet.add(c);
        }

        unicodeSet.forEach(character -> { //itererer gennem mit set
            Unicode entity = new Unicode(character); //opretter nyt unicode objekt for hvert tegn
            unicodeRepository.save(entity); //gemmer til databasen
        });

        System.out.println("Saved to database succesfully");
    }
}
