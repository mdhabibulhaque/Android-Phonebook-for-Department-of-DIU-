package helloworld.aid.com.phonebookdesign;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Noori_Sir extends AppCompatActivity {

    LinearLayout noori_sir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noori__sir);


        noori_sir = (LinearLayout) findViewById(R.id.noori_sir);



        noori_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:01966232409"));
                if (ActivityCompat.checkSelfPermission(Noori_Sir.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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


    }
}
