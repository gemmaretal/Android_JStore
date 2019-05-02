package com.example.jstore_android_gemma;

public class Supplier {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    //Konstruktor dari kelas Supplier
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {

        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
        this.id=id;
    }

    //Menampilkan nomor id supplier
    public int getId()
    {
        return id;
    }

    //Menampilkan nama supplier
    public String getName()
    {
        return name;
    }

    //Menampilkan email supplier
    public String getEmail()
    {
        return email;
    }

    //Menampilkan nomor telepon supplier
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    //Menampilkan lokasi supplier
    public Location getLocation()
    {
        return location;
    }

    //Mengubah id supplier
    public void setId(int id)
    {
        this.id=id;
    }

    //Mengubah nama supplier
    public void setName(String name)
    {
        this.name=name;
    }

    //Mengubah email supplier
    public void setEmail(String email)
    {
        this.email=email;
    }

    //Mengubah nomor telepon supplier
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    //Mengubah lokasi supplier
    public void setLocation(Location location)
    {
        this.location=location;
    }
}