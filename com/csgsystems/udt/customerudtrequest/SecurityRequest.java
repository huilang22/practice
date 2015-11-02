/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.sec.data.*;
public final class SecurityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SecurityRequest (String request, SecurityRequestMethod method) {
    initialize(request, "Security", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SecurityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setChangeUserForChangePassword(UserObjData data) {
    if (data != null) {
      addInput("ChangeUser", UserObjHelper.toMap(data, new HashMap(), "ChangeUser").get("ChangeUser"));
    }
  }
  public void setNewPasswordForChangePassword(PasswordObjData data) {
    if (data != null) {
      addInput("NewPassword", PasswordObjHelper.toMap(data, new HashMap(), "NewPassword").get("NewPassword"));
    }
  }
  public void setOldPasswordForChangePassword(PasswordObjData data) {
    if (data != null) {
      addInput("OldPassword", PasswordObjHelper.toMap(data, new HashMap(), "OldPassword").get("OldPassword"));
    }
  }
  public void setPasswordForUserAuthenticate(PasswordObjData data) {
    if (data != null) {
      addInput("Password", PasswordObjHelper.toMap(data, new HashMap(), "Password").get("Password"));
    }
  }
  public void setUserForUserAuthenticate(UserObjData data) {
    if (data != null) {
      addInput("User", UserObjHelper.toMap(data, new HashMap(), "User").get("User"));
    }
  }
  public Boolean getBooleanPasswordChangedFromChangePassword() {
    return (Boolean)outputMap.get("PasswordChanged");
  }
  public UserAuthenticateOutputData getUserAuthenticateOutputDataUserAuthenticateOutputDataFromUserAuthenticate() {
    return UserAuthenticateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public Boolean getPasswordChanged() {
    return (Boolean)outputMap.get("PasswordChanged");
  }
  /**
   @deprecated
   */
  public void setPasswordObjData(PasswordObjData data) {
    if (data != null) {
      addInput("PasswordObj", PasswordObjHelper.toMap(data, new HashMap()).get("PasswordObj"));
    }
  }
  /**
   @deprecated
   */
  public UserAuthenticateOutputData getUserAuthenticateOutputData() {
    return UserAuthenticateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setUserObjData(UserObjData data) {
    if (data != null) {
      addInput("UserObj", UserObjHelper.toMap(data, new HashMap()).get("UserObj"));
    }
  }
}
