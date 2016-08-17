package com.along.playdemo.fragment;

import android.view.View;
import android.widget.TextView;

public class SubjectFragment extends BaseFragment {
	 
	public View getSuccessView() {
		//创建视图的对象
		TextView mTextView = new TextView(getActivity());
		//设置当前的视图参数
		mTextView.setText(this.getClass().getSimpleName());
		//返回当前的视图
		return mTextView;
	}

	public Object getLoadData() {
		return null;
	}

}
