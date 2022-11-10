// Generated by data binding compiler. Do not edit!
package com.example.httm_btl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.httm_btl.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPreviewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final Button btnSend;

  @NonNull
  public final ImageView img;

  @NonNull
  public final FrameLayout layout;

  protected FragmentPreviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView btnBack, Button btnSave, Button btnSend, ImageView img, FrameLayout layout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.btnSave = btnSave;
    this.btnSend = btnSend;
    this.img = img;
    this.layout = layout;
  }

  @NonNull
  public static FragmentPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_preview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPreviewBinding>inflateInternal(inflater, R.layout.fragment_preview, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_preview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPreviewBinding>inflateInternal(inflater, R.layout.fragment_preview, null, false, component);
  }

  public static FragmentPreviewBinding bind(@NonNull View view) {
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
  public static FragmentPreviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPreviewBinding)bind(component, view, R.layout.fragment_preview);
  }
}
