package cl.cutiko.featurea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cl.cutiko.shared.Dog;

public class FeatureAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_a);
        View btnToB = findViewById(R.id.bBtn);
        btnToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(FeatureAActivity.this, Class.forName("cl.cutiko.featureb.FeatureBActivity"));
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.cBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("cl.cutiko.MULTINAV.CUSTOM_ACTION");
                intent.putExtra("KEY_A", "hello");
                Dog dog = new Dog("Do have 3 legs", 3);
                intent.putExtra("KEY_A_DOG", dog);
                intent.setData(Uri.parse("example://moultinav"));
                startActivity(intent);
            }
        });


    }
}
