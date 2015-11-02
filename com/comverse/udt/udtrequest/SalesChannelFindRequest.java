/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SalesChannelFindRequest Udt Request
 *
 */

public class SalesChannelFindRequest extends SalesChannelRequest {
/**
 *
 * Constructor to create a  SalesChannelFindRequest
 * @param id Unique request name
 * @param SCFindIn SalesChannelObjectFilter for SalesChannelFindRequest
 *
 */
@JsonCreator
  public SalesChannelFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SalesChannel")SalesChannelObjectFilter SCFindIn) {
    super(id, "SalesChannelFind");
    if (SCFindIn != null) {
      Integer index =  SCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(SCFindIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }

/**
 *
 * Retrieves the SalesChannelObjectDataList that results from the SalesChannelFindRequest call
 * @return SalesChannelObjectDataList resulting from udt call
 *
 */

  public SalesChannelObjectDataList getOutput() {
    return SalesChannelObjectHelper.fromMapList(outputMap, "SalesChannelList");
  }
}
