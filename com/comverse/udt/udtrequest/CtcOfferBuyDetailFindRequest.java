/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailFindRequest.java
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
 * Class used to create a CtcOfferBuyDetailFindRequest Udt Request
 *
 */

public class CtcOfferBuyDetailFindRequest extends CtcOfferBuyRequest {
/**
 *
 * Constructor to create a  CtcOfferBuyDetailFindRequest
 * @param id Unique request name
 * @param FindDetailIn CtcOfferBuyObjectFilter for CtcOfferBuyDetailFindRequest
 *
 */
@JsonCreator
  public CtcOfferBuyDetailFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectFilter FindDetailIn) {
    super(id, "CtcOfferBuyDetailFind");
    if (FindDetailIn != null) {
      Integer index =  FindDetailIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(FindDetailIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyDetailObjectDataList that results from the CtcOfferBuyDetailFindRequest call
 * @return CtcOfferBuyDetailObjectDataList resulting from udt call
 *
 */

  public CtcOfferBuyDetailObjectDataList getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
}
