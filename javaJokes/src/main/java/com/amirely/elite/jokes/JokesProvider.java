package com.amirely.elite.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesProvider {

    private List<String> jokeList;

    public JokesProvider() {
        setupJokeList();
    }

    private void setupJokeList() {
        jokeList = new ArrayList<>();
        jokeList.add("Chuck Norris solved the Travelling Salesman problem in O(1) time. Here's the pseudo-code: Break salesman into N pieces. Kick each piece to a different city.");
        jokeList.add("Chuck Norris doesn't actually write books, the words assemble themselves out of fear.");
        jokeList.add("Chuck Norris' house has no doors, only walls that he walks through.");
        jokeList.add("Chuck Norris can win in a game of Russian roulette with a fully loaded gun.");
        jokeList.add("Chuck Norris breaks RSA 128-bit encrypted codes in milliseconds.");
        jokeList.add("What does a subatomic duck say? Quark.");
        jokeList.add("Linux: Born to be root. Windows: Born to re-boot");
        jokeList.add("In a world without fences and walls... who needs Gates and Windows?");
        jokeList.add("What do computers and air conditioners have in common? They both become useless when you open windows.");
        jokeList.add("Chuck Norris can do a wheelie on a unicycle.");
    }

    public String tellMeAJoke() {
        Random random = new Random();
        int randomNumber = random.nextInt(jokeList.size());
        System.out.println(String.valueOf(randomNumber));

        return jokeList.get(randomNumber);
    }
}
