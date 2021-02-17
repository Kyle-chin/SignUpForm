package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.btn_save);
        TextView Name = findViewById(R.id.NameEditText);
        TextView Email = findViewById(R.id.editEmailAddress);
        TextView Password = findViewById(R.id.editTextPassword);
        TextView Confirm_Password = findViewById(R.id.editTextPassword2);


        TextView nameError = findViewById(R.id.Name_error);
        TextView EmailError = findViewById(R.id.Email_error);
        TextView PasswordError = findViewById(R.id.Password_error);
        TextView ConfirmError = findViewById(R.id.Confirm_Password_error);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(Name.getText().toString())){
                    nameError.setVisibility(View.VISIBLE);
                    Name.requestFocus();
                }
                else{
                    nameError.setVisibility(View.INVISIBLE);
                }
                if(TextUtils.isEmpty(Email.getText().toString())){
                    EmailError.setVisibility(View.VISIBLE);
                    Email.requestFocus();
                }
                else{
                    EmailError.setVisibility(View.INVISIBLE);
                }
                if(TextUtils.isEmpty(Password.getText().toString())){
                    PasswordError.setVisibility(View.VISIBLE);
                    Password.requestFocus();
                }
                else{
                    PasswordError.setVisibility(View.INVISIBLE);
                }
                if(TextUtils.isEmpty(Confirm_Password.getText().toString())){
                    ConfirmError.setVisibility(View.VISIBLE);
                    Confirm_Password.requestFocus();
                }
                else{
                    ConfirmError.setVisibility(View.INVISIBLE);
                }
                //commit 2 was not saved for some reason
                if((TextUtils.isEmpty(Password.getText().toString()) != true) && (TextUtils.isEmpty(Confirm_Password.getText().toString()) != true)){
                    if((TextUtils.isEmpty(Name.getText().toString()) != true) && (TextUtils.isEmpty(Email.getText().toString()) != true)){
                        if(Password.getText().toString().equals(Confirm_Password.getText().toString())){
                            Toast.makeText(FormActivity.this, "Welcome, " + Name.getText() + ", to the sign up application!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(FormActivity.this, "Passwords Must Match Each Other", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });


    }
}