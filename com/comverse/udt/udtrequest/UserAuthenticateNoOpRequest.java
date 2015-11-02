/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UserAuthenticateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a UserAuthenticateNoOpRequest Udt Request/Response
 *
 */
public class UserAuthenticateNoOpRequest extends SecuritySubRequestParent {
/**
 *
 * Constructor to create a   UserAuthenticateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UserAuthenticateNoOpRequest(String id, UserAuthenticateOutputData noOpIn) {
    super(id, "UserAuthenticateNoOpRequest");
    if (noOpIn != null) {
      addInput("UserAuthenticateOutputData", UserAuthenticateOutputHelper.toMap(noOpIn).get("UserAuthenticateOutputData"));
    }
  }
/**
 *
 * Retrieves the UserAuthenticateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public UserAuthenticateOutputData getOutput() {
    return UserAuthenticateOutputHelper.fromMap(outputMap);
  }
}
