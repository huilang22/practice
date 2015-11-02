/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeParameterUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeParameterUpdateNoOpRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeParameterUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeParameterUpdateNoOpRequest(String id, BatchTypeParameterObjectData noOpIn) {
    super(id, "BatchTypeParameterUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
/**
 *
 * Retrieves the BatchTypeParameterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectData getOutput() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
