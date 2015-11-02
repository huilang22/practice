/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableSequenceGetNoOpRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a   BatchExecutableSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableSequenceGetNoOpRequest(String id, BatchExecutableObjectKeyData noOpIn) {
    super(id, "BatchExecutableSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
/**
 *
 * Retrieves the BatchExecutableObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableObjectKeyData getOutput() {
    return BatchExecutableObjectKeyHelper.fromMap(outputMap, "BatchExecutable");
  }
}
