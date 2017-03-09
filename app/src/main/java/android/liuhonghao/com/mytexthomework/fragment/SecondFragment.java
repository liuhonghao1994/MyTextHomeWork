package android.liuhonghao.com.mytexthomework.fragment;

import android.liuhonghao.com.mytexthomework.base.BaseFragment;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 刘红豪 on 2017/3/9.
 */

public class SecondFragment extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {
        textView=new TextView(mcontext);
        textView.setGravity(Gravity.CENTER);

        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("SecondFragment");
    }
}
