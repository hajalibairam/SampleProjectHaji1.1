package com.example.hajali.sampleprojecthaji11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hajali.sampleprojecthaji11.People.People;
import com.example.hajali.sampleprojecthaji11.People.PeopleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    List<People> peopleList;
    PeopleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.recycler_view_people);
        peopleList = new ArrayList<>();
        adapter = new PeopleAdapter(getBaseContext(),peopleList);
        adapter.notifyDataSetChanged();
        rv.setLayoutManager( new LinearLayoutManager(getBaseContext()));
        rv.setAdapter(adapter);

        preparePeople();
    }

    private void preparePeople(){
        People p = new People("Eshqin Efendiyev","Dev");
        peopleList.add(p);

        p = new People("Kamandar Marifov","Tec");
        peopleList.add(p);
        p = new People("Selim Kerimov","Hun");
        peopleList.add(p);
        p = new People("Vali Aliyev","Man");
        peopleList.add(p);
        p = new People("Shehriyar Memmedov","Pho");
        peopleList.add(p);
        p = new People("Balabey Huseynov","Eng");
        peopleList.add(p);
        p = new People("Simuzer Mehdiyeva","Coo");
        peopleList.add(p);
        p = new People("Aysel Xasmemmedova","Tea");
        peopleList.add(p);
        p = new People("Aqshin Medetov","Eng");
        peopleList.add(p);
        p = new People("Kamal Kamalli","Dri");
        peopleList.add(p);
        p = new People("Ali Zeynalli","unspecified");
        peopleList.add(p);
    }
}
