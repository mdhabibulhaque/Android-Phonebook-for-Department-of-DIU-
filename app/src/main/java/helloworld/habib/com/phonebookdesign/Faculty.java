package helloworld.aid.com.phonebookdesign;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Faculty extends AppCompatActivity {

     LinearLayout cse_department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        cse_department = (LinearLayout) findViewById(R.id.cse_department);

        cse_department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent object = new Intent(Faculty.this, CSE_Department.class);
                startActivity(object);
            }
        });
    }
}
