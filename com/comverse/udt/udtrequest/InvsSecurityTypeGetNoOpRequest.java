/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeGetNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsSecurityTypeGetNoOpRequest Udt Request/Response
 *
 */
public class InvsSecurityTypeGetNoOpRequest extends InvsSecurityTypeSubRequestParent {
/**
 *
 * Constructor to create a   InvsSecurityTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSecurityTypeGetNoOpRequest(String id, InvsSecurityTypeObjectData noOpIn) {
    super(id, "InvsSecurityTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
/**
 *
 * Retrieves the InvsSecurityTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSecurityTypeObjectData getOutput() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
}
