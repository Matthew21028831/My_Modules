package sg.edu.rp.c36.id21028831.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnITSecurity;
    TextView btnMobileApp;
    TextView btnWebAppPHP;
    TextView btnSoftwareDevelopment;
    TextView btnUIUX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnITSecurity=findViewById(R.id.btnITSecurity);
        btnMobileApp=findViewById(R.id.btnMobileApp);
        btnWebAppPHP=findViewById(R.id.btnWebAppPHP );
        btnSoftwareDevelopment=findViewById(R.id.btnSoftwareDevelopment);
        btnUIUX=findViewById(R.id.btnUIUX);

        btnITSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDescription.class);
                intent.putExtra("module", "C235");
                intent.putExtra("C235_name", "IT Security and Management ");
                intent.putExtra("C235_year", "2022");
                intent.putExtra("C235_sem", "Sem 1");
                intent.putExtra("C235_credit", "4");
                intent.putExtra("C235_venue", "W65G");
                startActivity(intent);
            }
        });

        btnMobileApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDescription.class);
                intent.putExtra("module", "C346");
                intent.putExtra("C346_name", "Mobile App Development ");
                intent.putExtra("C346_year", "2022");
                intent.putExtra("C346_sem", "Sem 1");
                intent.putExtra("C346_credit", "4");
                intent.putExtra("C346_venue", "E62E");
                startActivity(intent);
            }
        });

        btnWebAppPHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDescription.class);
                intent.putExtra("module", "C203");
                intent.putExtra("C203_name", "Web Appln Development in php ");
                intent.putExtra("C203_year", "2022");
                intent.putExtra("C203_sem", "Sem 1");
                intent.putExtra("C203_credit", "4");
                intent.putExtra("C203_venue", "W65H");
                startActivity(intent);
            }
        });

        btnSoftwareDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDescription.class);
                intent.putExtra("module", "C206");
                intent.putExtra("C206_name", "Software Development Process ");
                intent.putExtra("C206_year", "2022");
                intent.putExtra("C206_sem", "Sem 1");
                intent.putExtra("C206_credit", "4");
                intent.putExtra("C206_venue", "E66K");
                startActivity(intent);
            }
        });

        btnUIUX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDescription.class);
                intent.putExtra("module", "C218");
                intent.putExtra("C218_name", "UI/UX Design for Apps ");
                intent.putExtra("C218_year", "2022");
                intent.putExtra("C218_sem", "Sem 1");
                intent.putExtra("C218_credit", "4");
                intent.putExtra("C218_venue", "E66B");
                startActivity(intent);
            }
        });
    }
}