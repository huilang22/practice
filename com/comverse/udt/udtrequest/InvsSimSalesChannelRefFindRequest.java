/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefFindRequest.java
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
 * Class used to create a InvsSimSalesChannelRefFindRequest Udt Request
 *
 */

public class InvsSimSalesChannelRefFindRequest extends InvsSimSalesChannelRefRequest {
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefFindRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelRefFindIn InvsSimSalesChannelRefObjectFilter for InvsSimSalesChannelRefFindRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannelRef")InvsSimSalesChannelRefObjectFilter InvsSimSalesChannelRefFindIn) {
    super(id, "InvsSimSalesChannelRefFind");
    if (InvsSimSalesChannelRefFindIn != null) {
      Integer index =  InvsSimSalesChannelRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(InvsSimSalesChannelRefFindIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelRefObjectDataList that results from the InvsSimSalesChannelRefFindRequest call
 * @return InvsSimSalesChannelRefObjectDataList resulting from udt call
 *
 */

  public InvsSimSalesChannelRefObjectDataList getOutput() {
    return InvsSimSalesChannelRefObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelRefList");
  }
}
