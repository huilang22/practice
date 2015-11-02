/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceUpdateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a BatchInvSourceUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchInvSourceUpdateNoOpRequest extends BatchInvSourceSubRequestParent {
/**
 *
 * Constructor to create a   BatchInvSourceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchInvSourceUpdateNoOpRequest(String id, BISObjectData noOpIn) {
    super(id, "BatchInvSourceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(noOpIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
/**
 *
 * Retrieves the BISObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BISObjectData getOutput() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
}
