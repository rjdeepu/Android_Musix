package com.example.shabnam.musix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);

        // TextView inside the category
        TextView songsTextView = (TextView) findViewById(R.id.nowPlaying);
        songsTextView.setText(getString(R.string.now_playing_desc));

        final Button buttonPurchase = (Button) findViewById(R.id.now_playing_to_home);
        buttonPurchase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nowPlayingButtonIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                startActivity(nowPlayingButtonIntent);
            }
        });
    }
}
