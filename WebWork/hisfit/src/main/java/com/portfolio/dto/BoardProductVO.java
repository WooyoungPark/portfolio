package com.portfolio.dto;

/**
 * <pre>
 *  
 * com.portfolio.dto
 * BoardProductVO.java
 * [ Description ]
 * 
 * </pre>
 * 
 * [ History ]
 * 
 * @author 박우영
 * @Date 2018. 1. 27. 오후 6:27:04
 * 
 *       <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 27. - 최초생성
 *       </pre>
 */
public class BoardProductVO {

	private int nIndex;
	private String strPath;
	private String strName;
	private String strTitle;
	private String strAuth;
	private String strDate;
	private boolean bPrivate;
	
	public int getnIndex() {
		return nIndex;
	}

	public void setnIndex(int nIndex) {
		this.nIndex = nIndex;
	}

	public String getStrPath() {
		return strPath;
	}

	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrTitle() {
		return strTitle;
	}

	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getStrAuth() {
		return strAuth;
	}

	public void setStrAuth(String strAuth) {
		this.strAuth = strAuth;
	}

	public String getStrDate() {
		strDate = strDate.substring(0, strDate.length()-2);
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public boolean isbPrivate() {
		return bPrivate;
	}

	public void setbPrivate(boolean bPrivate) {
		this.bPrivate = bPrivate;
	}
	
	
}
