package helloworld.aid.com.phonebookdesign;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Jueal_Sir extends Activity {


    ImageButton jueal_sir_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jueal__sir);
        jueal_sir_call = (ImageButton) findViewById(R.id.jueal_sir_call);

        jueal_sir_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:01911142859"));
                if (ActivityCompat.checkSelfPermission(Jueal_Sir.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
