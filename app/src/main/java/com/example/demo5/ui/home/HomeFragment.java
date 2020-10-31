package com.example.demo5.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demo5.R;
import com.example.demo5.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    AdapterRecycleView1 adapterRecycleView1;
    FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        List<ModelData> data=new ArrayList<>();
        data.add(new ModelData("Taverns","Gather with folks, join the party, and sip the grape.",R.drawable.taverns));
        data.add(new ModelData("Aurora","The most mesmerizing theatre by the nature.",R.drawable.myth));
        data.add(new ModelData("Mythology","Valhalla calling your name through the boat we sailed.",R.drawable.myth3));
        data.add(new ModelData("Saga","Once upon a time when a wolf as big as mountain.",R.drawable.myth2));
        data.add(new ModelData("Norsemen","Become the warriors and travel around the world!",R.drawable.ship));
        data.add(new ModelData("Brotherhood","One tribe, one clan, one blood.",R.drawable.myth));

        adapterRecycleView1=new AdapterRecycleView1(data);
        binding.recycle1.setAdapter(adapterRecycleView1);
        binding.recycle1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        binding.recycle1.setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}






