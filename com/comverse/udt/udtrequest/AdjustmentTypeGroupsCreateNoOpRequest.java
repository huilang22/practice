/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsCreateNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTypeGroupsCreateNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTypeGroupsCreateNoOpRequest extends AdjustmentTypeGroupsSubRequestParent {
/**
 *
 * Constructor to create a   AdjustmentTypeGroupsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTypeGroupsCreateNoOpRequest(String id, AdjustmentTypeGroupsObjectData noOpIn) {
    super(id, "AdjustmentTypeGroupsCreateNoOpRequest");
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
