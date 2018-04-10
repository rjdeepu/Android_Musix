package com.example.shabnam.musix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the Albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the Button that shows the Songs
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the Button that shows the Purchase
        TextView purchase = (TextView) findViewById(R.id.purchase);

        // Set a click listener on that View
        purchase.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PurchaseActivity}
                Intent purchaseIntent = new Intent(MainActivity.this, PurchaseActivity.class);

                // Start the new activity
                startActivity(purchaseIntent);
            }
        });

        final Button buttonNowPlaying = (Button) findViewById(R.id.goToNowPlaying);

        buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent songsButtonIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                startActivity(songsButtonIntent);
            }
        });
    }
}
