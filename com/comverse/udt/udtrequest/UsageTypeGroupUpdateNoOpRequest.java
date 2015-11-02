/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeGroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeGroupUpdateNoOpRequest extends UsageTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeGroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeGroupUpdateNoOpRequest(String id, UsageTypeGroupObjectData noOpIn) {
    super(id, "UsageTypeGroupUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }
/**
 *
 * Retrieves the UsageTypeGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeGroupObjectData getOutput() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
}
