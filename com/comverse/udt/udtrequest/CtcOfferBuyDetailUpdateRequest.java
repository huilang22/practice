/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailUpdateRequest.java
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
 * Class used to create a CtcOfferBuyDetailUpdateRequest Udt Request
 *
 */

public class CtcOfferBuyDetailUpdateRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyDetailUpdateRequest
 * @param id Unique request name
 * @param UpdateDetailIn CtcOfferBuyObjectData for CtcOfferBuyDetailUpdateRequest
 *
 */
@JsonCreator
  public CtcOfferBuyDetailUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectData UpdateDetailIn) {
    super(id, "CtcOfferBuyDetailUpdate");
    if (UpdateDetailIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(UpdateDetailIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyDetailObjectData that results from the CtcOfferBuyDetailUpdateRequest call
 * @return CtcOfferBuyDetailObjectData resulting from udt call
 *
 */

  public CtcOfferBuyDetailObjectData getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
