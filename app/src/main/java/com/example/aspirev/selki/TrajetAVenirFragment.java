package com.example.aspirev.selki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lenovo on 02/03/2018.
 */

public class TrajetAVenirFragment extends android.support.v4.app.Fragment {
    public TrajetAVenirFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.mes_trajets_a_venir,container,false);
        return rootView;
    }
}
