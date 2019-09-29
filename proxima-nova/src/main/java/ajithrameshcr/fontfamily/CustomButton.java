package ajithrameshcr.fontfamily;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class CustomButton extends androidx.appcompat.widget.AppCompatButton {

    String customFont;

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        style(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        style(context, attrs);

    }

    private void style(Context context, AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.CustomTextView);
        int cf = a.getInteger(R.styleable.CustomTextView_fontName, 0);
        int fontName = 0;
        switch (cf) {
            case 1:
                fontName = R.string.ProximaNova_Bold;
                break;
            case 2:
                fontName = R.string.ProximaNova_Extrabld;
                break;
            case 3:
                fontName = R.string.ProximaNova_Light;
                break;
            case 4:
                fontName = R.string.ProximaNova_LightIt;
                break;
            case 5:
                fontName = R.string.ProximaNova_Regular;
                break;
            case 6:
                fontName = R.string.ProximaNova_RegularIt;
                break;
            case 7:
                fontName = R.string.ProximaNova_Semibold;
                break;
            case 8:
                fontName = R.string.ProximaNova_SemiboldIt;
                break;
            case 9:
                fontName = R.string.GOT;
                break;
            default:
                break;
        }

        customFont = getResources().getString(fontName);

        try {
            Typeface tf = Typeface.createFromAsset(context.getAssets(),
                    customFont + ".otf");
            setTypeface(tf);
        } catch (Exception e) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(),
                    customFont + ".ttf");
            setTypeface(tf);
        }
            a.recycle();
        }
    }