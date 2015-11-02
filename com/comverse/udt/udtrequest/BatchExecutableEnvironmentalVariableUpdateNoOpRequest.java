/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableEnvironmentalVariableUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableEnvironmentalVariableUpdateNoOpRequest extends BatchExecutableEnvironmentalVariableSubRequestParent {
/**
 *
 * Constructor to create a   BatchExecutableEnvironmentalVariableUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableEnvironmentalVariableUpdateNoOpRequest(String id, BatchExecutableEnvironmentalVariableObjectData noOpIn) {
    super(id, "BatchExecutableEnvironmentalVariableUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(noOpIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableEnvironmentalVariableObjectData getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
}
