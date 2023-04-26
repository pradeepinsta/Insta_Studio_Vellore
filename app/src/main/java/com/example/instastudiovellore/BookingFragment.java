package com.example.instastudiovellore;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BookingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookingFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String TAG = "BookingActivity" ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText editTextDate;
    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextLocation;
    private EditText editTextEvent;
    Button book;
    private DatabaseReference mDatabaseReference;
    String name, phone, location, event,uid;
    String date , eDate;

    View mView;

    public BookingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BookingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BookingFragment newInstance(String param1, String param2) {
        BookingFragment fragment = new BookingFragment();
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
        mView = inflater.inflate(R.layout.fragment_booking, container, false);

        editTextDate =(EditText) mView.findViewById(R.id.editTextDate);
        editTextName =(EditText) mView.findViewById(R.id.editTextName);
        editTextPhone =(EditText) mView.findViewById(R.id.editTextBookingPhone);
        editTextLocation =(EditText) mView.findViewById(R.id.editTextLocation);
        editTextEvent =(EditText) mView.findViewById(R.id.editTextEvent);
        book =(Button) mView.findViewById(R.id.buttonBook);

        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        mDatabaseReference = FirebaseDatabase.getInstance().getReference().child("Bookings");
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        uid = currentFirebaseUser.getUid();

        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog dialog = new DatePickerDialog(mView.getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        month = month+1;
                        eDate = dayOfMonth +"/"+month+"/"+year;
                        editTextDate.setText(eDate);
                        Log.d(TAG, "onDateSet: "+ date);

                    }
                },year,month,day);
                dialog.show();

            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editTextName.getText().toString();
                phone = editTextPhone.getText().toString();
                location = editTextLocation.getText().toString();
                event = editTextEvent.getText().toString();

                Log.d(TAG, "onClick: Name " + name);
                Log.d(TAG, "onClick: Phone " + phone);
                Log.d(TAG, "onClick: Location " + location);
                Log.d(TAG, "onClick: event " + event);
                Log.d(TAG, "onClick: date " + eDate);

                newBooking(uid,name,phone,location,event,eDate);
                FirebaseDatabase database =FirebaseDatabase.getInstance();

                Log.d(TAG, "onClick: Firebase database" + database);
                FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
                uid = currentFirebaseUser.getUid().toString();
                DatabaseReference databaseReference = database.getReference().child("Bookings");
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        Toast.makeText(getActivity(), "Congratulations! Your booking has been successfully confirmed. ", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

        return mView;
    }

    public class User
    {
        public String uName,uPhone, uLocation, uEvent, uDates;

        public User()
        {
            //Default Constructor
        }

        public User(String name,String phone,String location, String event, String date)
        {
            this.uName = name;
            this.uPhone = phone;
            this.uLocation = location;
            this.uEvent = event;
            this.uDates = date;
        }
    }

    private void newBooking(String userId, String name,String phone,String location, String event, String date)
    {
        User user = new User(name,phone,location,event,date);
        mDatabaseReference.child("Bookings").child(userId).setValue(user);
    }
}