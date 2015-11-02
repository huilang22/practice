/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntryFindRequest.java
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
 * Class used to create a BatchRequestErrorLogEntryFindRequest Udt Request
 *
 */

public class BatchRequestErrorLogEntryFindRequest extends BatchRequestErrorLogEntryRequest {
/**
 *
 * Constructor to create a  BatchRequestErrorLogEntryFindRequest
 * @param id Unique request name
 * @param batchRequestErrorLogEntryFindIn BatchRequestErrorLogEntryObjectFilter for BatchRequestErrorLogEntryFindRequest
 *
 */
@JsonCreator
  public BatchRequestErrorLogEntryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestErrorLogEntry")BatchRequestErrorLogEntryObjectFilter batchRequestErrorLogEntryFindIn) {
    super(id, "BatchRequestErrorLogEntryFind");
    if (batchRequestErrorLogEntryFindIn != null) {
      Integer index =  batchRequestErrorLogEntryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectHelper.toMap(batchRequestErrorLogEntryFindIn, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestErrorLogEntryObjectDataList that results from the BatchRequestErrorLogEntryFindRequest call
 * @return BatchRequestErrorLogEntryObjectDataList resulting from udt call
 *
 */

  public BatchRequestErrorLogEntryObjectDataList getOutput() {
    return BatchRequestErrorLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestErrorLogEntryList");
  }
}
