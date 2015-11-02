/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeCreateNoOpRequest extends UsageTypeSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeCreateNoOpRequest(String id, UsageTypeObjectData noOpIn) {
    super(id, "UsageTypeCreateNoOpRequest");
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
