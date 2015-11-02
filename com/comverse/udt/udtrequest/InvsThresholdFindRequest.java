/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdFindRequest.java
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
 * Class used to create a InvsThresholdFindRequest Udt Request
 *
 */

public class InvsThresholdFindRequest extends InvsThresholdRequest {
/**
 *
 * Constructor to create a  InvsThresholdFindRequest
 * @param id Unique request name
 * @param InvsThresholdFindIn InvsThresholdObjectFilter for InvsThresholdFindRequest
 *
 */
@JsonCreator
  public InvsThresholdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsThreshold")InvsThresholdObjectFilter InvsThresholdFindIn) {
    super(id, "InvsThresholdFind");
    if (InvsThresholdFindIn != null) {
      Integer index =  InvsThresholdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(InvsThresholdFindIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }

/**
 *
 * Retrieves the InvsThresholdObjectDataList that results from the InvsThresholdFindRequest call
 * @return InvsThresholdObjectDataList resulting from udt call
 *
 */

  public InvsThresholdObjectDataList getOutput() {
    return InvsThresholdObjectHelper.fromMapList(outputMap, "InvsThresholdList");
  }
}
