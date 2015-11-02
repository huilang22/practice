/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryNonCancelledFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OppvDeliveryNonCancelledFindRequest Udt Request
 *
 */

public class OppvDeliveryNonCancelledFindRequest extends OppvDeliveryRequest {
/**
 *
 * Constructor to create a  OppvDeliveryNonCancelledFindRequest
 * @param id Unique request name
 * @param ncfindIn OppvOrderItemObjFilter for OppvDeliveryNonCancelledFindRequest
 *
 */
@JsonCreator
  public OppvDeliveryNonCancelledFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OppvDelivery")OppvOrderItemObjFilter ncfindIn) {
    super(id, "OppvDeliveryNonCancelledFind");
    if (ncfindIn != null) {
      Integer index =  ncfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OppvDelivery", OppvOrderItemObjHelper.toMap(ncfindIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }

/**
 *
 * Retrieves the OppvOrderItemObjDataList that results from the OppvDeliveryNonCancelledFindRequest call
 * @return OppvOrderItemObjDataList resulting from udt call
 *
 */

  public OppvOrderItemObjDataList getOutput() {
    return OppvOrderItemObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
}
