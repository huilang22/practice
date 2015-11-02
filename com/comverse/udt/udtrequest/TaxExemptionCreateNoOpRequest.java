/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionCreateNoOpRequest.java
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
 * NoOp class used to simulate a TaxExemptionCreateNoOpRequest Udt Request/Response
 *
 */
public class TaxExemptionCreateNoOpRequest extends TaxExemptionSubRequestParent {
/**
 *
 * Constructor to create a   TaxExemptionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxExemptionCreateNoOpRequest(String id, TaxExemptionObjectData noOpIn) {
    super(id, "TaxExemptionCreateNoOpRequest");
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
