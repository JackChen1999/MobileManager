package com.google.mobilesafe.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.google.mobilesafe.R;
import com.google.mobilesafe.ui.fragment.LockFragment;
import com.google.mobilesafe.ui.fragment.UnLockFragment;
import com.google.mobilesafe.ui.widget.TabActionBarView;
import com.google.mobilesafe.ui.widget.TabActionBarView.ITabActionCallback;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AppLockActivity extends FragmentActivity implements
        ITabActionCallback {

    @Bind(R.id.ib_back)
    ImageButton ibBack;

    @Bind(R.id.fl_content)
    FrameLayout fl_content;

    @Bind(R.id.tab_view)
    TabActionBarView mTabView;

    private FragmentManager fragmentManager;
    private UnLockFragment unLockFragment;
    private LockFragment lockFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        setContentView(R.layout.activity_app_lock);
        ButterKnife.bind(this);
        fragmentManager = getSupportFragmentManager();
        mTabView.bindTab(this, "未加锁", "已加锁");
        mTabView.leftClick();

        ibBack.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * @des ITabActionCallback
     */
    @Override
    public void onLeftTabClick() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        unLockFragment = new UnLockFragment();
        transaction.replace(R.id.fl_content, unLockFragment).commit();

    }

    /**
     * @des ITabActionCallback
     */
    @Override
    public void onMiddleTabClick() {

    }

    /**
     * @des ITabActionCallback
     */
    @Override
    public void onRightClick() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        lockFragment = new LockFragment();
        transaction.replace(R.id.fl_content, lockFragment).commit();
    }

}
