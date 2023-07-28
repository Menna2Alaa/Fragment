package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ApplicationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_application, container, false);
    }
    public ArrayList<FragmentObject> createFragments() {
        ArrayList<FragmentObject> fragments = new ArrayList<FragmentObject>();
        fragments.add(new FragmentObject("Fragment 1", "This is the first fragment",R.drawable.games_24));
        fragments.add(new FragmentObject("Fragment 2", "This is the second fragment",R.drawable.baseline_category_24));
        fragments.add(new FragmentObject("Fragment 3", "This is the third fragment",R.drawable.games_24));
        fragments.add(new FragmentObject("Fragment 4", "This is the fourth fragment",R.drawable.games_24));
        fragments.add(new FragmentObject("Fragment 5", "This is the fifth fragment",R.drawable.games_24));
        fragments.add(new FragmentObject("Fragment 6", "This is the sixth fragment",R.drawable.baseline_category_24));
        fragments.add(new FragmentObject("Fragment 7", "This is the seventh fragment",R.drawable.baseline_category_24));
        fragments.add(new FragmentObject("Fragment 8", "This is the eighth fragment",R.drawable.baseline_category_24));
        fragments.add(new FragmentObject("Fragment 9", "This is the ninth fragment",R.drawable.baseline_category_24));
        fragments.add(new FragmentObject("Fragment 10", "This is the tenth fragment",R.drawable.baseline_category_24));
        return fragments;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerview =view.findViewById(R.id.application);
        Adapter my_adapter=new Adapter(createFragments());
        recyclerview.setAdapter(my_adapter);

        TextView app_name=view.findViewById(R.id.app_name);
        TextView app_description=view.findViewById(R.id.app_description);

        Button btn=view.findViewById(R.id.nav_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = app_name.getText().toString();
                String des = app_description.getText().toString();
                NavDirections action = ApplicationFragmentDirections.actionApplicationFragmentToNewFragment2(name,des);
                Navigation.findNavController(view).navigate(action);
                btn.setVisibility(View.GONE);
            }
        });
    }
}