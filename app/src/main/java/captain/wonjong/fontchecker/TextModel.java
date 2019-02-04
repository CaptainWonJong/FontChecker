package captain.wonjong.fontchecker;

import android.graphics.Color;

import androidx.lifecycle.MutableLiveData;

public class TextModel {
    public MutableLiveData<String> text = new MutableLiveData<>();
    public MutableLiveData<Integer> bgColor = new MutableLiveData<Integer>();
    public MutableLiveData<Integer> textColor = new MutableLiveData<>();
    public MutableLiveData<Integer> textSize = new MutableLiveData<>();

    public TextModel() {
        text.setValue("");
        bgColor.setValue(Color.rgb(200,200,200));
        textColor.setValue(Color.rgb(0,0,0));
        textSize.setValue(18);
    }
}
