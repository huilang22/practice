/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityCallNoOpRequest.java
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
 * NoOp class used to simulate a SecurityCallNoOpRequest Udt Request/Response
 *
 */
public class SecurityCallNoOpRequest extends SecurityPortalSubRequestParent {
/**
 *
 * Constructor to create a   SecurityCallNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityCallNoOpRequest(String id, SecurityPortalObjectData noOpIn) {
    super(id, "SecurityCallNoOpRequest");
    if (noOpIn != null) {
      addInput("SecurityPortal", SecurityPortalObjectHelper.toMap(noOpIn, new HashMap(), "SecurityPortal").get("SecurityPortal"));
    }
  }
/**
 *
 * Retrieves the SecurityPortalObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityPortalObjectData getOutput() {
    return SecurityPortalObjectHelper.fromMap(outputMap, "SecurityPortal");
  }
}
