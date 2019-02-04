package captain.wonjong.fontchecker;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;

public class ChangeDialog {
    private Context mContext;
    private Dialog mDialog;

    // Singleton
    private static ChangeDialog uniqueInstance = new ChangeDialog();
    public static ChangeDialog getInstance() {
        return uniqueInstance;
    }

    public ChangeDialog show(@NonNull Context context) {
        mContext = context;

        mDialog = new Dialog(mContext, R.style.ChangeDialogStyle);
        mDialog.setCancelable(true);
        mDialog.setCanceledOnTouchOutside(true);
        mDialog.setContentView(R.layout.layout_change_dialog);

        try {
            mDialog.show();
        } catch (Exception e) {
            mDialog = null;
        }

        return getInstance();
    }

}
