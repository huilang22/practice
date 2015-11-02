/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceCreateNoOpRequest.java
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
 * NoOp class used to simulate a SecurityResourceCreateNoOpRequest Udt Request/Response
 *
 */
public class SecurityResourceCreateNoOpRequest extends SecurityResourceSubRequestParent {
/**
 *
 * Constructor to create a   SecurityResourceCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SecurityResourceCreateNoOpRequest(String id, SecurityResourceObjectData noOpIn) {
    super(id, "SecurityResourceCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(noOpIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
/**
 *
 * Retrieves the SecurityResourceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityResourceObjectData getOutput() {
    return SecurityResourceObjectHelper.fromMap(outputMap, "SecurityResource");
  }
}
