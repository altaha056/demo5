package com.example.demo5.ui.slideshow;/*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/
/*melakukan impor library yang dibutuhkan class*/
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}