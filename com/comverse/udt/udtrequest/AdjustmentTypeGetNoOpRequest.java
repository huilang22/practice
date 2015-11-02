/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTypeGetNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTypeGetNoOpRequest extends AdjustmentTypeSubRequestParent {
/**
 *
 * Constructor to create a   AdjustmentTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTypeGetNoOpRequest(String id, AdjustmentTypeObjectData noOpIn) {
    super(id, "AdjustmentTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AdjustmentType", AdjustmentTypeObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
  }
/**
 *
 * Retrieves the AdjustmentTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeObjectData getOutput() {
    return AdjustmentTypeObjectHelper.fromMap(outputMap, "AdjustmentType");
  }
}
