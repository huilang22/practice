/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryFindRequest.java
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
 * Class used to create a OppvDeliveryFindRequest Udt Request
 *
 */

public class OppvDeliveryFindRequest extends OppvDeliveryRequest {
/**
 *
 * Constructor to create a  OppvDeliveryFindRequest
 * @param id Unique request name
 * @param findIn OppvDeliveryExtObjFilter for OppvDeliveryFindRequest
 *
 */
@JsonCreator
  public OppvDeliveryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OppvDelivery")OppvDeliveryExtObjFilter findIn) {
    super(id, "OppvDeliveryFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OppvDelivery", OppvDeliveryExtObjHelper.toMap(findIn, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }

/**
 *
 * Retrieves the OppvDeliveryExtObjDataList that results from the OppvDeliveryFindRequest call
 * @return OppvDeliveryExtObjDataList resulting from udt call
 *
 */

  public OppvDeliveryExtObjDataList getOutput() {
    return OppvDeliveryExtObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
}
