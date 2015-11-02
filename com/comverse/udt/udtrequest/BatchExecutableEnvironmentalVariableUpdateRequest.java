/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchExecutableEnvironmentalVariableUpdateRequest Udt Request
 *
 */

public class BatchExecutableEnvironmentalVariableUpdateRequest extends BatchExecutableEnvironmentalVariableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableUpdateRequest
 * @param id Unique request name
 * @param batchExecutableEnvVarUpdateIn BatchExecutableEnvironmentalVariableObjectData for BatchExecutableEnvironmentalVariableUpdateRequest
 *
 */
@JsonCreator
  public BatchExecutableEnvironmentalVariableUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutableEnvironmentalVariable")BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarUpdateIn) {
    super(id, "BatchExecutableEnvironmentalVariableUpdate");
    if (batchExecutableEnvVarUpdateIn != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(batchExecutableEnvVarUpdateIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectData that results from the BatchExecutableEnvironmentalVariableUpdateRequest call
 * @return BatchExecutableEnvironmentalVariableObjectData resulting from udt call
 *
 */

  public BatchExecutableEnvironmentalVariableObjectData getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
}
