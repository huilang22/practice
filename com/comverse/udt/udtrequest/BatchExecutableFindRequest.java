/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableFindRequest.java
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
 * Class used to create a BatchExecutableFindRequest Udt Request
 *
 */

public class BatchExecutableFindRequest extends BatchExecutableRequest {
/**
 *
 * Constructor to create a  BatchExecutableFindRequest
 * @param id Unique request name
 * @param batchExecutableFindIn BatchExecutableObjectFilter for BatchExecutableFindRequest
 *
 */
@JsonCreator
  public BatchExecutableFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutable")BatchExecutableObjectFilter batchExecutableFindIn) {
    super(id, "BatchExecutableFind");
    if (batchExecutableFindIn != null) {
      Integer index =  batchExecutableFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableFindIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableObjectDataList that results from the BatchExecutableFindRequest call
 * @return BatchExecutableObjectDataList resulting from udt call
 *
 */

  public BatchExecutableObjectDataList getOutput() {
    return BatchExecutableObjectHelper.fromMapList(outputMap, "BatchExecutableList");
  }
}
