/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDeleteListRequest.java
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
 * Class used to create a BatchRequestParticipantDeleteListRequest Udt Request
 *
 */

public class BatchRequestParticipantDeleteListRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantDeleteListRequest
 * @param id Unique request name
 * @param batchRequestParticipantDeleteListIn BatchRequestParticipantObjectBaseFilter for BatchRequestParticipantDeleteListRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectBaseFilter batchRequestParticipantDeleteListIn) {
    super(id, "BatchRequestParticipantDeleteList");
    if (batchRequestParticipantDeleteListIn != null) {
      Integer index =  batchRequestParticipantDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(batchRequestParticipantDeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }

}
