package com.example.instastudiovellore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class SettingFragment extends Fragment {

    ImageView imageViewInsta, imageViewYt, imageViewFb;

    Button btnSignout;

    View mView;

    public SettingFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_setting, container, false);

        imageViewInsta = mView.findViewById(R.id.imageViewInstagram);
        imageViewYt = mView.findViewById(R.id.imageViewYoutube);
        imageViewFb = mView.findViewById(R.id.imageViewFacebook);
        btnSignout = mView.findViewById(R.id.buttonSignout);

        imageViewInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/insta_studio_vellore/");
            }
        });

        imageViewYt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/@instastudiovellore2557");
            }
        });

        imageViewFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/instaphotographyofficial");
            }
        });

        btnSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getActivity(),Signup.class);
                startActivity(intent);
            }
        });


        return mView;
    }
    private void gotoUrl(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}