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

public class MainActivity4 extends AppCompatActivity {

    Button tombol10;
    Intent pindah10;
    Button tombol11;
    Intent pindah11;
    Button tombol12;
    Intent pindah12;
    Button tombol13;
    Intent pindah13;
    Button tombol14;
    Intent pindah14;
    Button tombol15;
    Intent pindah15;
    Button tombol16;
    Intent pindah16;
    Button tombol17;
    Intent pindah17;
    Button tombol18;
    Intent pindah18;
    Button tombol19;
    Intent pindah19;
    Button tombol20;
    Intent pindah20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tombol10 = (Button)findViewById(R.id.nol);

        tombol10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah10 = new Intent(MainActivity4.this, nol.class);
                startActivity(pindah10);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });


        tombol11 = (Button)findViewById(R.id.satu);

        tombol11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah11 = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(pindah11);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol12 = (Button)findViewById(R.id.dua);

        tombol12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah12 = new Intent(MainActivity4.this, dua.class);
                startActivity(pindah12);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol13 = (Button)findViewById(R.id.tiga);

        tombol13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah13 = new Intent(MainActivity4.this, tiga.class);
                startActivity(pindah13);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol14 = (Button)findViewById(R.id.empat);

        tombol14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah14 = new Intent(MainActivity4.this, empat.class);
                startActivity(pindah14);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol15 = (Button)findViewById(R.id.lima);

        tombol15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah15 = new Intent(MainActivity4.this, lima.class);
                startActivity(pindah15);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol16 = (Button)findViewById(R.id.enam);

        tombol16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah16 = new Intent(MainActivity4.this, enam.class);
                startActivity(pindah16);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol17 = (Button)findViewById(R.id.tujuh);

        tombol17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah17 = new Intent(MainActivity4.this, tujuh.class);
                startActivity(pindah17);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol18 = (Button)findViewById(R.id.delapan);

        tombol18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah18 = new Intent(MainActivity4.this, delapan.class);
                startActivity(pindah18);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol19 = (Button)findViewById(R.id.sembilan);

        tombol19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah19 = new Intent(MainActivity4.this, sembilan.class);
                startActivity(pindah19);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

        tombol20 = (Button)findViewById(R.id.kembali1);

        tombol20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kode untuk pindah ke actifity lain
                pindah20 = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(pindah20);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });
    }
}
