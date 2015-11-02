/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentGetNoOpRequest.java
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
 * NoOp class used to simulate a TaxAssignmentGetNoOpRequest Udt Request/Response
 *
 */
public class TaxAssignmentGetNoOpRequest extends TaxAssignmentSubRequestParent {
/**
 *
 * Constructor to create a   TaxAssignmentGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxAssignmentGetNoOpRequest(String id, TaxAssignmentObjectData noOpIn) {
    super(id, "TaxAssignmentGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxAssignment", TaxAssignmentObjectHelper.toMap(noOpIn, new HashMap(), "TaxAssignment").get("TaxAssignment"));
    }
  }
/**
 *
 * Retrieves the TaxAssignmentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAssignmentObjectData getOutput() {
    return TaxAssignmentObjectHelper.fromMap(outputMap, "TaxAssignment");
  }
}
