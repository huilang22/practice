/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodFindRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcOfferBuyMethodFindRequest Udt Request
 *
 */

public class CtcOfferBuyMethodFindRequest extends CtcOfferBuyMethodRequest {
/**
 *
 * Constructor to create a  CtcOfferBuyMethodFindRequest
 * @param id Unique request name
 * @param FindIn CtcOfferBuyMethodObjectFilter for CtcOfferBuyMethodFindRequest
 *
 */
@JsonCreator
  public CtcOfferBuyMethodFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuyMethod")CtcOfferBuyMethodObjectFilter FindIn) {
    super(id, "CtcOfferBuyMethodFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyMethodObjectDataList that results from the CtcOfferBuyMethodFindRequest call
 * @return CtcOfferBuyMethodObjectDataList resulting from udt call
 *
 */

  public CtcOfferBuyMethodObjectDataList getOutput() {
    return CtcOfferBuyMethodObjectHelper.fromMapList(outputMap, "CtcOfferBuyMethodList");
  }
}
