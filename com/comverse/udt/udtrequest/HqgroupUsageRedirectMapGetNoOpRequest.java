/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapGetNoOpRequest.java
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
 * NoOp class used to simulate a HqgroupUsageRedirectMapGetNoOpRequest Udt Request/Response
 *
 */
public class HqgroupUsageRedirectMapGetNoOpRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a   HqgroupUsageRedirectMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqgroupUsageRedirectMapGetNoOpRequest(String id, HqGroupUsageRedirectMapObjectData noOpIn) {
    super(id, "HqgroupUsageRedirectMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(noOpIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }
/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupUsageRedirectMapObjectData getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
