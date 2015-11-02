/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeDeleteNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UsageTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeDeleteNoOpRequest extends UsageTypeSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeDeleteNoOpRequest(String id, UsageTypeObjectData noOpIn) {
    super(id, "UsageTypeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageType", UsageTypeObjectHelper.toMap(noOpIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }
/**
 *
 * Retrieves the UsageTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeObjectData getOutput() {
    return UsageTypeObjectHelper.fromMap(outputMap, "UsageType");
  }
}
