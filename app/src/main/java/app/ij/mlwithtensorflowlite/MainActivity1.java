/*
 * Created by ishaanjav
 * github.com/ishaanjav
 */

package app.ij.mlwithtensorflowlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    Button tombol4;
    Intent pindah4;
    Button tombol5;
    Intent pindah5;
    Button tombol9;
    Intent pindah9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        tombol9 = (Button)findViewById(R.id.kembali1);

        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah9 = new Intent(MainActivity1.this, MainActivity.class);
                startActivity(pindah9);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });
    }
}
