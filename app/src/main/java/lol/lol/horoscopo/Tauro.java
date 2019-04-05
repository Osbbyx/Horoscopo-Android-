package lol.lol.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import lol.lol.horoscopo.R;

public class Tauro extends AppCompatActivity implements RewardedVideoAdListener {

    RewardedVideoAd mAd;
    private AdView mAdView;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tauro);

        mButton = findViewById(R.id.btn11);
        mButton.setEnabled(false);

        MobileAds.initialize(this, "ca-app-pub-8718810071299222/2028665027");
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAd.loadAd("ca-app-pub-8718810071299222/2028665027",new AdRequest.Builder().build());

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mAd.isLoaded()){
                    mAd.show();
                }
            }
        });
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        mButton.setEnabled(true);
    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        Intent daily = new Intent(this, Daily.class);
        startActivity(daily);
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}
