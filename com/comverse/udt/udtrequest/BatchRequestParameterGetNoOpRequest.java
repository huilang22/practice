/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParameterGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParameterGetNoOpRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParameterGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParameterGetNoOpRequest(String id, BatchRequestParameterObjectData noOpIn) {
    super(id, "BatchRequestParameterGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParameterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParameterObjectData getOutput() {
    return BatchRequestParameterObjectHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
