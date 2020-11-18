package com.example.demo5.ui.home;/*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/


/*melakukan impor library yang dibutuhkan class*/
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

public class HomeFragment extends Fragment {/*membuat class public yang memiliki method dari library fragment*/

    AdapterRecycleView1 adapterRecycleView1;/*melakukan inisialisasi method adapterrecycleview*/
    FragmentHomeBinding binding;/*melakukan inisialisasi method binding untuk memasukkan data kedalam recycleview*/

    public View onCreateView(@NonNull LayoutInflater inflater,/*pembuatan tampilan dengan menggunakan inflater untuk menghubungkan fragment ke main menu*/
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());/*memasukkan data kedalam fragmen*/
        return binding.getRoot();/*memberikan nilai balik*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {/*setelah oncreateview proses berikutnya adalah onviewcreated yakni menampikan data kedalam bentuk view*/
        List<ModelData> data=new ArrayList<>();/*membuat list model data yang ingin dimasukkan*/
        /*menambahkan data sesuai urutan variabel yang telah diinisialisasi yakni title, description dan image*/
        data.add(new ModelData("Captain America","Recipient of the Super-Soldier serum, Leader of the Avengers.",R.drawable.captamerica));
        data.add(new ModelData("Iron Man","Genius. Billionaire. Philanthropist. Military tactical weapon completed.",R.drawable.ironman));
        data.add(new ModelData("Thor","The son of Odin as the God of Thunder to protect Seven Realm.",R.drawable.thor));
        data.add(new ModelData("Hulk","The soft-spoken scientist and the uncontrollable green monster.",R.drawable.hulk));
        data.add(new ModelData("Ronin","A master marksman, Clint Barton serves as the Avengers’ amazing archer.",R.drawable.ronin));
        data.add(new ModelData("Vision","The android called Vision defies physics with the power of density manipulation.",R.drawable.vision));
        data.add(new ModelData("Captain Marvel","Powerful heroes of a galactic war between two alien races.",R.drawable.captmarvel));
        data.add(new ModelData("Doctor Strange","Sorcerer Supreme—Earth’s foremost protector.",R.drawable.drstrange));
        data.add(new ModelData("Black Panther","King of the secretive and highly advanced African nation of Wakanda",R.drawable.blackpanther));
        data.add(new ModelData("Ant Man","Scott Lang follows in the tiny, yet mighty, footsteps of his predecessor as the size-changing.",R.drawable.antman));

        adapterRecycleView1=new AdapterRecycleView1(data);/*menignisialisasi adapterrecycleview baru dengan parameter data*/
        binding.recycle1.setAdapter(adapterRecycleView1);/*melakukan binding atau proses pengiriman data*/
        binding.recycle1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));/*menentukan arah tampilan yakni vertical dari atas ke bawah*/
        binding.recycle1.setOverScrollMode(View.OVER_SCROLL_NEVER);/*memberikan method agar scroll berhenti ketika sudah mencapai akhir objek*/

    }
}






