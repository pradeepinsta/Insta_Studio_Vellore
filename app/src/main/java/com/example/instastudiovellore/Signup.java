package com.example.instastudiovellore;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;


public class Signup extends AppCompatActivity {

    ImageView logo;
    Button phoneSignin;
    Button googleSignin;
    TextView textviewOr,textviewContactUs,textviewQueries;
    GoogleSignInClient googleSignInClient;
    FirebaseAuth auth = FirebaseAuth.getInstance();

    ActivityResultLauncher<Intent> activityResultLauncher;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);

        registerActivityForGoogleSignIn();

        logo = findViewById(R.id.imageViewLogo);
        textviewOr = findViewById(R.id.textViewOr);
        textviewContactUs = findViewById(R.id.textViewContactus);
        textviewQueries = findViewById(R.id.textViewQueries);
        phoneSignin = findViewById(R.id.button_phone);
        googleSignin = findViewById(R.id.button_google);

        phoneSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Signup.this,PhoneSignActivity.class);
                startActivity(intent);
                finish();
            }
        });

        textviewContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Signup.this,ContactActivity.class);
                startActivity(intent);
                finish();

            }
        });

        googleSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signinGoogle();

            }
        });


    }

    public void signinGoogle()
    {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken("575102053086-im1q0fdhov97s249t39tigvsmpet3m5g.apps.googleusercontent.com")
                .requestEmail().build();

        googleSignInClient = GoogleSignIn.getClient(this,gso);
        signin();
    }

    public void signin()
    {
        Intent signinIntent = googleSignInClient.getSignInIntent();
        activityResultLauncher.launch(signinIntent);
    }

    public void  registerActivityForGoogleSignIn()
    {
        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        int resultCode = result.getResultCode();
                        Intent data = result.getData();

                        if (resultCode == RESULT_OK && data != null)
                        {
                            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
                            firebaseSignInWithGoogle(task);
                        }

                    }
                });
    }

    private void firebaseSignInWithGoogle(Task<GoogleSignInAccount> task)
    {
        try {
            GoogleSignInAccount account = task.getResult(ApiException.class);
            Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Signup.this,HomeActivity.class);
            startActivity(i);
            finish();
            firebaseGoogleAccount(account);
        } catch (ApiException e) {
           e.printStackTrace();
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    private void firebaseGoogleAccount(GoogleSignInAccount account)
    {
        AuthCredential authCredential = GoogleAuthProvider.getCredential(account.getIdToken(),null);
        auth.signInWithCredential(authCredential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful())
                        {

                        }
                        else
                        {

                        }

                    }
                });
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = auth.getCurrentUser();
        if (user != null)
        {
            Intent i = new Intent(Signup.this,HomeActivity.class);
            startActivity(i);
            finish();
        }
    }
}