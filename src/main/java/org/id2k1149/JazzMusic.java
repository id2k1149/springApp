package org.id2k1149;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Soft Jazz");
        songs.add("Blues");
        songs.add("Relax");
    }

    @Override
    public String getSong() {
        return songs.get(0);
    }
}
