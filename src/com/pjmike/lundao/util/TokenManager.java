package com.pjmike.lundao.util;


/**
 * @author pjmike
 * token实现的接口
 */
public interface TokenManager {
	/**
	 * 创建token
	 * @param userid
	 * @return
	 */
	public TokenModel createToken(int userid);
	/**检查Token
	 * @param model
	 * @return
	 */
	public boolean checkToken(TokenModel model);
	/**获取Token
	 * @param authentication
	 * @return
	 */
	public TokenModel getToken(String authentication);
	/**删除Token
	 * @param userid
	 */
	public void deleteToken(int userid);
}
