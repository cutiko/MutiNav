package cl.cutiko.featurec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import cl.cutiko.shared.Dog;
import cl.cutiko.shared.navigation.FeatureC;

public class FeatureCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_c);

        String extra = getIntent().getStringExtra(FeatureC.STRING_KEY_EXAMPLE);
        //Toast.makeText(this, String.valueOf(extra), Toast.LENGTH_SHORT).show();

        Dog dog = (Dog) getIntent().getSerializableExtra(FeatureC.STRING_SERIALIZABLE_EXAMPLE);
        if (dog != null) {
            Toast.makeText(this, dog.getName() + ": " + dog.getLegs(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Doesn't work with serializable", Toast.LENGTH_SHORT).show();
        }
    }
}
