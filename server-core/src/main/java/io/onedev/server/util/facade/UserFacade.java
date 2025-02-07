package io.onedev.server.util.facade;

import io.onedev.server.model.support.AccessToken;

import javax.annotation.Nullable;
import java.util.List;

public class UserFacade extends EntityFacade {
	
	private static final long serialVersionUID = 1L;

	private final String name;
	
	private final String fullName;
	
	private final List<AccessToken> accessTokens;
	
	public UserFacade(Long id, String name, @Nullable String fullName, List<AccessToken> accessTokens) {
		super(id);
		this.name = name;
		this.fullName = fullName;
		this.accessTokens = accessTokens;
	}

	public String getName() {
		return name;
	}

	public String getFullName() {
		return fullName;
	}

	public List<AccessToken> getAccessTokens() {
		return accessTokens;
	}

	public String getDisplayName() {
		if (getFullName() != null)
			return getFullName();
		else
			return getName();
	}
	
}
