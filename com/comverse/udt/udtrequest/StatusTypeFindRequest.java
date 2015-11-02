/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeFindRequest.java
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
 * Class used to create a StatusTypeFindRequest Udt Request
 *
 */

public class StatusTypeFindRequest extends StatusTypeRequest {
/**
 *
 * Constructor to create a  StatusTypeFindRequest
 * @param id Unique request name
 * @param StatusTypeFindIn StatusTypeObjectFilter for StatusTypeFindRequest
 *
 */
@JsonCreator
  public StatusTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusType")StatusTypeObjectFilter StatusTypeFindIn) {
    super(id, "StatusTypeFind");
    if (StatusTypeFindIn != null) {
      Integer index =  StatusTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatusType", StatusTypeObjectHelper.toMap(StatusTypeFindIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }

/**
 *
 * Retrieves the StatusTypeObjectDataList that results from the StatusTypeFindRequest call
 * @return StatusTypeObjectDataList resulting from udt call
 *
 */

  public StatusTypeObjectDataList getOutput() {
    return StatusTypeObjectHelper.fromMapList(outputMap, "StatusTypeList");
  }
}
