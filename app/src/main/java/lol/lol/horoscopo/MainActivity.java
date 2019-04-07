package lol.lol.horoscopo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import lol.lol.horoscopo.R;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        mp = MediaPlayer.create(this,R.raw.airline);
        mp.setLooping(true);
        mp.start();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

      
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.capricornio) {
        Intent capricornio = new Intent(this, lol.lol.horoscopo.capricornio.class);
            startActivity(capricornio);
        } else if (id == R.id.acuario) {
            Intent acuario = new Intent(this, Acuario.class);
            startActivity(acuario);
        } else if (id == R.id.piscis) {
            Intent piscis = new Intent(this, Piscis.class);
            startActivity(piscis);
        } else if (id == R.id.aries) {
            Intent aries = new Intent(this, Aries.class);
            startActivity(aries);
        } else if (id == R.id.tauro) {
            Intent tauro = new Intent(this, Tauro.class);
            startActivity(tauro);
        } else if (id == R.id.geminis) {
            Intent geminis = new Intent(this, Geminis.class);
            startActivity(geminis);
        }else if (id == R.id.cancer) {
            Intent cancer = new Intent(this, Cancer.class);
            startActivity(cancer);
        }else if (id == R.id.leo) {
            Intent leo = new Intent(this, Leo.class);
            startActivity(leo);
        }else if (id == R.id.virgo) {
            Intent virgo = new Intent(this, Virgo.class);
            startActivity(virgo);
        }else if (id == R.id.libra) {
            Intent libra = new Intent(this, Libra.class);
            startActivity(libra);
        }else if (id == R.id.escorpio) {
            Intent escorpio = new Intent(this, Escorpio.class);
            startActivity(escorpio);
        }else if (id == R.id.sagitario) {
            Intent sagitario = new Intent(this, Sagitario.class);
            startActivity(sagitario);

        }else if (id == R.id.acerca_de) {
            Intent acerca_de = new Intent(this, about.class);
            startActivity(acerca_de);
        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void Seleccion(View view){
        switch (view.getId()) {
            case R.id.a:
                Intent a = new Intent(this, capricornio.class);
                startActivity(a);
                break;
            case R.id.a1:
                Intent a2 = new Intent(this, capricornio.class);
                startActivity(a2);
                break;
            case R.id.b:
                Intent b = new Intent(this, Acuario.class);
                startActivity(b);
                break;
            case R.id.b2:
                Intent b1 = new Intent(this, Acuario.class);
                startActivity(b1);
                break;
            case R.id.c:
                Intent c = new Intent(this, Piscis.class);
                startActivity(c);
                break;
            case R.id.c1:
                Intent c1 = new Intent(this, Piscis.class);
                startActivity(c1);
                break;
            case R.id.d:
                Intent d = new Intent(this, Aries.class);
                startActivity(d);
                break;
            case R.id.d1:
                Intent d1 = new Intent(this, Aries.class);
                startActivity(d1);
                break;
            case R.id.e:
                Intent e = new Intent(this, Tauro.class);
                startActivity(e);
                break;
            case R.id.e1:
                Intent e1 = new Intent(this, Tauro.class);
                startActivity(e1);
                break;
            case R.id.f:
                Intent f = new Intent(this, Geminis.class);
                startActivity(f);
                break;
            case R.id.f1:
                Intent f1 = new Intent(this, Geminis.class);
                startActivity(f1);
                break;
            case R.id.g:
                Intent h = new Intent(this, Cancer.class);
                startActivity(h);
                break;
            case R.id.g1:
                Intent h1 = new Intent(this, Cancer.class);
                startActivity(h1);
                break;
            case R.id.h:
                Intent i = new Intent(this, Leo.class);
                startActivity(i);
                break;
            case R.id.h1:
                Intent i1 = new Intent(this, Leo.class);
                startActivity(i1);
                break;
            case R.id.i:
                Intent j = new Intent(this, Virgo.class);
                startActivity(j);
                break;
            case R.id.i1:
                Intent j1 = new Intent(this, Virgo.class);
                startActivity(j1);
                break;
            case R.id.j:
                Intent g = new Intent(this, Libra.class);
                startActivity(g);
                break;
            case R.id.j1:
                Intent g1 = new Intent(this, Libra.class);
                startActivity(g1);
                break;
            case R.id.k:
                Intent k = new Intent(this, Escorpio.class);
                startActivity(k);
                break;
            case R.id.k1:
                Intent k1 = new Intent(this, Escorpio.class);
                startActivity(k1);
                break;
            case R.id.l:
                Intent l = new Intent(this, Sagitario.class);
                startActivity(l);
                break;
            case R.id.l1:
                Intent l1 = new Intent(this, Sagitario.class);
                startActivity(l1);
                break;
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (this.isFinishing()){
            mp.stop();
        }
    }
}
