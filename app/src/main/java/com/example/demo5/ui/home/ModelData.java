package com.example.demo5.ui.home;/*Menginisiasi nama package dari project agar tidak terjadi crash dengan projek lain ketika diupload ke internet misal play store*/

/*Membuat class model data untuk menampung data dan menginisialisasi tipe data yang akan digunakan*/
public class ModelData {
    private String title, description; /*menginisialisasi variabel title dan description dengan tipe data string*/
    private int image;/*menginisialisasi variabel image dengan tipe data integer*/

    public ModelData(String title, String description, int image) {/*membuat subclass dengan parameter berupa variabelyang sudah ditentukan*/
        this.title = title;/*memasukkan data dengan keyword this agar membedakan variabel lokal dengna variabel konstruktor/instance*/
        this.description = description;/*memasukkan data dengan keyword this agar membedakan variabel lokal dengna variabel konstruktor/instance*/
        this.image = image;/*memasukkan data dengan keyword this agar membedakan variabel lokal dengna variabel konstruktor/instance*/
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
    }/*mengambil data image*/

    public void setImage(int image) {
        this.image = image;
    }/*memasukkan data image*/
}
