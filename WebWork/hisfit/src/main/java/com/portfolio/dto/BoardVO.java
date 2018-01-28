package com.portfolio.dto;

/**
 * <pre> 
 * com.portfolio.dto
 * BoardVO.java
 * [ Description ]
 * 
 * </pre>
 * [ History ]
 * @author	 박우영
 * @Date		 2018. 1. 27. 오후 4:24:09
 * <pre>
 * ---- 수정이력[Name - Date - Description] ----
 * 박우영 - 2018. 1. 27. - 최초생성
 * </pre>
 */
public class BoardVO {
	private int nIndex;
	private String strTitle;
	private String strContents;
	private String strDate;
	private boolean bHeadline;

	public int getnIndex() {
		return nIndex;
	}

	public void setnIndex(int nIndex) {
		this.nIndex = nIndex;
	}

	public String getStrTitle() {
		return strTitle;
	}

	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getStrContents() {
		return strContents;
	}

	public void setStrContents(String strContents) {
		this.strContents = strContents;
	}

	public String getStrDate() {
		strDate = strDate.substring(0, strDate.length()-2);
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	public boolean isbHeadline() {
		return bHeadline;
	}

	public void setbHeadline(boolean bHeadline) {
		this.bHeadline = bHeadline;
	}
}
