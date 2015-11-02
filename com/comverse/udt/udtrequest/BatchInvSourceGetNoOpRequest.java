/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchInvSourceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchInvSourceGetNoOpRequest extends BatchInvSourceSubRequestParent {
/**
 *
 * Constructor to create a   BatchInvSourceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchInvSourceGetNoOpRequest(String id, BISObjectData noOpIn) {
    super(id, "BatchInvSourceGetNoOpRequest");
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
