/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapCreateNoOpRequest.java
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
 * NoOp class used to simulate a HqgroupUsageRedirectMapCreateNoOpRequest Udt Request/Response
 *
 */
public class HqgroupUsageRedirectMapCreateNoOpRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a   HqgroupUsageRedirectMapCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqgroupUsageRedirectMapCreateNoOpRequest(String id, HqGroupUsageRedirectMapObjectData noOpIn) {
    super(id, "HqgroupUsageRedirectMapCreateNoOpRequest");
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
