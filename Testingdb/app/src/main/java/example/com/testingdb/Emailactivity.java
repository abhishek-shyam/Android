package example.com.testingdb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;


import static example.com.testingdb.R.id.Emailid;
import static example.com.testingdb.R.id.button5;

import static example.com.testingdb.R.id.Emailid;
import static example.com.testingdb.R.id.button5;

/**
 * Created by hp on 03-04-2017.
 */

public class Emailactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        final EditText Emailid = (EditText) findViewById(R.id.Emailid);
        final Button button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "Sending Email!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                final String emailid = Emailid.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                  @Override
                  public void onResponse(String response) {}
                };
                        Intent intent = getIntent();
                        String mp = intent.getStringExtra("mp");
                        EmailRequest emailRequest = new EmailRequest(emailid, mp,responseListener);
                        RequestQueue queue = Volley.newRequestQueue(Emailactivity.this);
                        queue.add(emailRequest);



        }
    });
}
    }

