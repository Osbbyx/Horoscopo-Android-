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

public class Escorpio extends AppCompatActivity  implements RewardedVideoAdListener {

    RewardedVideoAd mAd;
    Button mButton;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escorpio);

        mButton = findViewById(R.id.btn5);
        mButton.setEnabled(false);

        MobileAds.initialize(this, "ca-app-pub-8718810071299222/2028665027");
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mAd.isLoaded()){
                    mAd.show();
                }
            }
        });


        mAd.loadAd("ca-app-pub-8718810071299222/2028665027",new AdRequest.Builder().build());




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
