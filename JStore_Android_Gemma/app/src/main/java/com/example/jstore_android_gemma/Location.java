package com.example.jstore_android_gemma;

public class Location {
    private String province;
    private String description;
    private String city;

    //Konstruktor dari kelas Supplier
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    //Menampilkan nama provinsi
    public String getProvince()
    {
        return province;
    }

    //Menampilkan nama kota
    public String getCity()
    {
        return city;
    }

    //Menampilkan deskripsi lokasi

    public String getDescription()
    {
        return description;
    }

    //Mengganti nama provinsi
    public void setProvince(String province)
    {
        this.province=province;
    }

    //Mengganti nama kota
    /**
     * Method setCity()
     * @param city
     */
    public void setCity(String city)
    {
        this.city=city;
    }

    //Mengganti deskripsi lokasi
    public void setDescription(String description)
    {
        this.description=description;
    }


}
