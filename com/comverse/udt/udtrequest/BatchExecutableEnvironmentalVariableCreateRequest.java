/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableCreateRequest.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableCreateRequest Udt Request
 *
 */

public class BatchExecutableEnvironmentalVariableCreateRequest extends BatchExecutableEnvironmentalVariableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableCreateRequest
 * @param id Unique request name
 * @param batchExecutableEnvVarCreateIn BatchExecutableEnvironmentalVariableObjectData for BatchExecutableEnvironmentalVariableCreateRequest
 *
 */
@JsonCreator
  public BatchExecutableEnvironmentalVariableCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutableEnvironmentalVariable")BatchExecutableEnvironmentalVariableObjectData batchExecutableEnvVarCreateIn) {
    super(id, "BatchExecutableEnvironmentalVariableCreate");
    if (batchExecutableEnvVarCreateIn != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(batchExecutableEnvVarCreateIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectData that results from the BatchExecutableEnvironmentalVariableCreateRequest call
 * @return BatchExecutableEnvironmentalVariableObjectData resulting from udt call
 *
 */

  public BatchExecutableEnvironmentalVariableObjectData getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
}
