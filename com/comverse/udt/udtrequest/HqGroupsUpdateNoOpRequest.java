/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsUpdateNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupsUpdateNoOpRequest Udt Request/Response
 *
 */
public class HqGroupsUpdateNoOpRequest extends HqGroupsSubRequestParent {
/**
 *
 * Constructor to create a   HqGroupsUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupsUpdateNoOpRequest(String id, HqGroupsObjectData noOpIn) {
    super(id, "HqGroupsUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
/**
 *
 * Retrieves the HqGroupsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupsObjectData getOutput() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
