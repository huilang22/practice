/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByAccountGetNoOpRequest.java
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
 * NoOp class used to simulate a BulkOrderRequestByAccountGetNoOpRequest Udt Request/Response
 *
 */
public class BulkOrderRequestByAccountGetNoOpRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a   BulkOrderRequestByAccountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BulkOrderRequestByAccountGetNoOpRequest(String id, BulkOrderRequestByAccountGetOutputData noOpIn) {
    super(id, "BulkOrderRequestByAccountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BulkOrderRequestByAccountGetOutputData", BulkOrderRequestByAccountGetOutputHelper.toMap(noOpIn).get("BulkOrderRequestByAccountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the BulkOrderRequestByAccountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BulkOrderRequestByAccountGetOutputData getOutput() {
    return BulkOrderRequestByAccountGetOutputHelper.fromMap(outputMap);
  }
}
