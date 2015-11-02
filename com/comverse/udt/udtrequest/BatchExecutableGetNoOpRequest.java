/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableGetNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableGetNoOpRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a   BatchExecutableGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableGetNoOpRequest(String id, BatchExecutableObjectData noOpIn) {
    super(id, "BatchExecutableGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(noOpIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
/**
 *
 * Retrieves the BatchExecutableObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableObjectData getOutput() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
}
