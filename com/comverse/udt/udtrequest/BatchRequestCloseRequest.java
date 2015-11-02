/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestCloseRequest.java
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
 * Class used to create a BatchRequestCloseRequest Udt Request
 *
 */

public class BatchRequestCloseRequest extends BatchRequestSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestCloseRequest
 * @param id Unique request name
 * @param batchRequestCloseIn BatchRequestObjectKeyData for BatchRequestCloseRequest
 * @param batchRequestCloseActivityDescriptionIn String for BatchRequestCloseRequest
 *
 */
@JsonCreator
  public BatchRequestCloseRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequest")BatchRequestObjectKeyData batchRequestCloseIn, @JsonProperty("ActivityDescription")String batchRequestCloseActivityDescriptionIn) {
    super(id, "BatchRequestClose");
    if (batchRequestCloseIn != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(batchRequestCloseIn, new HashMap(), "BatchRequestObjectKeyData").get("BatchRequestObjectKeyData"));
    }
    if (batchRequestCloseActivityDescriptionIn != null) {
      addInput("ActivityDescription", batchRequestCloseActivityDescriptionIn);
    }
  }

/**
 *
 * Retrieves the BatchRequestObjectData that results from the BatchRequestCloseRequest call
 * @return BatchRequestObjectData resulting from udt call
 *
 */

  public BatchRequestObjectData getOutput() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
}
