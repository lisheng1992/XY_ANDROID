package com.xy.component;

import java.util.HashMap;
import java.util.Map;

import android.os.AsyncTask;
import com.googlecode.androidannotations.annotations.EBean;
import com.xy.common.Constants;

/** 
 * @ClassName: RegisterComponent 
 * @Description: 注册组件
 * @author ls
 * @date 2015-2-11 下午4:40:45 
 */
@EBean
public class RegisterComponent {

	public void executeRegister (String userName , String password , String email , String age){
		new Register().doExecute(userName,password,email,age);
	}

	/*
	 * 
	 * 入口
	 */
	class Register extends RegisterTask {

		@Override
		Integer doExecute(String... objs) {
			return registerRmote(objs[0], objs[1], objs[2], objs[3]);
		}
		
	}
	
	private Integer registerRmote (String userName , String password , String email , String age) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userName", userName);
		params.put("password", password);
		params.put("email", email);
		params.put("age", age);
		return registerRmote(params);
	}
	
	
	
	private Integer registerRmote (Map<String, String> params) {
		if (true) {
			registerRmote(Constants.URL_REGISTER, params);
		} 
		return -1;
	}
	
	private Integer registerRmote (String url , Map<String, String> params) {
		return -2;
	}
	
	abstract class RegisterTask extends AsyncTask<String, Void, Integer>{
		
		abstract Integer doExecute(String...objs);
		
		@Override
		protected Integer doInBackground(String... objs) {
			// TODO Auto-generated method stub
			return doExecute(objs);
		}
		
		@Override
		protected void onPostExecute(Integer result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
		}
		
		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
		}
	}
}
