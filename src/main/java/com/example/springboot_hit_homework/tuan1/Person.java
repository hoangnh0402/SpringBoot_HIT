package com.example.springboot_hit_homework.tuan1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    private List<Outfit> outfits;
    private List<HairStyle> hairStyles;

    public Person() {

    }

    @Autowired
    public Person(List<Outfit> outfits, List<HairStyle> hairStyles) {
        this.outfits = outfits;
        this.hairStyles = hairStyles;
    }
}
