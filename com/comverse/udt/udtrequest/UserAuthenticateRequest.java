/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UserAuthenticateRequest.java
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
 * Class used to create a UserAuthenticateRequest Udt Request
 *
 */

public class UserAuthenticateRequest extends SecuritySubRequestParent {
/**
 *
 * Constructor to create a  UserAuthenticateRequest
 * @param id Unique request name
 * @param User UserObjData for UserAuthenticateRequest
 * @param Password PasswordObjData for UserAuthenticateRequest
 *
 */
@JsonCreator
  public UserAuthenticateRequest(@JsonProperty("RequestId") String id, @JsonProperty("User")UserObjData User, @JsonProperty("Password")PasswordObjData Password) {
    super(id, "UserAuthenticate");
    if (User != null) {
      addInput("User", UserObjHelper.toMap(User, new HashMap(), "UserAuthenticateOutputData").get("UserAuthenticateOutputData"));
    }
    if (Password != null) {
      addInput("Password", PasswordObjHelper.toMap(Password, new HashMap(), "UserAuthenticateOutputData").get("UserAuthenticateOutputData"));
    }
  }

/**
 *
 * Retrieves the UserAuthenticateOutputData that results from the UserAuthenticateRequest call
 * @return UserAuthenticateOutputData resulting from udt call
 *
 */

  public UserAuthenticateOutputData getOutput() {
    return UserAuthenticateOutputHelper.fromMap(outputMap);
  }
}
