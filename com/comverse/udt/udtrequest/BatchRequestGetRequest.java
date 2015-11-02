/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestGetRequest.java
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
 * Class used to create a BatchRequestGetRequest Udt Request
 *
 */

public class BatchRequestGetRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestGetRequest
 * @param id Unique request name
 * @param batchRequestGetIn BatchRequestObjectKeyData for BatchRequestGetRequest
 *
 */
@JsonCreator
  public BatchRequestGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestGetIn) {
    super(id, "BatchRequestGet");
    if (batchRequestGetIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestGetIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestGetRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
