/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BulkOrderRequestByServiceGetNoOpRequest.java
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
 * NoOp class used to simulate a BulkOrderRequestByServiceGetNoOpRequest Udt Request/Response
 *
 */
public class BulkOrderRequestByServiceGetNoOpRequest extends BulkOrderRequestSubRequestParent {
/**
 *
 * Constructor to create a   BulkOrderRequestByServiceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BulkOrderRequestByServiceGetNoOpRequest(String id, BulkOrderRequestByServiceGetOutputData noOpIn) {
    super(id, "BulkOrderRequestByServiceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BulkOrderRequestByServiceGetOutputData", BulkOrderRequestByServiceGetOutputHelper.toMap(noOpIn).get("BulkOrderRequestByServiceGetOutputData"));
    }
  }
/**
 *
 * Retrieves the BulkOrderRequestByServiceGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public BulkOrderRequestByServiceGetOutputData getOutput() {
    return BulkOrderRequestByServiceGetOutputHelper.fromMap(outputMap);
  }
}
