/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageGetRequest.java
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
 * Class used to create a BatchTypeStageGetRequest Udt Request
 *
 */

public class BatchTypeStageGetRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeStageGetRequest
 * @param id Unique request name
 * @param batchTypeStageGetIn BatchTypeStageObjectKeyData for BatchTypeStageGetRequest
 *
 */
@JsonCreator
  public BatchTypeStageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeStage")BatchTypeStageObjectKeyData batchTypeStageGetIn) {
    super(id, "BatchTypeStageGet");
    if (batchTypeStageGetIn != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(batchTypeStageGetIn, new HashMap(), "BatchTypeStageObjectKeyData").get("BatchTypeStageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTypeStageObjectData that results from the BatchTypeStageGetRequest call
 * @return BatchTypeStageObjectData resulting from udt call
 *
 */

  public BatchTypeStageObjectData getOutput() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
