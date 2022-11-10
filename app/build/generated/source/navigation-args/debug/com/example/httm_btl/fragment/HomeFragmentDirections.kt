package com.example.httm_btl.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.httm_btl.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToPreviewFragment(
    public val base64Bitmap: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_previewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("base64Bitmap", this.base64Bitmap)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToPreviewFragment(base64Bitmap: String = ""): NavDirections =
        ActionHomeFragmentToPreviewFragment(base64Bitmap)
  }
}
