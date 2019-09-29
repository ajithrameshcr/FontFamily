# FontFamily

How to use

Step 1. Add the JitPack repository to your build file - 

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.ajithrameshcr:FontFamily:0.1.0'
	}
	
step 3. Add Custom views in XML file

# TextView
	
	<ajithrameshcr.fontfamily.CustomTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hai"
        android:textSize="30sp"
        app:fontName="ProximaNova_Bold"
        />	
	
# SearchView

	<ajithrameshcr.fontfamily.CustomSearchView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        app:fontName="ProximaNova_Light"
        />

# Button

	<ajithrameshcr.fontfamily.CustomButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hai"
        android:textSize="30sp"
        app:fontName="ProximaNova_Regular"
        />
	
# EditText	
	<ajithrameshcr.fontfamily.CustomEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hai"
        android:textSize="30sp"
        app:fontName="ProximaNova_Semibold"
        />


