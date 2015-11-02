/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageUpdateRequest.java
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
 * Class used to create a BatchTypeStageUpdateRequest Udt Request
 *
 */

public class BatchTypeStageUpdateRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeStageUpdateRequest
 * @param id Unique request name
 * @param batchTypeStageUpdateIn BatchTypeStageObjectData for BatchTypeStageUpdateRequest
 *
 */
@JsonCreator
  public BatchTypeStageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeStage")BatchTypeStageObjectData batchTypeStageUpdateIn) {
    super(id, "BatchTypeStageUpdate");
    if (batchTypeStageUpdateIn != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(batchTypeStageUpdateIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }

/**
 *
 * Retrieves the BatchTypeStageObjectData that results from the BatchTypeStageUpdateRequest call
 * @return BatchTypeStageObjectData resulting from udt call
 *
 */

  public BatchTypeStageObjectData getOutput() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
