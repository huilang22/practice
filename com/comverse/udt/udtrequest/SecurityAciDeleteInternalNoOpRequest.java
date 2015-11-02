/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciDeleteInternalNoOpRequest.java
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
 * NoOp class used to simulate a SecurityAciDeleteInternalNoOpRequest Udt Request/Response
 *
 */
public class SecurityAciDeleteInternalNoOpRequest extends SecurityAciSubRequestParent {
/**
 *
 * Constructor to create a   SecurityAciDeleteInternalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityAciDeleteInternalNoOpRequest(String id, SecurityAciObjectData noOpIn) {
    super(id, "SecurityAciDeleteInternalNoOpRequest");
    if (noOpIn != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(noOpIn, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }
/**
 *
 * Retrieves the SecurityAciObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityAciObjectData getOutput() {
    return SecurityAciObjectHelper.fromMap(outputMap, "SecurityAci");
  }
}
