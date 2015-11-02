/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionGetNoOpRequest.java
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
 * NoOp class used to simulate a TaxExemptionGetNoOpRequest Udt Request/Response
 *
 */
public class TaxExemptionGetNoOpRequest extends TaxExemptionSubRequestParent {
/**
 *
 * Constructor to create a   TaxExemptionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxExemptionGetNoOpRequest(String id, TaxExemptionObjectData noOpIn) {
    super(id, "TaxExemptionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(noOpIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
/**
 *
 * Retrieves the TaxExemptionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TaxExemptionObjectData getOutput() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
}
