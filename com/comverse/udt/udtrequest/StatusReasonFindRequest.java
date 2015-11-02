/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a StatusReasonFindRequest Udt Request
 *
 */

public class StatusReasonFindRequest extends StatusReasonRequest {
/**
 *
 * Constructor to create a  StatusReasonFindRequest
 * @param id Unique request name
 * @param StatusReasonFindIn StatusReasonObjectFilter for StatusReasonFindRequest
 *
 */
@JsonCreator
  public StatusReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReason")StatusReasonObjectFilter StatusReasonFindIn) {
    super(id, "StatusReasonFind");
    if (StatusReasonFindIn != null) {
      Integer index =  StatusReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatusReason", StatusReasonObjectHelper.toMap(StatusReasonFindIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }

/**
 *
 * Retrieves the StatusReasonObjectDataList that results from the StatusReasonFindRequest call
 * @return StatusReasonObjectDataList resulting from udt call
 *
 */

  public StatusReasonObjectDataList getOutput() {
    return StatusReasonObjectHelper.fromMapList(outputMap, "StatusReasonList");
  }
}
