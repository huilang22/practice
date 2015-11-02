/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a SecurityUserGetNoOpRequest Udt Request/Response
 *
 */
public class SecurityUserGetNoOpRequest extends SecurityUserSubRequestParent {
/**
 *
 * Constructor to create a   SecurityUserGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityUserGetNoOpRequest(String id, SecurityUserObjectData noOpIn) {
    super(id, "SecurityUserGetNoOpRequest");
    if (noOpIn != null) {
      addInput("SecurityUser", SecurityUserObjectHelper.toMap(noOpIn, new HashMap(), "SecurityUser").get("SecurityUser"));
    }
  }
/**
 *
 * Retrieves the SecurityUserObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityUserObjectData getOutput() {
    return SecurityUserObjectHelper.fromMap(outputMap, "SecurityUser");
  }
}
