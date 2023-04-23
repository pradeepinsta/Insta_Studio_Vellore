package com.example.instastudiovellore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class PhoneSignActivity extends AppCompatActivity {

    ImageView plane;
    EditText phoneNumber;
    Button sendOtp;

    FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_sign);

        plane = findViewById(R.id.imageViewPlane);
        phoneNumber = findViewById(R.id.editTextPhone);
        sendOtp = findViewById(R.id.buttonOtp);

        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = phoneNumber.getText().toString();
                if (number.trim().isEmpty() || number.length() < 10)
                {
                    Toast.makeText(PhoneSignActivity.this, "Enter Valid Mobile number", Toast.LENGTH_SHORT).show();
                    return;
                }

                PhoneAuthProvider.getInstance().verifyPhoneNumber(
                        "+91" + number,
                        60,
                        TimeUnit.SECONDS,
                        PhoneSignActivity.this,
                        new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                Toast.makeText(PhoneSignActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                Intent intent = new Intent(getApplicationContext(),OtpActivity.class);
                                intent.putExtra("mobile",number);
                                intent.putExtra("verificationId",s);
                                startActivity(intent);
                            }
                        }

                );


            }
        });
    }
}