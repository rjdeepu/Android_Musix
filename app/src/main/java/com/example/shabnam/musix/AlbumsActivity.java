package com.example.shabnam.musix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums);

        // TextView inside the category
        TextView albumsTextView = (TextView) findViewById(R.id.albums);
        albumsTextView.setText(getString(R.string.albums_desc));

        final Button button = (Button) findViewById(R.id.goToSongs);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent albumsButtonIntent = new Intent(AlbumsActivity.this, SongsActivity.class);

                startActivity(albumsButtonIntent);
            }
        });
    }
}

