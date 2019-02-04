package captain.wonjong.fontchecker;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import captain.wonjong.fontchecker.databinding.ActivityMainBinding;
import captain.wonjong.fontchecker.model.TextModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context               mContext;
    private ActivityMainBinding   mBinding;
    private TextModel             mModel;

    private ChangeDialog          mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        mModel = new TextModel();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setLifecycleOwner(this);
        mBinding.setModel(mModel);

        mBinding.btnDelete.setOnClickListener(this);
        mBinding.btnSettingBg.setOnClickListener(this);
        mBinding.btnSettingTextSize.setOnClickListener(this);
        mBinding.btnSettingTextColor.setOnClickListener(this);
        mBinding.btnSettingTextFont.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Delete
        if (view == mBinding.btnDelete) {
            mModel.text.setValue("");
        }

        // setting Background Color
        else if (view == mBinding.btnSettingBg) {
        }

        // setting Text Color
        else if (view == mBinding.btnSettingTextColor) {

        }

        // setting Text Size
        else if (view == mBinding.btnSettingTextSize) {

        }

        // setting Text Font
        else if (view == mBinding.btnSettingTextFont) {

        }
    }
}
