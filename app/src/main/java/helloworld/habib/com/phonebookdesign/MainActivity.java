package helloworld.aid.com.phonebookdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout teachers, staffs, it_support,admissoin_help_line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teachers = (LinearLayout) findViewById(R.id.teachers);
        staffs = (LinearLayout) findViewById(R.id.staffs);
        it_support = (LinearLayout) findViewById(R.id.itsupports);
        admissoin_help_line = (LinearLayout) findViewById(R.id.admission_help_line);


        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teacherIntent = new Intent(MainActivity.this, Faculty.class);
                startActivity(teacherIntent);
            }
        });

        staffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent staffsIntent = new Intent(MainActivity.this, Staffs.class);
                startActivity(staffsIntent);
            }
        });

        it_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itSupportsIntent = new Intent(MainActivity.this,IT_Supports.class);
                startActivity(itSupportsIntent);
            }
        });

        admissoin_help_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admissionIntent = new Intent(MainActivity.this, Admission_Help_Line.class);
                startActivity(admissionIntent);
            }
        });

    }
}
