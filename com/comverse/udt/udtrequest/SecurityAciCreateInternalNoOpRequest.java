/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciCreateInternalNoOpRequest.java
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
 * NoOp class used to simulate a SecurityAciCreateInternalNoOpRequest Udt Request/Response
 *
 */
public class SecurityAciCreateInternalNoOpRequest extends SecurityAciSubRequestParent {
/**
 *
 * Constructor to create a   SecurityAciCreateInternalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityAciCreateInternalNoOpRequest(String id, SecurityAciObjectData noOpIn) {
    super(id, "SecurityAciCreateInternalNoOpRequest");
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
