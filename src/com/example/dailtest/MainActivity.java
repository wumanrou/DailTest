package com.example.dailtest;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText=(EditText)findViewById(R.id.number);
		Button myBtn=(Button)findViewById(R.id.btnboda);
		myBtn.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				//���ַ���ת��ΪURI����
				Uri uri=Uri.parse("tel:"+editText.getText().toString());
				//��һ��������ʾ�����Ķ�����ϵͳ�����������ò��Ź��ܣ��ڶ�����������ָ�����������ݣ��������ĸ�����
				Intent intent=new Intent(Intent.ACTION_CALL,uri);
				MainActivity.this.startActivity(intent);
			}
		});
	}

}
