/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableCreateRequest.java
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
 * Class used to create a BatchExecutableCreateRequest Udt Request
 *
 */

public class BatchExecutableCreateRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableCreateRequest
 * @param id Unique request name
 * @param batchExecutableCreateIn BatchExecutableObjectData for BatchExecutableCreateRequest
 *
 */
@JsonCreator
  public BatchExecutableCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutable")BatchExecutableObjectData batchExecutableCreateIn) {
    super(id, "BatchExecutableCreate");
    if (batchExecutableCreateIn != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableCreateIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableObjectData that results from the BatchExecutableCreateRequest call
 * @return BatchExecutableObjectData resulting from udt call
 *
 */

  public BatchExecutableObjectData getOutput() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
}
