/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementFindByServiceOrderRequest.java
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
 * Class used to create a InvElementFindByServiceOrderRequest Udt Request
 *
 */

public class InvElementFindByServiceOrderRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementFindByServiceOrderRequest
 * @param id Unique request name
 * @param InvFndByServiceOrderIn InvElementObjFilter for InvElementFindByServiceOrderRequest
 * @param ServiceOrderId String for InvElementFindByServiceOrderRequest
 *
 */
@JsonCreator
  public InvElementFindByServiceOrderRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvFndByServiceOrderIn, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "InvElementFindByServiceOrder");
    if (InvFndByServiceOrderIn != null) {
      Integer index =  InvFndByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvFndByServiceOrderIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementFindByServiceOrderRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
