package example.com.testingdb;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.button1;

public class MainActivity extends AppCompatActivity{
private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener(){
button_sbm=(Button)findViewById(R.id.button);
button_sbm.setOnClickListener(
        new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent("example.com.testingdb.Secondactivity");
                startActivity(intent);
            }
        }
);
    }
}
