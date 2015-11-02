/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvdThresholdFindRequest Udt Request
 *
 */

public class InvdThresholdFindRequest extends InvdThresholdRequest {
/**
 *
 * Constructor to create a  InvdThresholdFindRequest
 * @param id Unique request name
 * @param InvdThresholdFindIn InvdThresholdObjectFilter for InvdThresholdFindRequest
 *
 */
@JsonCreator
  public InvdThresholdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdThreshold")InvdThresholdObjectFilter InvdThresholdFindIn) {
    super(id, "InvdThresholdFind");
    if (InvdThresholdFindIn != null) {
      Integer index =  InvdThresholdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(InvdThresholdFindIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }

/**
 *
 * Retrieves the InvdThresholdObjectDataList that results from the InvdThresholdFindRequest call
 * @return InvdThresholdObjectDataList resulting from udt call
 *
 */

  public InvdThresholdObjectDataList getOutput() {
    return InvdThresholdObjectHelper.fromMapList(outputMap, "InvdThresholdList");
  }
}
