package com.example.demo5.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.demo5.R;

import java.util.ArrayList;
import java.util.List;

public class MenuLayout extends AppCompatActivity {

    AdapterRecycleView1 adapterRecycleView1;
    RecyclerView recyclerView;
    LinearLayout tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        recyclerView=findViewById(R.id.recycle1);

        List<ModelData> data=new ArrayList<>();
        data.add(new ModelData("Taverns","Gather with folks, join the party, and sip the grape.",R.drawable.taverns));
        data.add(new ModelData("Aurora","The most mesmerizing theatre by the nature.",R.drawable.myth));
        data.add(new ModelData("Mythology","Valhalla calling your name through the boat we sailed.",R.drawable.myth3));
        data.add(new ModelData("Saga","Once upon a time when a wolf as big as mountain.",R.drawable.myth2));
        data.add(new ModelData("Norsemen","Become the warriors and travel around the world!",R.drawable.ship));
        data.add(new ModelData("Brotherhood","One tribe, one clan, one blood.",R.drawable.myth));
        adapterRecycleView1=new AdapterRecycleView1(data);
        recyclerView.setAdapter(adapterRecycleView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setOverScrollMode(View.OVER_SCROLL_NEVER);
    }
}
