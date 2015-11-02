/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyFindRequest.java
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
 * Class used to create a CtcOfferBuyFindRequest Udt Request
 *
 */

public class CtcOfferBuyFindRequest extends CtcOfferBuyRequest {
/**
 *
 * Constructor to create a  CtcOfferBuyFindRequest
 * @param id Unique request name
 * @param FindIn CtcOfferBuyObjectFilter for CtcOfferBuyFindRequest
 *
 */
@JsonCreator
  public CtcOfferBuyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectFilter FindIn) {
    super(id, "CtcOfferBuyFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyObjectDataList that results from the CtcOfferBuyFindRequest call
 * @return CtcOfferBuyObjectDataList resulting from udt call
 *
 */

  public CtcOfferBuyObjectDataList getOutput() {
    return CtcOfferBuyObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
}
