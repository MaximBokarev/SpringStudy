package ua.bokarev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> tracks = new ArrayList<>();

    {
        tracks.add("Hungarian Rhapsody");
        tracks.add("Nutcracker");
        tracks.add("Seasons");
    }

    @Override
    public List<String> getTracks() {
        return tracks;
    }
}