/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusGetRequest.java
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
 * Class used to create a BatchStatusGetRequest Udt Request
 *
 */

public class BatchStatusGetRequest extends BatchStatusSubRequestParent {
/**
 *
 * Constructor to create a  BatchStatusGetRequest
 * @param id Unique request name
 * @param batchStatusGetIn BatchStatusObjectKeyData for BatchStatusGetRequest
 *
 */
@JsonCreator
  public BatchStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchStatus")BatchStatusObjectKeyData batchStatusGetIn) {
    super(id, "BatchStatusGet");
    if (batchStatusGetIn != null) {
      addInput("BatchStatus", BatchStatusObjectKeyHelper.toMap(batchStatusGetIn, new HashMap(), "BatchStatusObjectKeyData").get("BatchStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchStatusObjectData that results from the BatchStatusGetRequest call
 * @return BatchStatusObjectData resulting from udt call
 *
 */

  public BatchStatusObjectData getOutput() {
    return BatchStatusObjectHelper.fromMap(outputMap, "BatchStatus");
  }
}
