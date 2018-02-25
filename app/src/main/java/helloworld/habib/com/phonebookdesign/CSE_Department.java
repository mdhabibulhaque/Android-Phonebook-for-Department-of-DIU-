package helloworld.aid.com.phonebookdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CSE_Department extends AppCompatActivity {

    Button jueal_sir,akterSir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse__department);

        akterSir = (Button) findViewById(R.id.akterSir);
        jueal_sir = (Button) findViewById(R.id.jueal_sir);
        //jueal_sir.setOnClickListener(null);

        jueal_sir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent object = new Intent(CSE_Department.this,Jueal_Sir.class);
               startActivity(object);
           }
       });

        akterSir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent object = new Intent(CSE_Department.this,Akhter_Sir.class);
                startActivity(object);
            }
        });

    }
}
