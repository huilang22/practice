/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsGetNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTypeGroupsGetNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTypeGroupsGetNoOpRequest extends AdjustmentTypeGroupsSubRequestParent {
/**
 *
 * Constructor to create a   AdjustmentTypeGroupsGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTypeGroupsGetNoOpRequest(String id, AdjustmentTypeGroupsObjectData noOpIn) {
    super(id, "AdjustmentTypeGroupsGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }
/**
 *
 * Retrieves the AdjustmentTypeGroupsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeGroupsObjectData getOutput() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
}
