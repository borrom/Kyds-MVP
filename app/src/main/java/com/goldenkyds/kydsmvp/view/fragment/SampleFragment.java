package com.goldenkyds.kydsmvp.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldenkyds.kydsmvp.R;
import com.goldenkyds.kydsmvp.view.adapter.SampleRecycleViewAdapter;

/**
 * Created by borrom on 6/25/15.
 */
public class SampleFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private String[] datas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sample_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.sample_recycle);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        SampleRecycleViewAdapter adapter = new SampleRecycleViewAdapter();
        mRecyclerView.setAdapter(adapter);
    }

    public SampleFragment setDataToRecycleView(){

        return this;
    }
}
