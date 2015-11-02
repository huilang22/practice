/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableDeleteRequest.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableDeleteRequest Udt Request
 *
 */

public class BatchExecutableEnvironmentalVariableDeleteRequest extends BatchExecutableEnvironmentalVariableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableDeleteRequest
 * @param id Unique request name
 * @param batchExecutableEnvVarDeleteIn BatchExecutableEnvironmentalVariableObjectKeyData for BatchExecutableEnvironmentalVariableDeleteRequest
 *
 */
@JsonCreator
  public BatchExecutableEnvironmentalVariableDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutableEnvironmentalVariable")BatchExecutableEnvironmentalVariableObjectKeyData batchExecutableEnvVarDeleteIn) {
    super(id, "BatchExecutableEnvironmentalVariableDelete");
    if (batchExecutableEnvVarDeleteIn != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(batchExecutableEnvVarDeleteIn, new HashMap(), "BatchExecutableEnvironmentalVariableObjectKeyData").get("BatchExecutableEnvironmentalVariableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectData that results from the BatchExecutableEnvironmentalVariableDeleteRequest call
 * @return BatchExecutableEnvironmentalVariableObjectData resulting from udt call
 *
 */

  public BatchExecutableEnvironmentalVariableObjectData getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
}
