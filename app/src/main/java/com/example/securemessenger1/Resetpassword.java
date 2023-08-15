package com.example.securemessenger1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Resetpassword extends AppCompatActivity {
    EditText old,newpwd,cnfpwd;
    Button save;
    String oldpassword,newpassword,cnfpassword;
    String pwd=AES.pwdtext.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);
        old=(EditText) findViewById(R.id.old);
        newpwd=(EditText) findViewById(R.id.newp);
        cnfpwd=(EditText) findViewById(R.id.cnfpwd);
        save=(Button) findViewById(R.id.save);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldpassword=old.getText().toString();
                newpassword=newpwd.getText().toString();
                cnfpassword=cnfpwd.getText().toString();
                if(pwd.equals(oldpassword)){
                    if(newpassword.equals(cnfpassword)){
                        AES.pwdtext=newpassword;
                        Toast.makeText(Resetpassword.this,"Updated Successfully!!",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                    else{
                        Toast.makeText(Resetpassword.this," password does not match",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Resetpassword.this," password does not match",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}