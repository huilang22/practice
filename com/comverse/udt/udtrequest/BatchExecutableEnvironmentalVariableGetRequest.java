/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableGetRequest.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableGetRequest Udt Request
 *
 */

public class BatchExecutableEnvironmentalVariableGetRequest extends BatchExecutableEnvironmentalVariableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableGetRequest
 * @param id Unique request name
 * @param batchExecutableEnvVarGetIn BatchExecutableEnvironmentalVariableObjectKeyData for BatchExecutableEnvironmentalVariableGetRequest
 *
 */
@JsonCreator
  public BatchExecutableEnvironmentalVariableGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutableEnvironmentalVariable")BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarGetIn) {
    super(id, "BatchExecutableEnvironmentalVariableGet");
    if (batchExecutableEnvVarGetIn != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(batchExecutableEnvVarGetIn, new HashMap(), "BatchExecutableEnvironmentalVariableObjectKeyData").get("BatchExecutableEnvironmentalVariableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectData that results from the BatchExecutableEnvironmentalVariableGetRequest call
 * @return BatchExecutableEnvironmentalVariableObjectData resulting from udt call
 *
 */

  public BatchExecutableEnvironmentalVariableObjectData getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
}
