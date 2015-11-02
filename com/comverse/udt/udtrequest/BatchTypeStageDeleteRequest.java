/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageDeleteRequest.java
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
 * Class used to create a BatchTypeStageDeleteRequest Udt Request
 *
 */

public class BatchTypeStageDeleteRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeStageDeleteRequest
 * @param id Unique request name
 * @param batchTypeStageDeleteIn BatchTypeStageObjectKeyData for BatchTypeStageDeleteRequest
 *
 */
@JsonCreator
  public BatchTypeStageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeStage")BatchTypeStageObjectKeyData batchTypeStageDeleteIn) {
    super(id, "BatchTypeStageDelete");
    if (batchTypeStageDeleteIn != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(batchTypeStageDeleteIn, new HashMap(), "BatchTypeStageObjectKeyData").get("BatchTypeStageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTypeStageObjectData that results from the BatchTypeStageDeleteRequest call
 * @return BatchTypeStageObjectData resulting from udt call
 *
 */

  public BatchTypeStageObjectData getOutput() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
