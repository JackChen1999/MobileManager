package com.google.mobilesafe.domain;

import android.graphics.drawable.Drawable;
/**
 * ============================================================
 * Copyright：Google有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：MobileSafe
 * Package_Name：com.google.mobilesafe
 * Version：1.0
 * time：2016/2/15 22:32
 * des ：手机卫士
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class CacheInfo implements Comparable<CacheInfo>{
	public Drawable icon;
	public long cacheSize;
	public String appName;
	public String appPackageName;

	@Override
	public int compareTo(CacheInfo another) {
		return (int) (another.cacheSize - this.cacheSize);
	}
	
	
}
