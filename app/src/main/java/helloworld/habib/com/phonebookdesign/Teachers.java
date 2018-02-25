package helloworld.aid.com.phonebookdesign;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Teachers extends AppCompatActivity {

    ImageButton akterSir,mail;
    Button faculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);

       // faculty = (Button) findViewById(R.id.faculty);
        akterSir = (ImageButton) findViewById(R.id.akterSir);
        mail = (ImageButton) findViewById(R.id.mail);


        akterSir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:01817382645"));
                if (ActivityCompat.checkSelfPermission(Teachers.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(call);
            }
        });
        
        
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Teachers.this, "aktarhossain@daffodilvarsity.edu.bd", Toast.LENGTH_SHORT).show();
            }
        });



        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Teachers.this,Faculty.class);
                startActivity(intent);
            }
        });
    }
}
