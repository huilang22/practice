/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityFindRequest.java
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
 * Class used to create a InvsVanityFindRequest Udt Request
 *
 */

public class InvsVanityFindRequest extends InvsVanityRequest {
/**
 *
 * Constructor to create a  InvsVanityFindRequest
 * @param id Unique request name
 * @param InvsVanityFindIn InvsVanityObjectFilter for InvsVanityFindRequest
 *
 */
@JsonCreator
  public InvsVanityFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVanity")InvsVanityObjectFilter InvsVanityFindIn) {
    super(id, "InvsVanityFind");
    if (InvsVanityFindIn != null) {
      Integer index =  InvsVanityFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(InvsVanityFindIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }

/**
 *
 * Retrieves the InvsVanityObjectDataList that results from the InvsVanityFindRequest call
 * @return InvsVanityObjectDataList resulting from udt call
 *
 */

  public InvsVanityObjectDataList getOutput() {
    return InvsVanityObjectHelper.fromMapList(outputMap, "InvsVanityList");
  }
}
