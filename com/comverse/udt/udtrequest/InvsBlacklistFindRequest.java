/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistFindRequest.java
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
 * Class used to create a InvsBlacklistFindRequest Udt Request
 *
 */

public class InvsBlacklistFindRequest extends InvsBlacklistRequest {
/**
 *
 * Constructor to create a  InvsBlacklistFindRequest
 * @param id Unique request name
 * @param InvsBlacklistFindIn InvsBlacklistObjectFilter for InvsBlacklistFindRequest
 *
 */
@JsonCreator
  public InvsBlacklistFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsBlacklist")InvsBlacklistObjectFilter InvsBlacklistFindIn) {
    super(id, "InvsBlacklistFind");
    if (InvsBlacklistFindIn != null) {
      Integer index =  InvsBlacklistFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(InvsBlacklistFindIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }

/**
 *
 * Retrieves the InvsBlacklistObjectDataList that results from the InvsBlacklistFindRequest call
 * @return InvsBlacklistObjectDataList resulting from udt call
 *
 */

  public InvsBlacklistObjectDataList getOutput() {
    return InvsBlacklistObjectHelper.fromMapList(outputMap, "InvsBlacklistList");
  }
}
