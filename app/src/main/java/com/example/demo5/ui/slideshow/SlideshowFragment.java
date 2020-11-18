package com.example.demo5.ui.slideshow;/*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.demo5.R;
import com.example.demo5.databinding.FragmentHomeBinding;
import com.example.demo5.ui.home.AdapterRecycleView1;
import com.example.demo5.ui.home.ModelData;

import java.util.ArrayList;
import java.util.List;

public class SlideshowFragment extends Fragment {

    AdapterRecycleView1 adapterRecycleView1;
    FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    /*setelah oncreateview proses berikutnya adalah onviewcreated yakni menampikan data kedalam bentuk view*/
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        List<ModelData> data=new ArrayList<>();/*membuat list model data yang ingin dimasukkan*/
        /*menambahkan data sesuai urutan variabel yang telah diinisialisasi yakni title, description dan image*/
        data.add(new ModelData("Gamora","Raised by Thanos to be a living weapon, Gamora seeks redemption.",R.drawable.gamora));
        data.add(new ModelData("Star Lord","Brings a sassy sense of humor while protecting the universe from all threats.",R.drawable.starlord));
        data.add(new ModelData("Groot","This sentient alien tree branches out of his comfort zone.",R.drawable.groot));
        data.add(new ModelData("Rocket","As the weapons and tactical expert, Rocket risks his hide to defend the cosmos.",R.drawable.rocket));
        data.add(new ModelData("Drax","Uses his super strength and combat skills to destroy any enemies ",R.drawable.drax));
        data.add(new ModelData("Yondu","Wields a mighty bow with Yaka arrows that move according to his whistles.",R.drawable.yondu));
        data.add(new ModelData("Adam War Lock","The tribe was so mad that they make a machine to devastate.",R.drawable.adamwarlock));

        adapterRecycleView1=new AdapterRecycleView1(data);
        binding.recycle1.setAdapter(adapterRecycleView1);
        binding.recycle1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        binding.recycle1.setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}