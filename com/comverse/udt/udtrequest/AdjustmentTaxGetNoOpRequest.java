/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxGetNoOpRequest.java
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
 * NoOp class used to simulate a AdjustmentTaxGetNoOpRequest Udt Request/Response
 *
 */
public class AdjustmentTaxGetNoOpRequest extends AdjustmentTaxSubRequestParent {
/**
 *
 * Constructor to create a   AdjustmentTaxGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AdjustmentTaxGetNoOpRequest(String id, AdjustmentTaxObjectData noOpIn) {
    super(id, "AdjustmentTaxGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AdjustmentTax", AdjustmentTaxObjectHelper.toMap(noOpIn, new HashMap(), "AdjustmentTax").get("AdjustmentTax"));
    }
  }
/**
 *
 * Retrieves the AdjustmentTaxObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTaxObjectData getOutput() {
    return AdjustmentTaxObjectHelper.fromMap(outputMap, "AdjustmentTax");
  }
}
