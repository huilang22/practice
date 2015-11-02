/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupDeleteNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupUsageRedirectGroupDeleteNoOpRequest Udt Request/Response
 *
 */
public class HqGroupUsageRedirectGroupDeleteNoOpRequest extends HqGroupUsageRedirectGroupSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupUsageRedirectGroupDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupUsageRedirectGroupDeleteNoOpRequest(String id, HqGroupUsageRedirectGroupObjectData noOpIn) {
    super(id, "HqGroupUsageRedirectGroupDeleteNoOpRequest");
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
