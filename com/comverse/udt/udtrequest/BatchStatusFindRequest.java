/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusFindRequest.java
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
 * Class used to create a BatchStatusFindRequest Udt Request
 *
 */

public class BatchStatusFindRequest extends BatchStatusRequest {
/**
 *
 * Constructor to create a  BatchStatusFindRequest
 * @param id Unique request name
 * @param batchStatusFindIn BatchStatusObjectFilter for BatchStatusFindRequest
 *
 */
@JsonCreator
  public BatchStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchStatus")BatchStatusObjectFilter batchStatusFindIn) {
    super(id, "BatchStatusFind");
    if (batchStatusFindIn != null) {
      Integer index =  batchStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchStatus", BatchStatusObjectHelper.toMap(batchStatusFindIn, new HashMap(), "BatchStatus").get("BatchStatus"));
    }
  }

/**
 *
 * Retrieves the BatchStatusObjectDataList that results from the BatchStatusFindRequest call
 * @return BatchStatusObjectDataList resulting from udt call
 *
 */

  public BatchStatusObjectDataList getOutput() {
    return BatchStatusObjectHelper.fromMapList(outputMap, "BatchStatusList");
  }
}
