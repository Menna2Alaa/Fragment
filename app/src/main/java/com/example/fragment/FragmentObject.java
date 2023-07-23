package com.example.fragment;

import java.util.ArrayList;
import java.util.List;

public class FragmentObject {

    private String name;
    private String description;
    public FragmentObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static List<FragmentObject> createFragments() {
        List<FragmentObject> fragments = new ArrayList<>();
        fragments.add(new FragmentObject("Fragment 1", "This is the first fragment"));
        fragments.add(new FragmentObject("Fragment 2", "This is the second fragment"));
        fragments.add(new FragmentObject("Fragment 3", "This is the third fragment"));
        fragments.add(new FragmentObject("Fragment 4", "This is the fourth fragment"));
        fragments.add(new FragmentObject("Fragment 5", "This is the fifth fragment"));
        fragments.add(new FragmentObject("Fragment 6", "This is the sixth fragment"));
        fragments.add(new FragmentObject("Fragment 7", "This is the seventh fragment"));
        fragments.add(new FragmentObject("Fragment 8", "This is the eighth fragment"));
        fragments.add(new FragmentObject("Fragment 9", "This is the ninth fragment"));
        fragments.add(new FragmentObject("Fragment 10", "This is the tenth fragment"));
        return fragments;
    }
}