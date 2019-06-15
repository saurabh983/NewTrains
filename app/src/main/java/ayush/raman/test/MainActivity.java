package ayush.raman.test;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView ayush;
    TextView raman;
    TextView saurabh;
    Button btn1;
    EditText edt1,edt2;
  Button btn2;

  String hello, hello2;
  int a,b,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ayush = findViewById(R.id.ayush);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
    ayush.setText("Hello Ayush") ;
        raman = findViewById(R.id.raman);
        saurabh = findViewById(R.id.saurabh);
        raman.setText("Hello Raman");
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        hello = "hi how r u?";
        hello2 = "Hi .";
        a = 10;
        b= 20;

        saurabh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                raman.setText("Bye Bye Raman");

//                Toast.makeText(MainActivity.this,"kya haal chal",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Badia bhai", Toast.LENGTH_SHORT).show();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                edt1.getText().toString()
                Toast.makeText(MainActivity.this, edt1.getText().toString(), Toast.LENGTH_SHORT).show();

                ayush.setText(edt1.getText().toString()) ;
            }
        });
 btn2.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         if (edt1.getText().toString().equals("") || edt2.getText().toString().equals("")){
             Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();
         }
     else {
             a = Integer.parseInt(edt1.getText().toString());
             b= Integer.parseInt(edt2.getText().toString());
             sum=a+b;
             saurabh.setText(String.valueOf(sum));
         }

     }
 });
    }
}
