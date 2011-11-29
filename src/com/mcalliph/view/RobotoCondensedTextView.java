package com.mcalliph.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * User: mcalliph
 * Date: 11/23/11
 * Time: 6:16 PM
 */
public class RobotoCondensedTextView extends RobotoTextView {

  private static final String FONT_ROBOTO_REGULAR = "fonts/Roboto-Condensed.ttf";
  private static final String FONT_ROBOTO_BOLD = "fonts/Roboto-BoldCondensed.ttf";
  private static final String FONT_ROBOTO_ITALIC = "fonts/Roboto-CondensedItalic.ttf";
  private static final String FONT_ROBOTO_BOLD_ITALIC = "fonts/Roboto-BoldCondensedItalic.ttf";

  public RobotoCondensedTextView(Context context) {
    super(context);
  }

  public RobotoCondensedTextView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public RobotoCondensedTextView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  protected String typefaceMap(int style) {
    switch (style) {
      case Typeface.BOLD:
        return FONT_ROBOTO_BOLD;
      case Typeface.BOLD_ITALIC:
        return FONT_ROBOTO_BOLD_ITALIC;
      case Typeface.ITALIC:
        return FONT_ROBOTO_ITALIC;
      case Typeface.NORMAL:
      default:
        return FONT_ROBOTO_REGULAR;
    }
  }

}
