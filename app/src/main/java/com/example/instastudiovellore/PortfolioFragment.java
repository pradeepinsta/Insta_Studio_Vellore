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

        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC02263-min.JPG?alt=media&token=a9e696e1-08fb-490a-bb0c-eeb9b44db33e", ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC02305-min.JPG?alt=media&token=870c6374-d38d-457f-8854-54f9c3eaa234",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC_2188.jpg?alt=media&token=6fd43457-3dd2-42ee-8619-18b5eefe761f",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC_2183.jpg?alt=media&token=f0bb205d-0fa5-4a3c-a5ae-65d7e7098f39",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC_2334-min.jpg?alt=media&token=83aa0bf6-3a42-4eae-a17b-4e85d4c8dd85",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC_8661.jpg?alt=media&token=893a7e18-daea-4a4a-a3e9-e4d86639548b",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC_8714.jpg?alt=media&token=2f658898-1fb8-46d4-81bf-c2c6e3342ea0",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FDSC_8944.jpg?alt=media&token=ee65b9a9-7a8a-47d5-a8da-2b4b79fcf417",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FSAT04276.jpg?alt=media&token=71373783-bc2c-4a74-8522-5e65c6bd2854",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2FSAT04333.jpg?alt=media&token=ee3df63e-7afb-4923-8030-b011389ffa67",ScaleTypes.CENTER_CROP));
        imageListWedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Weddings%2F_DSC8134-min.jpg?alt=media&token=889ed7a0-3cdb-47fa-a52c-5aaa60350023",ScaleTypes.CENTER_CROP));


        imageSlider = mView.findViewById(R.id.image_slider_wedding);
        imageSlider.setImageList(imageListWedding);
        imageSlider.startSliding(5000);

        ArrayList<SlideModel> imageListBabyshower = new ArrayList<>();

        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_9355-min.jpg?alt=media&token=88a0659f-d91f-48a0-a91f-22d933b91b84", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_9329-min.jpg?alt=media&token=df9c7cf4-2a43-4b84-b9f3-f5c122a2aae4", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_9320-min.jpg?alt=media&token=f9a274f7-35dc-4f5c-b725-df366073869c", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_7126.jpg?alt=media&token=ef0dad2e-eceb-42bb-a98e-cee7edcada66", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_1171-min.jpg?alt=media&token=2fb382be-9f35-4080-8b19-0698a596c1fd", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_9489-min.jpg?alt=media&token=a9e6be2d-fb0f-459b-85b9-1524a37b79d3", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_9513-min.jpg?alt=media&token=cffde854-2025-4f52-a1e4-2a0c9ad51364", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FDSC_9533-min.jpg?alt=media&token=4918f6f8-dbed-43f7-a5bf-be25612ed14c", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FMRI_3743.jpg?alt=media&token=303ec1d3-0d97-4a2d-9c5f-afe168e228fd", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FMRI_4238.jpg?alt=media&token=c90c4b16-1ded-4054-a712-723e12df35fd", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FMRI_4268.jpg?alt=media&token=8a947f73-2254-4d28-9edc-4ae4b1c401bc", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FMRI_3718.jpg?alt=media&token=2665404b-2468-4990-80e7-242a1e1cdb00", ScaleTypes.CENTER_CROP));
        imageListBabyshower.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shower%2FMRI_3719.jpg?alt=media&token=b735785c-9b70-4443-87b0-3c3fdb13e345", ScaleTypes.CENTER_CROP));

        imageSliderBabyshower = mView.findViewById(R.id.image_slider_babyshower);
        imageSliderBabyshower.setImageList(imageListBabyshower);
        imageSliderBabyshower.startSliding(5000);

        ArrayList<SlideModel> imageListPrepostwedding = new ArrayList<>();

        imageListPrepostwedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Pre-Post%20Weddings%2FDSC_5666.jpg?alt=media&token=016513a5-7ffd-42fb-b752-74d2f28f975c", ScaleTypes.CENTER_CROP));
        imageListPrepostwedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Pre-Post%20Weddings%2FDSC_5573.jpg?alt=media&token=05fa4b1e-136f-4f2b-b517-762d71df219c", ScaleTypes.CENTER_CROP));
        imageListPrepostwedding.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Pre-Post%20Weddings%2FDSC_5704.jpg?alt=media&token=b5c7cdc1-e53e-4f4e-adfc-d826a4de95ff", ScaleTypes.CENTER_CROP));

        imageSliderPrepostwedding = mView.findViewById(R.id.image_slider_prepostwedding);
        imageSliderPrepostwedding.setImageList(imageListPrepostwedding);
        imageSliderPrepostwedding.startSliding(5000);

        ArrayList<SlideModel> imageListHousewarming = new ArrayList<>();

        imageListHousewarming.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Housewarming%2FDSC_4520-min.jpg?alt=media&token=9a434877-a38e-486e-967f-5159f746ba1c", ScaleTypes.CENTER_CROP));
        imageListHousewarming.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Housewarming%2FDSC_1139-min.JPG?alt=media&token=5e881fd7-66dc-4179-bda1-0970d33c7ba4", ScaleTypes.CENTER_CROP));
        imageListHousewarming.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Housewarming%2FDSC_1162-min.JPG?alt=media&token=c425123f-e39a-4058-b2d7-142a36eb5dd8", ScaleTypes.CENTER_CROP));

        ImageSlider imageSliderHousewarming = mView.findViewById(R.id.image_slider_housewarming);
        imageSliderHousewarming.setImageList(imageListHousewarming);
        imageSliderHousewarming.startSliding(5000);

        ArrayList<SlideModel> imageListBaby = new ArrayList<>();

        imageListBaby.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shoots%2FDSC_2665.jpg?alt=media&token=e4d0e45f-9eb4-4313-92aa-4729310c9c65", ScaleTypes.CENTER_CROP));
        imageListBaby.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shoots%2FDSC_2941.jpg?alt=media&token=d8e46d1a-4dae-453d-be23-eac80578f8f4", ScaleTypes.CENTER_CROP));
        imageListBaby.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Baby%20shoots%2FDSC_2813.jpg?alt=media&token=b37c1b0c-fc23-498b-b918-d2d702ea5788", ScaleTypes.CENTER_CROP));

        imageSliderBaby = mView.findViewById(R.id.image_slider_baby);
        imageSliderBaby.setImageList(imageListBaby);
        imageSliderBaby.startSliding(5000);

        ArrayList<SlideModel> imageListProduct = new ArrayList<>();

        imageListProduct.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Product%20shoot%2FDSC_7766.jpg?alt=media&token=7fd6ec8d-6250-4386-8759-7a43f2a7c433", ScaleTypes.CENTER_CROP));
        imageListProduct.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Product%20shoot%2FDSC_7823.jpg?alt=media&token=706b8d50-dcf6-484b-b2e3-dd2c1329f19d", ScaleTypes.CENTER_CROP));
        imageListProduct.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/insta-studio-vellore-7a280.appspot.com/o/Product%20shoot%2FDSC_7721.jpg?alt=media&token=5306bd93-93c3-48f9-81b4-228fea965bc6", ScaleTypes.CENTER_CROP));

        imageSliderProduct = mView.findViewById(R.id.image_slider_product);
        imageSliderProduct.setImageList(imageListProduct);
        imageSliderProduct.startSliding(5000);

        return mView;
    }
}