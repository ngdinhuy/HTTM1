package com.example.httm_btl;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.httm_btl.databinding.FragmentCaptureImageBindingImpl;
import com.example.httm_btl.databinding.FragmentHomeBindingImpl;
import com.example.httm_btl.databinding.FragmentPreviewBindingImpl;
import com.example.httm_btl.databinding.FragmentResultBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCAPTUREIMAGE = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTPREVIEW = 3;

  private static final int LAYOUT_FRAGMENTRESULT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.httm_btl.R.layout.fragment_capture_image, LAYOUT_FRAGMENTCAPTUREIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.httm_btl.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.httm_btl.R.layout.fragment_preview, LAYOUT_FRAGMENTPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.httm_btl.R.layout.fragment_result, LAYOUT_FRAGMENTRESULT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCAPTUREIMAGE: {
          if ("layout/fragment_capture_image_0".equals(tag)) {
            return new FragmentCaptureImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_capture_image is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPREVIEW: {
          if ("layout/fragment_preview_0".equals(tag)) {
            return new FragmentPreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESULT: {
          if ("layout/fragment_result_0".equals(tag)) {
            return new FragmentResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_result is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_capture_image_0", com.example.httm_btl.R.layout.fragment_capture_image);
      sKeys.put("layout/fragment_home_0", com.example.httm_btl.R.layout.fragment_home);
      sKeys.put("layout/fragment_preview_0", com.example.httm_btl.R.layout.fragment_preview);
      sKeys.put("layout/fragment_result_0", com.example.httm_btl.R.layout.fragment_result);
    }
  }
}
