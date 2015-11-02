/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestDeleteRequest.java
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
 * Class used to create a BatchRequestDeleteRequest Udt Request
 *
 */

public class BatchRequestDeleteRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestDeleteRequest
 * @param id Unique request name
 * @param batchRequestDeleteIn BatchRequestObjectKeyData for BatchRequestDeleteRequest
 *
 */
@JsonCreator
  public BatchRequestDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestDeleteIn) {
    super(id, "BatchRequestDelete");
    if (batchRequestDeleteIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestDeleteIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestDeleteRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
