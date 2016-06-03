package com.androiddemoapp;

import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.androiddemoapp.activities.HomeActivity;

/**
  @author Karthik
 */
public class TestFragment extends ListFragment implements AdapterView.OnItemClickListener {
Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.listfragment,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext=getActivity();
        ArrayAdapter adapter = ArrayAdapter.createFromResource(mContext, R.array.topic_names, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=null;
       switch (position){
           case 0:
               intent=new Intent(mContext, HomeActivity.class);
               startActivity(intent);
               break;
       }
    }
}
