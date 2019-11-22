package com.example.sgacc_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class nav_bar extends AppCompatActivity {

    private Button logout;
    private ImageView photo;
    private TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bar);
    }

    @Override
    protected void onStart() {
        super.onStart();

        logout=findViewById(R.id.logout);
        photo=findViewById(R.id.photo);
        username=findViewById(R.id.name);
    }

    @Override
    protected void onResume() {
        super.onResume();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {

            String name = user.getDisplayName();
            username.setText(name);
            Uri photoUrl = user.getPhotoUrl();
            if(photoUrl!=null){
                photo.setImageURI(photoUrl);
            }
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i=new Intent(nav_bar.this, login.class);
                startActivity(i);
            }
        });
    }
}
