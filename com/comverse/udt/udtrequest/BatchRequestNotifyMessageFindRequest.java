/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyMessageFindRequest.java
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
 * Class used to create a BatchRequestNotifyMessageFindRequest Udt Request
 *
 */

public class BatchRequestNotifyMessageFindRequest extends BatchRequestNotifyMessageRequest {
/**
 *
 * Constructor to create a  BatchRequestNotifyMessageFindRequest
 * @param id Unique request name
 * @param batchRequestNotifyMessageFindIn BatchRequestNotifyMessageObjectFilter for BatchRequestNotifyMessageFindRequest
 *
 */
@JsonCreator
  public BatchRequestNotifyMessageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestNotifyMessage")BatchRequestNotifyMessageObjectFilter batchRequestNotifyMessageFindIn) {
    super(id, "BatchRequestNotifyMessageFind");
    if (batchRequestNotifyMessageFindIn != null) {
      Integer index =  batchRequestNotifyMessageFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(batchRequestNotifyMessageFindIn, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }

/**
 *
 * Retrieves the BatchRequestNotifyMessageObjectDataList that results from the BatchRequestNotifyMessageFindRequest call
 * @return BatchRequestNotifyMessageObjectDataList resulting from udt call
 *
 */

  public BatchRequestNotifyMessageObjectDataList getOutput() {
    return BatchRequestNotifyMessageObjectHelper.fromMapList(outputMap, "BatchRequestNotifyMessageList");
  }
}
