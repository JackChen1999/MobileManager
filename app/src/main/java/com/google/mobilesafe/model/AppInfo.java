package com.google.mobilesafe.model;

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
public class AppInfo {
	private Drawable appIcon;
	private String appName;
	private String packname;
	private String version;
    private long pkgSize;
	private int uid;
	
	
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

    public long getPkgSize() {
        return pkgSize;
    }

    public void setPkgSize(long pkgSize) {
        this.pkgSize = pkgSize;
    }

    /**
	 * 应用程序可以被安装到不同的位置 , 手机内存 外部存储sd卡
	 */


	private boolean inRom;
	
	private boolean userApp;

	public Drawable getAppIcon() {
		return appIcon;
	}

	public void setAppIcon(Drawable appIcon) {
		this.appIcon = appIcon;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getPackname() {
		return packname;
	}

	public void setPackname(String packname) {
		this.packname = packname;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isInRom() {
		return inRom;
	}

	public void setInRom(boolean inRom) {
		this.inRom = inRom;
	}

	public boolean isUserApp() {
		return userApp;
	}

	public void setUserApp(boolean userApp) {
		this.userApp = userApp;
	}
	
	
	
}
