package iam.swivel.switchbetweenactivities;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // กำหนดค่า
    EditText input_code, input_name, input_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // อ้างอิงค่ากำหนดของ Activity
        input_code = (EditText)findViewById(R.id.pd_code);
        input_name = (EditText)findViewById(R.id.pd_name);
        input_desc = (EditText)findViewById(R.id.pd_desc);

        Button btnNextScreen = (Button)findViewById(R.id.btnNextScreen);

        // Listening to button
        btnNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), SecondActivity.class);

                // ส่งค่าที่รับจากหน้า main ไปที่ screen2
                nextScreen.putExtra("code", input_code.getText().toString());
                nextScreen.putExtra("name", input_name.getText().toString());
                nextScreen.putExtra("desc", input_desc.getText().toString());

                Log.e("n", input_code.getText() + ", " + input_name.getText() + ", " + input_desc.getText());

                // เคลียร์ฟอร์ม main
                input_code.setText("");
                input_name.setText("");
                input_desc.setText("");
                input_code.requestFocus();

                // เรียกเปิด screen2
                startActivity(nextScreen);
            }
        });
    }
}