/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcFindRequest.java
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
 * Class used to create a RateRcFindRequest Udt Request
 *
 */

public class RateRcFindRequest extends RateRcRequest {
/**
 *
 * Constructor to create a  RateRcFindRequest
 * @param id Unique request name
 * @param RACFindIn RACObjectFilter for RateRcFindRequest
 *
 */
@JsonCreator
  public RateRcFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateRc")RACObjectFilter RACFindIn) {
    super(id, "RateRcFind");
    if (RACFindIn != null) {
      Integer index =  RACFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateRc", RACObjectHelper.toMap(RACFindIn, new HashMap(), "RateRc").get("RateRc"));
    }
  }

/**
 *
 * Retrieves the RACObjectDataList that results from the RateRcFindRequest call
 * @return RACObjectDataList resulting from udt call
 *
 */

  public RACObjectDataList getOutput() {
    return RACObjectHelper.fromMapList(outputMap, "RateRcList");
  }
}
