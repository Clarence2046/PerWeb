package com.galaxy.taylor.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUsertype<M extends BaseUsertype<M>> extends Model<M> implements IBean {

	public void setUserType(java.lang.Integer userType) {
		set("userType", userType);
	}

	public java.lang.Integer getUserType() {
		return get("userType");
	}

	public void setTypeName(java.lang.String typeName) {
		set("typeName", typeName);
	}

	public java.lang.String getTypeName() {
		return get("typeName");
	}

}
