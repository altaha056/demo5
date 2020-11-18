package com.example.demo5.ui.gallery; /*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/

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
/*melakukan impor library yang dibutuhkan class*/

public class GalleryFragment extends Fragment {/*membuat class public yang menaungi fragment dari galeri dengan extend dari library fragment*/

    AdapterRecycleView1 adapterRecycleView1; /*menginisiasi adapter recycle view untuk menduplikasi satu objek menjadi sebanyak dari jumlah data yang dimasukkan*/
    FragmentHomeBinding binding; /*menginisialisasi method binding untuk memasukkan data kedalam recyvle view*/

    public View onCreateView(@NonNull LayoutInflater inflater, /*membuat tampilan pada fragmen dengan menggunakan layout inflater untuk menghubungkan tampilan fragment ke mainactivity*/
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {/*setelah oncreateview proses berikutnya adalah onviewcreated yakni menampikan data kedalam bentuk view*/

        List<ModelData> data=new ArrayList<>();/*membuat list model data yang ingin dimasukkan*/
        /*menambahkan data sesuai urutan variabel yang telah diinisialisasi yakni title, description dan image*/
        data.add(new ModelData("Professor X"," A mutant telepath, treating young mutants endangered by their own powers.",R.drawable.professorx));
        data.add(new ModelData("Wolverine","World war 1 soldier with an unstoppable healing power with adamantium.",R.drawable.wolverine));
        data.add(new ModelData("Magneto","Ability to control magnetic fields to help mutants replaces humans as the dominant species.",R.drawable.magneto));
        data.add(new ModelData("Cyclops","He posses the ability that he can't control until prof x give him the machine to point the laser.",R.drawable.cyclops));
        data.add(new ModelData("Colossus","All metal creatures that can move and fight to crush all of him enemy.",R.drawable.colossus));
        data.add(new ModelData("Deadpool","Healing factor—and big mouth—make him one of the most relentlessly wisecracking heroes.",R.drawable.deadpool));
        data.add(new ModelData("Night Crawler","Once upon a time when a wolf as big as mountain.",R.drawable.nightcrawler));
        data.add(new ModelData("Storm","Confounds enemies of the X-Men by using her psionic abilities to manipulate the weather.",R.drawable.storm));
        data.add(new ModelData("Ice Man","Make everything into so cold that he can fly through it.",R.drawable.iceman));

        adapterRecycleView1=new AdapterRecycleView1(data);
        binding.recycle1.setAdapter(adapterRecycleView1);
        binding.recycle1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        binding.recycle1.setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}