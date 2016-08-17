package com.along.playdemo.fragment;

import android.support.v4.app.Fragment;

/****
 * 碎片的添加工厂.根据ID添加不同的碎片操作
 */
public class FragmentFactory {

	// 定义方法(根据位置position.添加不同的Fragment)
	public static Fragment createFragment(int position) {
		// 定义Fragment的对象
		Fragment fragment = null;
		// 分支选择创建不同的Fragment
		switch (position) {
		case 0:
			fragment = new GameFragment();
			break;
		case 1:
			fragment = new SubjectFragment();
			break;
		case 2:
			fragment = new RecommendFragment();
			break;
		case 3:
			fragment = new HotFragment();
			break;
		}
		// 得到添加的Fragment的对象
		return fragment;
	}

}
