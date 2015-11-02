/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchStatusGetNoOpRequest Udt Request/Response
 *
 */
public class BatchStatusGetNoOpRequest extends BatchStatusSubRequestParent {
/**
 *
 * Constructor to create a   BatchStatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchStatusGetNoOpRequest(String id, BatchStatusObjectData noOpIn) {
    super(id, "BatchStatusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchStatus", BatchStatusObjectHelper.toMap(noOpIn, new HashMap(), "BatchStatus").get("BatchStatus"));
    }
  }
/**
 *
 * Retrieves the BatchStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchStatusObjectData getOutput() {
    return BatchStatusObjectHelper.fromMap(outputMap, "BatchStatus");
  }
}
