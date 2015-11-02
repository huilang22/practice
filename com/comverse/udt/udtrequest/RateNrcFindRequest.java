/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcFindRequest.java
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
 * Class used to create a RateNrcFindRequest Udt Request
 *
 */

public class RateNrcFindRequest extends RateNrcRequest {
/**
 *
 * Constructor to create a  RateNrcFindRequest
 * @param id Unique request name
 * @param rnrcFindIn RateNrcObjectFilter for RateNrcFindRequest
 *
 */
@JsonCreator
  public RateNrcFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateNrc")RateNrcObjectFilter rnrcFindIn) {
    super(id, "RateNrcFind");
    if (rnrcFindIn != null) {
      Integer index =  rnrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateNrc", RateNrcObjectHelper.toMap(rnrcFindIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }

/**
 *
 * Retrieves the RateNrcObjectDataList that results from the RateNrcFindRequest call
 * @return RateNrcObjectDataList resulting from udt call
 *
 */

  public RateNrcObjectDataList getOutput() {
    return RateNrcObjectHelper.fromMapList(outputMap, "RateNrcList");
  }
}
