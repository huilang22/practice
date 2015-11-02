/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierFindRequest.java
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
 * Class used to create a RbrRateTierFindRequest Udt Request
 *
 */

public class RbrRateTierFindRequest extends RbrRateTierRequest {
/**
 *
 * Constructor to create a  RbrRateTierFindRequest
 * @param id Unique request name
 * @param RbrRteTierFindIn RbrRteTierObjectFilter for RbrRateTierFindRequest
 *
 */
@JsonCreator
  public RbrRateTierFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRateTier")RbrRteTierObjectFilter RbrRteTierFindIn) {
    super(id, "RbrRateTierFind");
    if (RbrRteTierFindIn != null) {
      Integer index =  RbrRteTierFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(RbrRteTierFindIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }

/**
 *
 * Retrieves the RbrRteTierObjectDataList that results from the RbrRateTierFindRequest call
 * @return RbrRteTierObjectDataList resulting from udt call
 *
 */

  public RbrRteTierObjectDataList getOutput() {
    return RbrRteTierObjectHelper.fromMapList(outputMap, "RbrRateTierList");
  }
}
