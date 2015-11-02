/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchTypeParameterSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchTypeParameterSequenceGetNoOpRequest extends BatchTypeParameterSubRequestParent {
/**
 *
 * Constructor to create a   BatchTypeParameterSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTypeParameterSequenceGetNoOpRequest(String id, BatchTypeParameterObjectKeyData noOpIn) {
    super(id, "BatchTypeParameterSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
/**
 *
 * Retrieves the BatchTypeParameterObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectKeyData getOutput() {
    return BatchTypeParameterObjectKeyHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
