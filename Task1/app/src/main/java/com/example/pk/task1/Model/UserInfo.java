package com.example.pk.task1.Model;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pk.task1.packege.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URI;

/**
 * Created by PK on 10/11/2017.
 */

public class UserInfo implements Serializable {

   protected ImageView imgview;
   protected EditText editName;
   protected EditText password;
   protected EditText editMultyText;
   protected AutoCompleteTextView autoCompleteTextView;
    private Context application;
    private User user;
    public UserInfo(ImageView imgview, EditText editName, EditText password, EditText editMultyText,
                    AutoCompleteTextView autoCompleteTextView,Context applicationContext) {
        this.imgview = imgview;
        this.editName = editName;
        this.password = password;
        this.editMultyText = editMultyText;
        this.autoCompleteTextView = autoCompleteTextView;
        this.application=applicationContext;
    }

    public void Clear()
    {
        editName.setText("");
        password.setText("");
        editMultyText.setText("");
        autoCompleteTextView.setText("");
        //imgview.setImageURI(Uri.parse("file://main/res/drawable/ic_add_a_photo_black_48dp.png"));\
        setImgview();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser()
    {
        user = new User(imgview.toString(),editName.getText().toString(),password.getText().toString(),
                editMultyText.getText().toString(),autoCompleteTextView.getText().toString());
        return user;

    }

    private void setImgview() {
        String filename = "ic_add_a_photo_black_48dp.png";
        InputStream inputStream = null;
        try {

            inputStream = application.getAssets().open(filename);
            Drawable d = Drawable.createFromStream(inputStream, null);
            imgview.setImageDrawable(d);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "imgview=" + imgview +
                ", editName=" + editName +
                ", password=" + password +
                ", editMultyText=" + editMultyText +
                ", autoCompleteTextView=" + autoCompleteTextView +
                '}';
    }



    //    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel parcel, int flags) {
//      //  parcel.write
//    }
}
