/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeStageFindRequest.java
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
 * Class used to create a BatchTypeStageFindRequest Udt Request
 *
 */

public class BatchTypeStageFindRequest extends BatchTypeStageRequest {
/**
 *
 * Constructor to create a  BatchTypeStageFindRequest
 * @param id Unique request name
 * @param batchTypeStageFindIn BatchTypeStageObjectFilter for BatchTypeStageFindRequest
 *
 */
@JsonCreator
  public BatchTypeStageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTypeStage")BatchTypeStageObjectFilter batchTypeStageFindIn) {
    super(id, "BatchTypeStageFind");
    if (batchTypeStageFindIn != null) {
      Integer index =  batchTypeStageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(batchTypeStageFindIn, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }

/**
 *
 * Retrieves the BatchTypeStageObjectDataList that results from the BatchTypeStageFindRequest call
 * @return BatchTypeStageObjectDataList resulting from udt call
 *
 */

  public BatchTypeStageObjectDataList getOutput() {
    return BatchTypeStageObjectHelper.fromMapList(outputMap, "BatchTypeStageList");
  }
}
