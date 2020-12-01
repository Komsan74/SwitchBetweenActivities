package iam.swivel.switchbetweenactivities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        // ค่ากำหนดของ activity
        TextView txtCode = (TextView)findViewById(R.id.txtCode);
        TextView txtName = (TextView)findViewById(R.id.txtName);
        TextView txtDesc = (TextView)findViewById(R.id.txtDesc);

        Button btnClose = (Button)findViewById(R.id.btnClose);

        Intent intent = getIntent();
        // ข้อมูลที่รับมาจาก intent
        String code = intent.getStringExtra("code");
        String name = intent.getStringExtra("name");
        String desc = intent.getStringExtra("desc");

        Log.e("Second Screen", code + ", " + name + ", " + desc);

        // แสดงค่าที่รับมาใน activity
        txtCode.setText(code);
        txtName.setText(name);
        txtDesc.setText(desc);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ปิดหน้าจอนี้
                finish();
            }
        });
    }
}
