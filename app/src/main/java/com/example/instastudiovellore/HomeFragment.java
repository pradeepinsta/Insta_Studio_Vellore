package com.example.instastudiovellore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageSlider imageSlider;
    View mView;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list

        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Home%20Page%2FDSC02263-min.JPG?alt=media&token=38840462-0c9e-4f33-83e9-393d1773c8da" , ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Home%20Page%2FDSC_5666.jpg?alt=media&token=61ebeaa8-6eae-4179-816b-3ce4eb892118",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Home%20Page%2FDSC_2183.jpg?alt=media&token=fb0bb5b2-7c5d-4ca6-853e-d6933021f712",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Home%20Page%2FDSC_8714.jpg?alt=media&token=78e7e569-0761-4308-9469-23f075290e8b",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Home%20Page%2FMRI_3743.jpg?alt=media&token=0ff525a4-0938-497b-bbcb-1d49cae799b0",ScaleTypes.CENTER_CROP));

        imageSlider = mView.findViewById(R.id.image_slider_wedding);
        imageSlider.setImageList(imageList);
//      imageSlider.setSlideAnimation(AnimationTypes.ZOOM_IN);
        imageSlider.startSliding(5000);

        return mView;
    }
}