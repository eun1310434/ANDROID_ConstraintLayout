/*=====================================================================
□ INFORMATION
  ○ Data : 28.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ FUNCTION
  ○ XML을 활용한 Linear Layout Setting - BaseLine

□ STUDY
  ○ Constrain Layout
     - ConstraintLayout allows you to create large and complex layouts with a flat view hierarchy (no nested view groups).
       It's similar to RelativeLayout in that all views are laid out according to relationships between sibling views and the parent layout,
       but it's more flexible than RelativeLayout and easier to use with Android Studio's Layout Editor.
=====================================================================*/

package com.eun1310434.constraintlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
