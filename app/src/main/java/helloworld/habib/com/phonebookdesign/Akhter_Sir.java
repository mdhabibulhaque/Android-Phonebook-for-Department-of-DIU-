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

public class Akhter_Sir extends AppCompatActivity {

    LinearLayout akther_sir_call;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhter__sir);

        akther_sir_call = (LinearLayout) findViewById(R.id.akther_sir_call);



        akther_sir_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:01817382645"));
                if (ActivityCompat.checkSelfPermission(Akhter_Sir.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
