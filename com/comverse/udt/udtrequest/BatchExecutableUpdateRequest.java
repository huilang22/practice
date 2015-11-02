/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableUpdateRequest.java
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
 * Class used to create a BatchExecutableUpdateRequest Udt Request
 *
 */

public class BatchExecutableUpdateRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableUpdateRequest
 * @param id Unique request name
 * @param batchExecutableUpdateIn BatchExecutableObjectData for BatchExecutableUpdateRequest
 *
 */
@JsonCreator
  public BatchExecutableUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutable")BatchExecutableObjectData batchExecutableUpdateIn) {
    super(id, "BatchExecutableUpdate");
    if (batchExecutableUpdateIn != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableUpdateIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableObjectData that results from the BatchExecutableUpdateRequest call
 * @return BatchExecutableObjectData resulting from udt call
 *
 */

  public BatchExecutableObjectData getOutput() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
}
