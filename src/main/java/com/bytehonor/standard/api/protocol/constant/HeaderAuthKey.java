package com.bytehonor.standard.api.protocol.constant;

/**
 * http鉴权header key
 * 
 * @author lijianqiang
 *
 */
public class HeaderAuthKey {
	
	/**
	 * 微信用户openid
	 */
	public static final String WECHAT_USER_OPENID = "X-Wechat-User-Openid";
	
	/**
	 * 微信用户unid
	 */
	public static final String WECHAT_USER_UNID = "X-Wechat-User-Unid";
	
	/**
	 * 微信用户token
	 */
	public static final String WECHAT_USER_TOKEN = "X-Wechat-User-Token";

	/**
	 * 商家用户unid
	 */
	public static final String MERCHANT_USER_UNID = "X-Merchant-User-Unid";

	/**
	 * 商家用户token
	 */
	public static final String MERCHANT_USER_TOKEN = "X-Merchant-User-Token";
	
	/**
	 * 平台用户unid
	 */
	public static final String ADMIN_USER_UNID = "X-Admin-User-Unid";

	/**
	 * 平台用户token
	 */
	public static final String ADMIN_USER_TOKEN = "X-Admin-User-Token";
}
