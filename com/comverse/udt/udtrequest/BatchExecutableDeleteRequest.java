/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableDeleteRequest.java
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
 * Class used to create a BatchExecutableDeleteRequest Udt Request
 *
 */

public class BatchExecutableDeleteRequest extends BatchExecutableSubRequestParent {
/**
 *
 * Constructor to create a  BatchExecutableDeleteRequest
 * @param id Unique request name
 * @param batchExecutableDeleteIn BatchExecutableObjectKeyData for BatchExecutableDeleteRequest
 *
 */
@JsonCreator
  public BatchExecutableDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchExecutable")BatchExecutableObjectKeyData batchExecutableDeleteIn) {
    super(id, "BatchExecutableDelete");
    if (batchExecutableDeleteIn != null) {
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(batchExecutableDeleteIn, new HashMap(), "BatchExecutableObjectKeyData").get("BatchExecutableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchExecutableObjectData that results from the BatchExecutableDeleteRequest call
 * @return BatchExecutableObjectData resulting from udt call
 *
 */

  public BatchExecutableObjectData getOutput() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
}
