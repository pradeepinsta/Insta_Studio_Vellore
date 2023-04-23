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
 * Use the {@link PortfolioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PortfolioFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ImageSlider imageSlider;
    View mView;

    public PortfolioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PortfolioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PortfolioFragment newInstance(String param1, String param2) {
        PortfolioFragment fragment = new PortfolioFragment();
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
        mView = inflater.inflate(R.layout.fragment_portfolio, container, false);

        ArrayList<SlideModel> imageListWedding = new ArrayList<>();// Create image list

        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC02263-min.JPG?alt=media&token=7341b235-3c47-41d0-8126-02e94ad63b42", ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC02305-min.JPG?alt=media&token=6e3895b7-0d83-4cb1-9e8a-36542a12015a",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC_2183.jpg?alt=media&token=68eb6453-d588-4629-b697-a27e872b8ca1",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC_2188.jpg?alt=media&token=6a76eeab-793a-4857-a0ea-df3cf811c98a",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC_2334-min.jpg?alt=media&token=e7393305-f415-4b8a-944f-bc4666c3d36f",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC_8661.jpg?alt=media&token=d58a1e34-d58a-41f8-aca9-b0f3f597d0f1",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC_8714.jpg?alt=media&token=ca59e706-033d-4b66-9f08-308a7e54444d",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FDSC_8944.jpg?alt=media&token=6ee8ee30-ace0-4b72-98ac-74284cdc85e0",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FSAT04276.jpg?alt=media&token=d97de3d1-70fe-41ca-856d-c2d5bb337195",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2FSAT04333.jpg?alt=media&token=c5fbe043-8215-41f6-aad4-433a424629de",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Weddings%2F_DSC8134-min.jpg?alt=media&token=0cfeda8d-562d-4832-a586-1bd193e99123",ScaleTypes.CENTER_CROP));


        imageSlider = mView.findViewById(R.id.image_slider_wedding);
        imageSlider.setImageList(imageListWedding);
        imageSlider.startSliding(5000);

        return mView;
    }
}