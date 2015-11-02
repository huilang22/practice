/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableDeleteNoOpRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a   BatchExecutableDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableDeleteNoOpRequest(String id, BatchExecutableObjectData noOpIn) {
    super(id, "BatchExecutableDeleteNoOpRequest");
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
