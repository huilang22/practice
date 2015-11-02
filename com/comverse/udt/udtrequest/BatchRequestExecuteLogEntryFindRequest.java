/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestExecuteLogEntryFindRequest.java
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
 * Class used to create a BatchRequestExecuteLogEntryFindRequest Udt Request
 *
 */

public class BatchRequestExecuteLogEntryFindRequest extends BatchRequestExecuteLogEntryRequest {
/**
 *
 * Constructor to create a  BatchRequestExecuteLogEntryFindRequest
 * @param id Unique request name
 * @param batchRequestExecuteLogEntryFindIn BatchRequestExecuteLogEntryObjectFilter for BatchRequestExecuteLogEntryFindRequest
 *
 */
@JsonCreator
  public BatchRequestExecuteLogEntryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestExecuteLogEntry")BatchRequestExecuteLogEntryObjectFilter batchRequestExecuteLogEntryFindIn) {
    super(id, "BatchRequestExecuteLogEntryFind");
    if (batchRequestExecuteLogEntryFindIn != null) {
      Integer index =  batchRequestExecuteLogEntryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(batchRequestExecuteLogEntryFindIn, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestExecuteLogEntryObjectDataList that results from the BatchRequestExecuteLogEntryFindRequest call
 * @return BatchRequestExecuteLogEntryObjectDataList resulting from udt call
 *
 */

  public BatchRequestExecuteLogEntryObjectDataList getOutput() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestExecuteLogEntryList");
  }
}
