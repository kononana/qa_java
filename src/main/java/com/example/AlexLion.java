package com.example;

import java.util.List;

public class AlexLion extends Lion{

    public AlexLion(Feline feline) throws Exception{
        super("Самец",  feline);
    }

    public List<String> getFriends() {
       return List.of("зебра Марти", "бегемотиха Глории", "жираф Мелман");
    }
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;

    }
}


