// Generated by data binding compiler. Do not edit!
package com.example.httm_btl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.httm_btl.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCaptureImageBinding extends ViewDataBinding {
  protected FragmentCaptureImageBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static FragmentCaptureImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_capture_image, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCaptureImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCaptureImageBinding>inflateInternal(inflater, R.layout.fragment_capture_image, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCaptureImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_capture_image, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCaptureImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCaptureImageBinding>inflateInternal(inflater, R.layout.fragment_capture_image, null, false, component);
  }

  public static FragmentCaptureImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentCaptureImageBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCaptureImageBinding)bind(component, view, R.layout.fragment_capture_image);
  }
}
