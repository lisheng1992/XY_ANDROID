package com.xy.activity;

import android.widget.TextView;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.xy.R;
import com.xy.common.BaseActivity;

@EActivity(R.layout.activity_changetestinform)
public class ChangeTestInformActivity extends BaseActivity {
	
	@ViewById(R.id.textView1)
	TextView textView1;
	
	@AfterViews
	public void init(){
		textView1.setText(R.string.main_change_jcgzytx_txt);
	}
	
	@Click(R.id.main_topleft_img)
	public void back(){
		this.finish();
	}

}
