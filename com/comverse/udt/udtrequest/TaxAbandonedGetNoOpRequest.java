/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedGetNoOpRequest.java
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
 * NoOp class used to simulate a TaxAbandonedGetNoOpRequest Udt Request/Response
 *
 */
public class TaxAbandonedGetNoOpRequest extends TaxAbandonedSubRequestParent {
/**
 *
 * Constructor to create a   TaxAbandonedGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxAbandonedGetNoOpRequest(String id, TaxAbandonedObjectData noOpIn) {
    super(id, "TaxAbandonedGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxAbandoned", TaxAbandonedObjectHelper.toMap(noOpIn, new HashMap(), "TaxAbandoned").get("TaxAbandoned"));
    }
  }
/**
 *
 * Retrieves the TaxAbandonedObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAbandonedObjectData getOutput() {
    return TaxAbandonedObjectHelper.fromMap(outputMap, "TaxAbandoned");
  }
}
