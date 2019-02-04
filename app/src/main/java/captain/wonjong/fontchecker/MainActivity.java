package captain.wonjong.fontchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import captain.wonjong.fontchecker.databinding.ActivityMainBinding;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding   mBinding;
    private TextModel             mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mModel = new TextModel();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setLifecycleOwner(this);
        mBinding.setModel(mModel);

        mBinding.btnDelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mBinding.btnDelete) {
            mModel.text.setValue("");
        }
    }
}
