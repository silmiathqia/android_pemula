package id.co.silmiazdkiatul.athqia;

import android.os.Parcel;
import android.os.Parcelable;

public class Rasul implements Parcelable {
    private String name, remarks, photo, deskripsi, gelar, mukjizat;

    protected Rasul(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        gelar = in.readString();
        mukjizat = in.readString();
    }

    public static final Creator<Rasul> CREATOR = new Creator<Rasul>() {
        @Override
        public Rasul createFromParcel(Parcel in) {
            return new Rasul(in);
        }

        @Override
        public Rasul[] newArray(int size) {
            return new Rasul[size];
        }
    };

    public Rasul() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getMukjizat() {
        return mukjizat;
    }

    public void setMukjizat(String mukjizat) {
        this.mukjizat = mukjizat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.gelar);
        parcel.writeString(this.mukjizat);
    }
}
