/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusFindRequest.java
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
 * Class used to create a StatusFindRequest Udt Request
 *
 */

public class StatusFindRequest extends StatusRequest {
/**
 *
 * Constructor to create a  StatusFindRequest
 * @param id Unique request name
 * @param StatusFindIn StatusObjectFilter for StatusFindRequest
 *
 */
@JsonCreator
  public StatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Status")StatusObjectFilter StatusFindIn) {
    super(id, "StatusFind");
    if (StatusFindIn != null) {
      Integer index =  StatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Status", StatusObjectHelper.toMap(StatusFindIn, new HashMap(), "Status").get("Status"));
    }
  }

/**
 *
 * Retrieves the StatusObjectDataList that results from the StatusFindRequest call
 * @return StatusObjectDataList resulting from udt call
 *
 */

  public StatusObjectDataList getOutput() {
    return StatusObjectHelper.fromMapList(outputMap, "StatusList");
  }
}
