/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterFindRequest.java
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
 * Class used to create a InvsRateCenterFindRequest Udt Request
 *
 */

public class InvsRateCenterFindRequest extends InvsRateCenterRequest {
/**
 *
 * Constructor to create a  InvsRateCenterFindRequest
 * @param id Unique request name
 * @param InvsRateCenterFindIn InvsRateCenterObjectFilter for InvsRateCenterFindRequest
 *
 */
@JsonCreator
  public InvsRateCenterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsRateCenter")InvsRateCenterObjectFilter InvsRateCenterFindIn) {
    super(id, "InvsRateCenterFind");
    if (InvsRateCenterFindIn != null) {
      Integer index =  InvsRateCenterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(InvsRateCenterFindIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }

/**
 *
 * Retrieves the InvsRateCenterObjectDataList that results from the InvsRateCenterFindRequest call
 * @return InvsRateCenterObjectDataList resulting from udt call
 *
 */

  public InvsRateCenterObjectDataList getOutput() {
    return InvsRateCenterObjectHelper.fromMapList(outputMap, "InvsRateCenterList");
  }
}
