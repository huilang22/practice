/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterCreateNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeParameterCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeParameterCreateNoOpRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeParameterCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeParameterCreateNoOpRequest(String id, BatchTypeParameterObjectData noOpIn) {
    super(id, "BatchTypeParameterCreateNoOpRequest");
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
