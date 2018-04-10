package com.example.shabnam.musix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists);

        // TextView inside the category
        TextView artistTextView = (TextView) findViewById(R.id.artists);
        artistTextView.setText(getString(R.string.artists_desc));

        final Button button = (Button) findViewById(R.id.goToAlbums);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent artistsButtonIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);

                startActivity(artistsButtonIntent);
            }
        });
    }
}
