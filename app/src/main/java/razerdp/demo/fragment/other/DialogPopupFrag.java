package razerdp.demo.fragment.other;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import razerdp.basepopup.BasePopupWindow;
import razerdp.basepopup.R;
import razerdp.demo.popup.DialogPopup;

/**
 * Created by 大灯泡 on 2016/1/15.
 * 客串dialog
 */
public class DialogPopupFrag extends SimpleBaseFrag {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onInitView(View rootView) {

    }

    @Override
    public BasePopupWindow getPopup() {
        return new DialogPopup(mContext);
    }

    @Override
    public Button getButton() {
        return (Button) mFragment.findViewById(R.id.popup_show);
    }

    @Override
    public View getFragment() {
        return mInflater.inflate(R.layout.frag_dialog_popup,container,false);
    }
}
