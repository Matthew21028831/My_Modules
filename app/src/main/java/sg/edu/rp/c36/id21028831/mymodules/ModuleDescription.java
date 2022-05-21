package sg.edu.rp.c36.id21028831.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDescription extends AppCompatActivity {

    TextView displayCode;
    TextView displayName;
    TextView displayYear;
    TextView displaySem;
    TextView displayCredit;
    TextView displayVenue;
    TextView backHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_description);

        displayCode=findViewById(R.id.displayCode);
        displayName=findViewById(R.id.displayName);
        displayYear=findViewById(R.id.displayYear);
        displaySem=findViewById(R.id.displaySem);
        displayCredit=findViewById(R.id.displayCredit);
        displayVenue=findViewById(R.id.displayVenue);
        backHome=findViewById(R.id.backHome);

        Intent intentReceived=getIntent();
        String moduleSelected=intentReceived.getStringExtra("module");
        if (moduleSelected.trim().equalsIgnoreCase("C235")){
            displayCode.setText("Module code: "+moduleSelected);

            String moduleName=intentReceived.getStringExtra("C235_name");
            String moduleYear=intentReceived.getStringExtra("C235_year");
            String moduleSem=intentReceived.getStringExtra("C235_sem");
            String moduleCredit=intentReceived.getStringExtra("C235_credit");
            String moduleVenue=intentReceived.getStringExtra("C235_venue");

            displayName.setText("Module Name: "+moduleName);
            displayYear.setText("Module Year: "+moduleYear);
            displaySem.setText("Module Sem: "+moduleSem);
            displayCredit.setText("Module Credit: "+moduleCredit);
            displayVenue.setText("Module Venue: "+moduleVenue);

        } else if(moduleSelected.trim().equalsIgnoreCase("C346")){
            displayCode.setText("Module code: "+moduleSelected);

            String moduleName=intentReceived.getStringExtra("C346_name");
            String moduleYear=intentReceived.getStringExtra("C346_year");
            String moduleSem=intentReceived.getStringExtra("C346_sem");
            String moduleCredit=intentReceived.getStringExtra("C346_credit");
            String moduleVenue=intentReceived.getStringExtra("C346_venue");

            displayName.setText("Module Name: "+moduleName);
            displayYear.setText("Module Year: "+moduleYear);
            displaySem.setText("Module Sem: "+moduleSem);
            displayCredit.setText("Module Credit: "+moduleCredit);
            displayVenue.setText("Module Venue: "+moduleVenue);

        }else if(moduleSelected.trim().equalsIgnoreCase("C203")){
            displayCode.setText("Module code: "+moduleSelected);

            String moduleName=intentReceived.getStringExtra("C203_name");
            String moduleYear=intentReceived.getStringExtra("C203_year");
            String moduleSem=intentReceived.getStringExtra("C203_sem");
            String moduleCredit=intentReceived.getStringExtra("C203_credit");
            String moduleVenue=intentReceived.getStringExtra("C203_venue");

            displayName.setText("Module Name: "+moduleName);
            displayYear.setText("Module Year: "+moduleYear);
            displaySem.setText("Module Sem: "+moduleSem);
            displayCredit.setText("Module Credit: "+moduleCredit);
            displayVenue.setText("Module Venue: "+moduleVenue);

        }else if(moduleSelected.trim().equalsIgnoreCase("C206")){
            displayCode.setText("Module code: "+moduleSelected);

            String moduleName=intentReceived.getStringExtra("C206_name");
            String moduleYear=intentReceived.getStringExtra("C206_year");
            String moduleSem=intentReceived.getStringExtra("C206_sem");
            String moduleCredit=intentReceived.getStringExtra("C206_credit");
            String moduleVenue=intentReceived.getStringExtra("C206_venue");

            displayName.setText("Module Name: "+moduleName);
            displayYear.setText("Module Year: "+moduleYear);
            displaySem.setText("Module Sem: "+moduleSem);
            displayCredit.setText("Module Credit: "+moduleCredit);
            displayVenue.setText("Module Venue: "+moduleVenue);

        }else if(moduleSelected.trim().equalsIgnoreCase("C218")){
            displayCode.setText("Module code: "+moduleSelected);

            String moduleName=intentReceived.getStringExtra("C218_name");
            String moduleYear=intentReceived.getStringExtra("C218_year");
            String moduleSem=intentReceived.getStringExtra("C218_sem");
            String moduleCredit=intentReceived.getStringExtra("C218_credit");
            String moduleVenue=intentReceived.getStringExtra("C218_venue");

            displayName.setText("Module Name: "+moduleName);
            displayYear.setText("Module Year: "+moduleYear);
            displaySem.setText("Module Sem: "+moduleSem);
            displayCredit.setText("Module Credit: "+moduleCredit);
            displayVenue.setText("Module Venue: "+moduleVenue);

        }

        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}