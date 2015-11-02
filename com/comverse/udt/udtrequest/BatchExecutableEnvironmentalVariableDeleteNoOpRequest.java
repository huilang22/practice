/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchExecutableEnvironmentalVariableDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchExecutableEnvironmentalVariableDeleteNoOpRequest extends BatchExecutableEnvironmentalVariableSubRequestParent {
/**
 *
 * Constructor to create a   BatchExecutableEnvironmentalVariableDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchExecutableEnvironmentalVariableDeleteNoOpRequest(String id, BatchExecutableEnvironmentalVariableObjectData noOpIn) {
    super(id, "BatchExecutableEnvironmentalVariableDeleteNoOpRequest");
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
