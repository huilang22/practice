/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByServiceUpdateNoOpRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a BulkOrderRequestByServiceUpdateNoOpRequest Udt Request/Response
 *
 */
public class BulkOrderRequestByServiceUpdateNoOpRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a   BulkOrderRequestByServiceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BulkOrderRequestByServiceUpdateNoOpRequest(String id, BatchRequestObjectData noOpIn) {
    super(id, "BulkOrderRequestByServiceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BulkOrderRequest", BatchRequestObjectHelper.toMap(noOpIn, new HashMap(), "BulkOrderRequest").get("BulkOrderRequest"));
    }
  }
/**
 *
 * Retrieves the BatchRequestObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BulkOrderRequest");
  }
}
