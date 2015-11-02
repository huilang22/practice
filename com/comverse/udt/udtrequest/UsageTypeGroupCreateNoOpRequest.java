/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a UsageTypeGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class UsageTypeGroupCreateNoOpRequest extends UsageTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a   UsageTypeGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageTypeGroupCreateNoOpRequest(String id, UsageTypeGroupObjectData noOpIn) {
    super(id, "UsageTypeGroupCreateNoOpRequest");
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
