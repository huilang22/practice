/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogDeleteListRequest.java
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
 * Class used to create a BatchRequestErrorLogDeleteListRequest Udt Request
 *
 */

public class BatchRequestErrorLogDeleteListRequest extends BatchRequestErrorLogEntryRequest {
/**
 *
 * Constructor to create a  BatchRequestErrorLogDeleteListRequest
 * @param id Unique request name
 * @param batchRequestErrorLogEntryDeleteListIn BatchRequestErrorLogEntryObjectBaseFilter for BatchRequestErrorLogDeleteListRequest
 *
 */
@JsonCreator
  public BatchRequestErrorLogDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestErrorLogEntry")BatchRequestErrorLogEntryObjectBaseFilter batchRequestErrorLogEntryDeleteListIn) {
    super(id, "BatchRequestErrorLogDeleteList");
    if (batchRequestErrorLogEntryDeleteListIn != null) {
      Integer index =  batchRequestErrorLogEntryDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(batchRequestErrorLogEntryDeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }

}
