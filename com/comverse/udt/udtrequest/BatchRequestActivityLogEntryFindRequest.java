/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntryFindRequest.java
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
 * Class used to create a BatchRequestActivityLogEntryFindRequest Udt Request
 *
 */

public class BatchRequestActivityLogEntryFindRequest extends BatchRequestActivityLogEntryRequest {
/**
 *
 * Constructor to create a  BatchRequestActivityLogEntryFindRequest
 * @param id Unique request name
 * @param batchRequestActivityLogEntryFindIn BatchRequestActivityLogEntryObjectFilter for BatchRequestActivityLogEntryFindRequest
 *
 */
@JsonCreator
  public BatchRequestActivityLogEntryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestActivityLogEntry")BatchRequestActivityLogEntryObjectFilter batchRequestActivityLogEntryFindIn) {
    super(id, "BatchRequestActivityLogEntryFind");
    if (batchRequestActivityLogEntryFindIn != null) {
      Integer index =  batchRequestActivityLogEntryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectHelper.toMap(batchRequestActivityLogEntryFindIn, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }

/**
 *
 * Retrieves the BatchRequestActivityLogEntryObjectDataList that results from the BatchRequestActivityLogEntryFindRequest call
 * @return BatchRequestActivityLogEntryObjectDataList resulting from udt call
 *
 */

  public BatchRequestActivityLogEntryObjectDataList getOutput() {
    return BatchRequestActivityLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestActivityLogEntryList");
  }
}
