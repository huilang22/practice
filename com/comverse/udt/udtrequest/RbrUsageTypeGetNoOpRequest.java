/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a RbrUsageTypeGetNoOpRequest Udt Request/Response
 *
 */
public class RbrUsageTypeGetNoOpRequest extends RbrUsageTypeSubRequestParent {
/**
 *
 * Constructor to create a   RbrUsageTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrUsageTypeGetNoOpRequest(String id, RbrUsageTypeObjectData noOpIn) {
    super(id, "RbrUsageTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(noOpIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }
/**
 *
 * Retrieves the RbrUsageTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrUsageTypeObjectData getOutput() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
}
