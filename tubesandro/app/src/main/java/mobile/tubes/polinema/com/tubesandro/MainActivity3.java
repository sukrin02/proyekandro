package mobile.tubes.polinema.com.tubesandro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements ResepListFragment.Listener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }


    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.detail_frag);
        if(fragmentContainer != null){
            ResepDetailFragment frag = new ResepDetailFragment();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            frag.setResep(id);

            ft.replace(R.id.detail_frag, frag);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);

            ft.commit();

        }
        else
        {
            Toast.makeText(this,"Item"+id+"Was Clicked", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this.getApplicationContext(), DetailActivity.class);
            Bundle b = new Bundle();
            b.putLong("id",id);
            i.putExtras(b);
            startActivity(i);
        }
    }

}
