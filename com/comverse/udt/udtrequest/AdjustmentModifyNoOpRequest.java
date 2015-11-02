/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentModifyNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentModifyNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentModifyNoOpRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a   AdjustmentModifyNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentModifyNoOpRequest(String id, AdjustmentObjectData noOpIn) {
    super(id, "AdjustmentModifyNoOpRequest");
    if (noOpIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(noOpIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
/**
 *
 * Retrieves the AdjustmentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
