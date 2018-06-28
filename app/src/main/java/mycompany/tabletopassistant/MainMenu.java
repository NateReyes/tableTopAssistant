package mycompany.tabletopassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class MainMenu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout nDrawerLayout;
    private ActionBarDrawerToggle nToggle;
    private FirebaseAuth mAuth;

    private Toolbar nToolbar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();

        setContentView(R.layout.activity_main_menu);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            CreateCharacter  cc = new CreateCharacter();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            cc.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, cc).commit();
        }


        nToolbar = (Toolbar)  findViewById(R.id.nav_action);
        setSupportActionBar(nToolbar);

        nDrawerLayout =(DrawerLayout) findViewById(R.id.activity_main_menu);
        nToggle = new ActionBarDrawerToggle(this, nDrawerLayout, R.string.open, R.string.close);

        nDrawerLayout.addDrawerListener(nToggle);
        nToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(nToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Fragment newFragment;
        //select options in the navigation drawer
        if(id == R.id.make_race){
            // Create fragment and give it an argument specifying the article it should show
            newFragment = (MakeRace) new MakeRace();

        }
        else if(id == R.id.make_class){
            // Create fragment and give it an argument specifying the article it should show
            newFragment = (MakeClass) new MakeClass();
        }
        else if(id == R.id.make_item){
            // Create fragment and give it an argument specifying the article it should show
            newFragment = (MakeItem) new MakeItem();
        }
        else if(id == R.id.characters){
            // Create fragment and give it an argument specifying the article it should show
            newFragment = (Characters) new Characters();
        }
        else {
            return false;
        }
        Bundle args = new Bundle();
        newFragment.setArguments(args);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
        return false;

    }
}
