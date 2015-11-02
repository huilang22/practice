/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChangePasswordRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.sec.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ChangePasswordRequest Udt Request
 *
 */

public class ChangePasswordRequest extends SecurityRequest {
/**
 *
 * Constructor to create a  ChangePasswordRequest
 * @param id Unique request name
 * @param ChangeUser UserObjData for ChangePasswordRequest
 * @param OldPassword PasswordObjData for ChangePasswordRequest
 * @param NewPassword PasswordObjData for ChangePasswordRequest
 *
 */
@JsonCreator
  public ChangePasswordRequest(@JsonProperty("RequestId") String id, @JsonProperty("ChangeUser")UserObjData ChangeUser, @JsonProperty("OldPassword")PasswordObjData OldPassword, @JsonProperty("NewPassword")PasswordObjData NewPassword) {
    super(id, "ChangePassword");
    if (ChangeUser != null) {
      addInput("ChangeUser", UserObjHelper.toMap(ChangeUser, new HashMap(), "PasswordChanged").get("PasswordChanged"));
    }
    if (OldPassword != null) {
      addInput("OldPassword", PasswordObjHelper.toMap(OldPassword, new HashMap(), "PasswordChanged").get("PasswordChanged"));
    }
    if (NewPassword != null) {
      addInput("NewPassword", PasswordObjHelper.toMap(NewPassword, new HashMap(), "PasswordChanged").get("PasswordChanged"));
    }
  }

/**
 *
 * Retrieves the Boolean that results from the ChangePasswordRequest call
 * @return Boolean resulting from udt call
 *
 */

  public Boolean getOutput() {
    return  (Boolean)outputMap.get("PasswordChanged");
  }
}
