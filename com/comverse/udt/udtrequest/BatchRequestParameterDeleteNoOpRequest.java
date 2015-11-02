/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestParameterDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestParameterDeleteNoOpRequest extends BatchRequestParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchRequestParameterDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestParameterDeleteNoOpRequest(String id, BatchRequestParameterObjectBaseData noOpIn) {
    super(id, "BatchRequestParameterDeleteNoOpRequest");
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
