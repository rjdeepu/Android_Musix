package com.example.shabnam.musix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        // TextView inside the category
        TextView songsTextView = (TextView) findViewById(R.id.songs);
        songsTextView.setText(getString(R.string.songs_desc));

        final Button buttonPurchase = (Button) findViewById(R.id.goToPurchase);
        buttonPurchase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent songsButtonIntent = new Intent(SongsActivity.this, PurchaseActivity.class);

                startActivity(songsButtonIntent);
            }
        });
    }
}
