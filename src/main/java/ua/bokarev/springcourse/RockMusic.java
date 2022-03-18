package ua.bokarev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> tracks = new ArrayList<>();

    {
        tracks.add("Wind cry Mary");
        tracks.add("Wind of change");
        tracks.add("Show must go on");
    }

    @Override
    public List<String> getTracks() {
        return tracks;
    }
}
