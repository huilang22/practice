/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParameterUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParameterUpdateNoOpRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParameterUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParameterUpdateNoOpRequest(String id, BatchRequestParameterObjectBaseData noOpIn) {
    super(id, "BatchRequestParameterUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(noOpIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
/**
 *
 * Retrieves the BatchRequestParameterObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParameterObjectBaseData getOutput() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
