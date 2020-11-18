package com.example.demo5.ui.home;/*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/
/*melakukan impor library yang dibutuhkan class*/
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel { /*membuat class bersifat public yang memiliki method dari library viewmodel yang sebelumnya sudah ditambahkan*/

    private MutableLiveData<String> mText; /*menambahkan variable lokal bertipe data string*/

    public HomeViewModel() {/*membuat method untuk menampilkan tulisan yang selanjutnya akan ditampilkan*/
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }/*membuat method untuk memberikan nilai balik terhadap variabel mText*/


    private String title, description;/*melakukan inisialiasi pada variabel title dan description dengan tipe data string*/
    private int image;/*melakukan inisialiasi pada variabel image dengan tipe data integer*/

    /*membuat method untuk memasukkan data kedalam variabel yang sudah ditentukan berdasarkan urutan*/
    public HomeViewModel(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }


    public String getTitle() {
        return title;
    }/*mengambil data title dengan nilai balik*/

    public void setTitle(String title) {
        this.title = title;
    }/*memasukkan data title*/

    public String getDescription() {
        return description;
    }/*mengambil data description dengan nilai balik*/

    public void setDescription(String description) {
        this.description = description;
    }/*memasukkan data description*/

    public int getImage() {
        return image;
    }/*mengambil data image dengan nilai balik*/

    public void setImage(int image) {
        this.image = image;
    }/*memasukkan data image*/
}