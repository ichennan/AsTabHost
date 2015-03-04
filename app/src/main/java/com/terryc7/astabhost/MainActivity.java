package com.terryc7.astabhost;

import android.app.TabActivity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    private TabHost myTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        myTabHost = (TabHost)findViewById(android.R.id.tabhost);
//        myTabHost.setup();
        myTabHost = this.getTabHost();

        LayoutInflater.from(this).inflate(R.layout.activity_main, myTabHost.getTabContentView(), true);

        myTabHost.addTab(
                myTabHost.newTabSpec("1st")
                        .setIndicator("11st", getResources().getDrawable(R.mipmap.ic_launcher))
                        .setContent(R.id.linearLayout01)
        );
        myTabHost.addTab(
                myTabHost.newTabSpec("2nd")
                        .setIndicator("11st", getResources().getDrawable(R.mipmap.ic_launcher))
                        .setContent(R.id.linearLayout02)
        );
        myTabHost.addTab(
                myTabHost.newTabSpec("3rd")
                        .setIndicator("11st", getResources().getDrawable(R.mipmap.ic_launcher))
                        .setContent(R.id.linearLayout03)
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
