package com.example.jstore_android_gemma;

public class Item {
    private int id;
    private String name;
    private int price;
    private String category;
    private String status;
    private Supplier supplier;

    //Konstruktor dari kelas Item
    public Item(int id, String name, int price, String category, String status, Supplier supplier)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;
    }

    //Menampilkan nomor id
    public int getId()
    {
        return id;
    }

    //Menampilkan nama Item
    public String getName()
    {
        return name;
    }

    //Menampilkan harga Item
    public int getPrice()
    {
        return price;
    }

    //Menampilkan kategori Item
    public String getCategory()
    {
        return category;
    }

    public String getStatus()
    {
        return status;
    }

    //Menampilkan supplier Item
    public Supplier getSupplier()
    {
        return supplier;
    }

    //Mengganti nomor id
    public void setId(int id)
    {
        this.id=id;
    }

    //Mengganti nama Item
    public void setName(String name)
    {
        this.name=name;
    }

    //Mengganti harga Item
    public void setPrice(int price)
    {
        this.price=price;
    }

    //Mengganti kategori Item
    public void setCategory(String category)
    {
        this.category=category;
    }

    public void setStatus(String status)
    {
        this.status=status;
    }

    //Mengganti supplier Item
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }

}
