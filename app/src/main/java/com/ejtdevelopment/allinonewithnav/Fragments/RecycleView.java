package com.ejtdevelopment.allinonewithnav.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejtdevelopment.allinonewithnav.Adapters.RecycleViewAdapter;
import com.ejtdevelopment.allinonewithnav.ModelClass.RecycleViewModel;
import com.ejtdevelopment.allinonewithnav.R;
import java.util.ArrayList;

public class RecycleView extends Fragment {

    RecyclerView recyclerView;
    ArrayList<RecycleViewModel> list = new ArrayList<>();

    public RecycleView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recycle_view, container, false);

        recyclerView = view.findViewById(R.id.RecycleView);

        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));

        RecycleViewAdapter adapter = new RecycleViewAdapter(list,getContext());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        return view;
    }
}