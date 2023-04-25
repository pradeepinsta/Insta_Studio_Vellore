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
    private ImageSlider imageSliderBabyshower;
    private ImageSlider imageSliderPrepostwedding;
    private ImageSlider imageSliderBaby;
    private ImageSlider imageSliderProduct;
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

        ArrayList<SlideModel> imageListBabyshower = new ArrayList<>();

        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_9355-min.jpg?alt=media&token=376f7b40-0d6a-4888-807c-625034b97aca", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_9480-min.jpg?alt=media&token=c8f4e14e-e69f-42f2-95e9-a4c2fa569596", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FMRI_3743.jpg?alt=media&token=15dcf065-50c8-49b1-a7a4-a34977c229d6", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FMRI_4238.jpg?alt=media&token=eca301e3-dffa-4cf9-bfac-be33fe7b7aa2", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_1171-min.jpg?alt=media&token=45879be8-6735-4e65-a06f-708757dcd7e0", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_7126.jpg?alt=media&token=8c0a7425-73e2-4190-97bb-c1ff4a70841b", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_9329-min.jpg?alt=media&token=db3dcc4e-1dfd-42b9-9717-6c80cbbafdcc", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FMRI_4268.jpg?alt=media&token=398b2463-616c-4864-9fac-8460a435413a", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FMRI_3719.jpg?alt=media&token=93829d64-9ec8-4880-9a29-1d2379debe27", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_9513-min.jpg?alt=media&token=e393746d-68a5-4500-a863-67e659e31e29", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_9533-min.jpg?alt=media&token=be3ca09d-0260-4d50-bbab-6087a6cde2ef", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FDSC_9320-min.jpg?alt=media&token=acaec0d2-3175-4f69-bfb4-327a401c9bc0", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Babyshower%2FMRI_3718.jpg?alt=media&token=ffb41be7-b0cd-4db0-9737-b69f57f95dc1", ScaleTypes.CENTER_CROP));

        imageSliderBabyshower = mView.findViewById(R.id.image_slider_babyshower);
        imageSliderBabyshower.setImageList(imageListBabyshower);
        imageSliderBabyshower.startSliding(5000);

        ArrayList<SlideModel> imageListPrepostwedding = new ArrayList<>();

        imageListPrepostwedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20PrePost%20Weddings%2FDSC_5666.jpg?alt=media&token=e9db18a9-9f3a-4b62-9629-2d8056e3b83a", ScaleTypes.CENTER_CROP));
        imageListPrepostwedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20PrePost%20Weddings%2FDSC_5704.jpg?alt=media&token=1bc7e312-70a2-40c4-a8c0-52180ed05cb6", ScaleTypes.CENTER_CROP));
        imageListPrepostwedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20PrePost%20Weddings%2FDSC_5573.jpg?alt=media&token=db689a11-87e4-4b4d-a6de-44bec1e5be0b", ScaleTypes.CENTER_CROP));

        imageSliderPrepostwedding = mView.findViewById(R.id.image_slider_prepostwedding);
        imageSliderPrepostwedding.setImageList(imageListPrepostwedding);
        imageSliderPrepostwedding.startSliding(5000);

        ArrayList<SlideModel> imageListHousewarming = new ArrayList<>();

        imageListHousewarming.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Housewarming%2FDSC_1139-min.JPG?alt=media&token=cde9cbcb-2f71-40cc-a896-2e1f117cc064", ScaleTypes.CENTER_CROP));
        imageListHousewarming.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Housewarming%2FDSC_1162-min.JPG?alt=media&token=1a248521-e17f-406d-a676-753805848f67", ScaleTypes.CENTER_CROP));
        imageListHousewarming.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Housewarming%2FDSC_4520-min.jpg?alt=media&token=f5f9442f-3305-46b0-8eec-08810f29c3d2", ScaleTypes.CENTER_CROP));

        ImageSlider imageSliderHousewarming = mView.findViewById(R.id.image_slider_housewarming);
        imageSliderHousewarming.setImageList(imageListHousewarming);
        imageSliderHousewarming.startSliding(5000);

        ArrayList<SlideModel> imageListBaby = new ArrayList<>();

        imageListBaby.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Baby%2FDSC_2665.jpg?alt=media&token=1125088a-d16c-4cdf-a7c4-741b45fa7de8", ScaleTypes.CENTER_CROP));
        imageListBaby.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Baby%2FDSC_2941.jpg?alt=media&token=b06d5fd4-c46e-4e05-a6c1-e968c6b08293", ScaleTypes.CENTER_CROP));
        imageListBaby.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Baby%2FDSC_2813.jpg?alt=media&token=9ec9a45a-f14c-4dc3-9a8f-f77fa572f96d", ScaleTypes.CENTER_CROP));

        imageSliderBaby = mView.findViewById(R.id.image_slider_baby);
        imageSliderBaby.setImageList(imageListBaby);
        imageSliderBaby.startSliding(5000);

        ArrayList<SlideModel> imageListProduct = new ArrayList<>();

        imageListProduct.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Product%2FDSC_7766.jpg?alt=media&token=56af2214-88d1-49ac-b46f-2419cfd5dd5c", ScaleTypes.CENTER_CROP));
        imageListProduct.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Product%2FDSC_7823.jpg?alt=media&token=785d9a0a-cd13-413a-8cb5-0adadc241bde", ScaleTypes.CENTER_CROP));
        imageListProduct.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-2cfda.appspot.com/o/Portfolio%20Product%2FDSC_7721.jpg?alt=media&token=622e016b-2cfe-40ba-a05e-5303c07401d9", ScaleTypes.CENTER_CROP));

        imageSliderProduct = mView.findViewById(R.id.image_slider_product);
        imageSliderProduct.setImageList(imageListProduct);
        imageSliderProduct.startSliding(5000);

        return mView;
    }
}