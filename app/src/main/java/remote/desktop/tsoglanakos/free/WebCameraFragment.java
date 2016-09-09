package remote.desktop.tsoglanakos.free;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tsoglani on 18/8/2015.
 */
public class WebCameraFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(remote.desktop.tsoglanakos.free.R.layout.web_camera,container,false);
    }

}
