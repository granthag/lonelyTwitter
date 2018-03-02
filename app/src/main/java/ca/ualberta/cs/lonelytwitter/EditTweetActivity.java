package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        EditText tweetBox = (EditText) findViewById(R.id.tweetText);
        Intent intent = getIntent();
        tweetBox.setText(intent.getStringExtra("Tweet"));
    }

}
