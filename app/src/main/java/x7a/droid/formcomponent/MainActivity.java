package x7a.droid.formcomponent;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn_obj = (Button)findViewById(R.id.btn_one);
        btn_obj.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){

                //RadioGroup Activity
//                RadioGroup rb_group_obj = (RadioGroup)findViewById(R.id.meat_rbg);
//                int selected_rb = rb_group_obj.getCheckedRadioButtonId();
//                RadioButton rb_obj = (RadioButton)findViewById(selected_rb);
//                Toast.makeText(MainActivity.this, rb_obj.getText().toString(), Toast.LENGTH_SHORT).show();

                //Checkbox Activity
                CheckBox shark = (CheckBox)findViewById(R.id.cb_shark);
                CheckBox whale = (CheckBox)findViewById(R.id.cb_whale);
                StringBuffer list_animal = new StringBuffer();
                list_animal.append("Shark : ").append(shark.isChecked()).append("\n");
                list_animal.append("Whale : ").append(whale.isChecked()).append("\n");
                Toast.makeText(MainActivity.this, list_animal.toString(), Toast.LENGTH_SHORT).show();


                //Button Activity
//              Toast.makeText(MainActivity.this, "Button Di Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        EditText txt_obj = (EditText)findViewById(R.id.txt_one);
//        EditText.setOnClickListener(new View.OnClickListener(){
//            @Override
//        public void onClick(View v){
//                Toast.makeText(MainActivity.this, "Inputkan Field", Toast.LENGTH_SHORT).show();
//            }
//        });




        //Alert Dailog Activity
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setCancelable(false)
                        .setTitle("Title Of Alert")
                        .setMessage("Do You Wanna Exit ?")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
//                                Toast.makeText(MainActivity.this, "YES", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "NO ACTION", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }

                        });
                alert.show();
            }
        });
    }




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
