/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableGetRequest.java
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
 * Class used to create a BatchExecutableGetRequest Udt Request
 *
 */

public class BatchExecutableGetRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableGetRequest
 * @param id Unique request name
 * @param batchExecutableGetIn BatchExecutableObjectKeyData for BatchExecutableGetRequest
 *
 */
@JsonCreator
  public BatchExecutableGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutable")BatchExecutableObjectKeyData batchExecutableGetIn) {
    super(id, "BatchExecutableGet");
    if (batchExecutableGetIn != null) {
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(batchExecutableGetIn, new HashMap(), "BatchExecutableObjectKeyData").get("BatchExecutableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableObjectData that results from the BatchExecutableGetRequest call
 * @return BatchExecutableObjectData resulting from udt call
 *
 */

  public BatchExecutableObjectData getOutput() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
}
