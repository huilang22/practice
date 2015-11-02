/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableFindRequest.java
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
 * Class used to create a BatchExecutableEnvironmentalVariableFindRequest Udt Request
 *
 */

public class BatchExecutableEnvironmentalVariableFindRequest extends BatchExecutableEnvironmentalVariableRequest {
/**
 *
 * Constructor to create a  BatchExecutableEnvironmentalVariableFindRequest
 * @param id Unique request name
 * @param batchExecutableEnvVarFindIn BatchExecutableEnvironmentalVariableObjectFilter for BatchExecutableEnvironmentalVariableFindRequest
 *
 */
@JsonCreator
  public BatchExecutableEnvironmentalVariableFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutableEnvironmentalVariable")BatchExecutableEnvironmentalVariableObjectFilter batchExecutableEnvVarFindIn) {
    super(id, "BatchExecutableEnvironmentalVariableFind");
    if (batchExecutableEnvVarFindIn != null) {
      Integer index =  batchExecutableEnvVarFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(batchExecutableEnvVarFindIn, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableEnvironmentalVariableObjectDataList that results from the BatchExecutableEnvironmentalVariableFindRequest call
 * @return BatchExecutableEnvironmentalVariableObjectDataList resulting from udt call
 *
 */

  public BatchExecutableEnvironmentalVariableObjectDataList getOutput() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMapList(outputMap, "BatchExecutableEnvironmentalVariableList");
  }
}
