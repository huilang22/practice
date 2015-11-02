/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupUsageRedirectGroupGetNoOpRequest Udt Request/Response
 *
 */
public class HqGroupUsageRedirectGroupGetNoOpRequest extends HqGroupUsageRedirectGroupSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupUsageRedirectGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupUsageRedirectGroupGetNoOpRequest(String id, HqGroupUsageRedirectGroupObjectData noOpIn) {
    super(id, "HqGroupUsageRedirectGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }
/**
 *
 * Retrieves the HqGroupUsageRedirectGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectGroupObjectData getOutput() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
}
