package com.example.pk.task1.packege;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by PK on 10/12/2017.
 */

public class User implements Parcelable {
    protected String imgview;
    protected String editName;
    protected String password;
    protected String editMultyText;
    protected String autoCompleteTextView;

    public User(String imgview, String editName, String password, String editMultyText, String autoCompleteTextView) {
        this.imgview = imgview;
        this.editName = editName;
        this.password = password;
        this.editMultyText = editMultyText;
        this.autoCompleteTextView = autoCompleteTextView;
    }

    protected User(Parcel in) {
        imgview = in.readString();
        editName = in.readString();
        password = in.readString();
        editMultyText = in.readString();
        autoCompleteTextView = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(imgview);
        dest.writeString(editName);
        dest.writeString(password);
        dest.writeString(editMultyText);
        dest.writeString(autoCompleteTextView);
    }

    public String getImgview() {
        return imgview;
    }

    public void setImgview(String imgview) {
        this.imgview = imgview;
    }

    public String getEditName() {
        return editName;
    }

    public void setEditName(String editName) {
        this.editName = editName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEditMultyText() {
        return editMultyText;
    }

    public void setEditMultyText(String editMultyText) {
        this.editMultyText = editMultyText;
    }

    public String getAutoCompleteTextView() {
        return autoCompleteTextView;
    }

    public void setAutoCompleteTextView(String autoCompleteTextView) {
        this.autoCompleteTextView = autoCompleteTextView;
    }

    @Override
    public String toString() {
        return "User{" +
                "imgview='" + imgview + '\'' +
                ", editName='" + editName + '\'' +
                ", password='" + password + '\'' +
                ", editMultyText='" + editMultyText + '\'' +
                ", autoCompleteTextView='" + autoCompleteTextView + '\'' +
                '}';
    }


}
