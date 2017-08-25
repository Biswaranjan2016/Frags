package com.example.happy.frags;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragInclusion extends Fragment {


    public FragInclusion() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,
                             Bundle savedInstance){
        return layoutInflater.inflate(R.layout.fragment_frag_inclusion,container,false);
    }

}
