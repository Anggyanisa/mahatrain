package id.sch.smktelkom_mlg.tugas01.xirpl5004.mahatrain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText etdate;
    Spinner sdeparture;
    Spinner sarrival;
    Button bok;
    TextView tvhasil;
    TextView tvhasil2;
    CheckBox ind, west, kra, mid;
    RadioButton eco, ecopre, buss, first;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnama = (EditText) findViewById(R.id.etnama);
        etdate = (EditText) findViewById(R.id.etdate);
        sdeparture = (Spinner) findViewById(R.id.sdeparture);
        sarrival = (Spinner) findViewById(R.id.sarrival);
        ind = (CheckBox) findViewById(R.id.ind);
        west = (CheckBox) findViewById(R.id.west);
        kra = (CheckBox) findViewById(R.id.kra);
        mid = (CheckBox) findViewById(R.id.mid);
        eco = (RadioButton) findViewById(R.id.eco);
        ecopre = (RadioButton) findViewById(R.id.ecopre);
        buss = (RadioButton) findViewById(R.id.buss);
        first = (RadioButton) findViewById(R.id.first);
        bok = (Button) findViewById(R.id.Bok);
        tvhasil2 = (TextView) findViewById(R.id.tvhasil);
        tvhasil = (TextView) findViewById(R.id.tvhasil2);
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });
    }


    private void doProcess() {
        if (isValid()) {
            String nama1 = etnama.getText().toString();
            String date1 = etdate.getText().toString();
            String departure1 = sdeparture.getSelectedItem().toString();
            String arrival1 = sarrival.getSelectedItem().toString();
            String hasil1 = "Makanan yang di pilih adalah : \n";
            int startlen = hasil1.length();
            if (ind.isChecked()) hasil1 += ind.getText() + "\n";
            if (west.isChecked()) hasil1 += west.getText() + "\n";
            if (kra.isChecked()) hasil1 += kra.getText() + "\n";
            if (mid.isChecked()) hasil1 += mid.getText() + "\n";
            if (hasil1.length() == startlen) hasil1 += "Anda Memilih Makanan Biasa";
            String hasil2 = null;
            if (eco.isChecked()) {
                hasil2 = eco.getText().toString();
            } else if (ecopre.isChecked()) {
                hasil2 = ecopre.getText().toString();
            } else if (buss.isChecked()) {
                hasil2 = buss.getText().toString();
            } else if (first.isChecked()) {
                hasil2 = first.getText().toString();
            }

        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama1 = etnama.getText().toString();
        if (nama1.isEmpty()) {
            etnama.setError("Nama Belum Diisi");
            valid = false;
        } else {
            etnama.setError(null);
        }

        String date1 = etdate.getText().toString();
        if (date1.isEmpty()) {
            etdate.setError("Tanggal Berangkat Belum Diisi");
            valid = false;
        } else {
            etdate.setError(null);
        }

        return valid;

    }
}



