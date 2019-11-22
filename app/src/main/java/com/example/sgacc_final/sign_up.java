package com.example.sgacc_final;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.security.PublicKey;

public class sign_up extends AppCompatActivity {

    private ImageView image;
    private TextView pass,email_view;
    private int i=0;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        image=(ImageView)findViewById(R.id.tickless);
        pass=(TextView)findViewById(R.id.password_su);
        email_view=(TextView) findViewById(R.id.email_su);
        mAuth = FirebaseAuth.getInstance();
    }

    public void signup_ep(View view){

        String email=email_view.getText().toString();
        String password=pass.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("asd", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("asd", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(sign_up.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }

    private void updateUI(FirebaseUser user) {
        if(user==null){
            Intent intent=new Intent(this,login.class);
            startActivity(intent);
        }
        else {
            Intent intent=new Intent(this,home.class);
            startActivity(intent);
        }
    }

    public void changetick(View view){
        if(i==0)
        {
            image.setImageResource(R.drawable.signup_tick);
            i=1;
        }
        else
        {
            image.setImageResource(R.drawable.signup_notick);
            i=0;
        }
    }

    public void orlogin(View view){
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }
}
