package cl.cutiko.featurea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cl.cutiko.shared.Dog;
import cl.cutiko.shared.navigation.FeatureB;
import cl.cutiko.shared.navigation.FeatureC;

public class FeatureAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_a);
        View btnToB = findViewById(R.id.bBtn);
        btnToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FeatureB.ACTION));
            }
        });
        findViewById(R.id.cBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeatureC.ACTION);
                intent.putExtra(FeatureC.STRING_KEY_EXAMPLE, "This is a String data");
                Dog dog = new Dog("The name is Fido, legs: ", 3);
                intent.putExtra(FeatureC.STRING_SERIALIZABLE_EXAMPLE, dog);
                startActivity(intent);
            }
        });


    }
}
