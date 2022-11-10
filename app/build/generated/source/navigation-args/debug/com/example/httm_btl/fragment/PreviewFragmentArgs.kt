package com.example.httm_btl.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PreviewFragmentArgs(
  public val base64Bitmap: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("base64Bitmap", this.base64Bitmap)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("base64Bitmap", this.base64Bitmap)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PreviewFragmentArgs {
      bundle.setClassLoader(PreviewFragmentArgs::class.java.classLoader)
      val __base64Bitmap : String?
      if (bundle.containsKey("base64Bitmap")) {
        __base64Bitmap = bundle.getString("base64Bitmap")
        if (__base64Bitmap == null) {
          throw IllegalArgumentException("Argument \"base64Bitmap\" is marked as non-null but was passed a null value.")
        }
      } else {
        __base64Bitmap = ""
      }
      return PreviewFragmentArgs(__base64Bitmap)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PreviewFragmentArgs {
      val __base64Bitmap : String?
      if (savedStateHandle.contains("base64Bitmap")) {
        __base64Bitmap = savedStateHandle["base64Bitmap"]
        if (__base64Bitmap == null) {
          throw IllegalArgumentException("Argument \"base64Bitmap\" is marked as non-null but was passed a null value")
        }
      } else {
        __base64Bitmap = ""
      }
      return PreviewFragmentArgs(__base64Bitmap)
    }
  }
}
