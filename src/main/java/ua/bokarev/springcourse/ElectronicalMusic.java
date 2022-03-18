package ua.bokarev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class ElectronicalMusic implements Music{
    private List<String> tracks = new ArrayList<>();

    {
        tracks.add("Wehhba view of Delth");
        tracks.add("Caligula");
        tracks.add("Why are you so fucking serious");
    }

    @Override
    public List<String> getTracks() {
        return tracks;
    }
}