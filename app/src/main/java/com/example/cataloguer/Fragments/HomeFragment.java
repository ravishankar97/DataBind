package com.example.cataloguer.Fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cataloguer.R;

import java.util.zip.Inflater;


public class HomeFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_home,container,false);

//        RecyclerView recyclerView = fragmentHomeBinding.categories;
//        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
//
//        recyclerView.setHasFixedSize(true);
//        //recyclerView.setAdapter(new CategoryListAdapter());
//
//
//        fragmentHomeBinding.textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_itemListFragment);
//
//            }
//        });
        return view;


    }
}
