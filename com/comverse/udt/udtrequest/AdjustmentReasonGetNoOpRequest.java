/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonGetNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentReasonGetNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentReasonGetNoOpRequest extends AdjustmentReasonSubRequestParent {
/**
 *
 * Constructor to create a   AdjustmentReasonGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentReasonGetNoOpRequest(String id, AdjustmentReasonObjectData noOpIn) {
    super(id, "AdjustmentReasonGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
/**
 *
 * Retrieves the AdjustmentReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentReasonObjectData getOutput() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
}
