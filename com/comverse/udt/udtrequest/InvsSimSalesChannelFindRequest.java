/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelFindRequest.java
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
 * Class used to create a InvsSimSalesChannelFindRequest Udt Request
 *
 */

public class InvsSimSalesChannelFindRequest extends InvsSimSalesChannelRequest {
/**
 *
 * Constructor to create a  InvsSimSalesChannelFindRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelFindIn InvsSimSalesChannelObjectFilter for InvsSimSalesChannelFindRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannel")InvsSimSalesChannelObjectFilter InvsSimSalesChannelFindIn) {
    super(id, "InvsSimSalesChannelFind");
    if (InvsSimSalesChannelFindIn != null) {
      Integer index =  InvsSimSalesChannelFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(InvsSimSalesChannelFindIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelObjectDataList that results from the InvsSimSalesChannelFindRequest call
 * @return InvsSimSalesChannelObjectDataList resulting from udt call
 *
 */

  public InvsSimSalesChannelObjectDataList getOutput() {
    return InvsSimSalesChannelObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelList");
  }
}
