/*
 * Created by ishaanjav
 * github.com/ishaanjav
 */

package app.ij.mlwithtensorflowlite;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import app.ij.mlwithtensorflowlite.ml.Model;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {


    ImageButton ImageTombol;
    ImageButton ImageTombol1;
    ImageButton ImageTombol2;

    Intent pindahhal;
    Intent pindahhal1;
    Intent pindahhal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageTombol = (ImageButton)findViewById(R.id.mtk);

        ImageTombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindahhal = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(pindahhal);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        ImageTombol1 = (ImageButton)findViewById(R.id.instruksi);

        ImageTombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindahhal1 = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(pindahhal1);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        ImageTombol2 = (ImageButton)findViewById(R.id.bindo);

        ImageTombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindahhal2 = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(pindahhal2);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

    }
}
