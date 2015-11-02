/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a TaxStatusGetNoOpRequest Udt Request/Response
 *
 */
public class TaxStatusGetNoOpRequest extends TaxStatusSubRequestParent {
/**
 *
 * Constructor to create a   TaxStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxStatusGetNoOpRequest(String id, TSObjectData noOpIn) {
    super(id, "TaxStatusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxStatus", TSObjectHelper.toMap(noOpIn, new HashMap(), "TaxStatus").get("TaxStatus"));
    }
  }
/**
 *
 * Retrieves the TSObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TSObjectData getOutput() {
    return TSObjectHelper.fromMap(outputMap, "TaxStatus");
  }
}
