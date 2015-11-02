/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageCreateRequest.java
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
 * Class used to create a BatchTypeStageCreateRequest Udt Request
 *
 */

public class BatchTypeStageCreateRequest extends BatchTypeStageSubRequestParent {
/**
 *
 * Constructor to create a  BatchTypeStageCreateRequest
 * @param id Unique request name
 * @param batchTypeStageCreateIn BatchTypeStageObjectData for BatchTypeStageCreateRequest
 *
 */
@JsonCreator
  public BatchTypeStageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeStage")BatchTypeStageObjectData batchTypeStageCreateIn) {
    super(id, "BatchTypeStageCreate");
    if (batchTypeStageCreateIn != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(batchTypeStageCreateIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }

/**
 *
 * Retrieves the BatchTypeStageObjectData that results from the BatchTypeStageCreateRequest call
 * @return BatchTypeStageObjectData resulting from udt call
 *
 */

  public BatchTypeStageObjectData getOutput() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
