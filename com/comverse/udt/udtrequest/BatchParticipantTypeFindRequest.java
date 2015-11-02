/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchParticipantTypeFindRequest.java
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
 * Class used to create a BatchParticipantTypeFindRequest Udt Request
 *
 */

public class BatchParticipantTypeFindRequest extends BatchParticipantTypeRequest {
/**
 *
 * Constructor to create a  BatchParticipantTypeFindRequest
 * @param id Unique request name
 * @param batchParticipantTypeFindIn BatchParticipantTypeObjectFilter for BatchParticipantTypeFindRequest
 *
 */
@JsonCreator
  public BatchParticipantTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchParticipantType")BatchParticipantTypeObjectFilter batchParticipantTypeFindIn) {
    super(id, "BatchParticipantTypeFind");
    if (batchParticipantTypeFindIn != null) {
      Integer index =  batchParticipantTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchParticipantType", BatchParticipantTypeObjectHelper.toMap(batchParticipantTypeFindIn, new HashMap(), "BatchParticipantType").get("BatchParticipantType"));
    }
  }

/**
 *
 * Retrieves the BatchParticipantTypeObjectDataList that results from the BatchParticipantTypeFindRequest call
 * @return BatchParticipantTypeObjectDataList resulting from udt call
 *
 */

  public BatchParticipantTypeObjectDataList getOutput() {
    return BatchParticipantTypeObjectHelper.fromMapList(outputMap, "BatchParticipantTypeList");
  }
}
