/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelFindRequest.java
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
 * Class used to create a InvsSalesChannelFindRequest Udt Request
 *
 */

public class InvsSalesChannelFindRequest extends InvsSalesChannelRequest {
/**
 *
 * Constructor to create a  InvsSalesChannelFindRequest
 * @param id Unique request name
 * @param InvsSalesChannelFindIn InvsSalesChannelObjectFilter for InvsSalesChannelFindRequest
 *
 */
@JsonCreator
  public InvsSalesChannelFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSalesChannel")InvsSalesChannelObjectFilter InvsSalesChannelFindIn) {
    super(id, "InvsSalesChannelFind");
    if (InvsSalesChannelFindIn != null) {
      Integer index =  InvsSalesChannelFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(InvsSalesChannelFindIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }

/**
 *
 * Retrieves the InvsSalesChannelObjectDataList that results from the InvsSalesChannelFindRequest call
 * @return InvsSalesChannelObjectDataList resulting from udt call
 *
 */

  public InvsSalesChannelObjectDataList getOutput() {
    return InvsSalesChannelObjectHelper.fromMapList(outputMap, "InvsSalesChannelList");
  }
}
