package com.pjmike.lundao.util;

/**通过redis存储和验证Token
 * @author pjmike
 *
 */
public class RedisTokenManager implements TokenManager {
	

	@Override
	public TokenModel createToken(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkToken(TokenModel model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TokenModel getToken(String authentication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteToken(int userid) {
		// TODO Auto-generated method stub

	}

}
