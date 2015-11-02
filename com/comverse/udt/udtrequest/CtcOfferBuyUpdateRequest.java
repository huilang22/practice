/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyUpdateRequest.java
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
 * Class used to create a CtcOfferBuyUpdateRequest Udt Request
 *
 */

public class CtcOfferBuyUpdateRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcOfferBuyObjectData for CtcOfferBuyUpdateRequest
 *
 */
@JsonCreator
  public CtcOfferBuyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectData UpdateIn) {
    super(id, "CtcOfferBuyUpdate");
    if (UpdateIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyObjectData that results from the CtcOfferBuyUpdateRequest call
 * @return CtcOfferBuyObjectData resulting from udt call
 *
 */

  public CtcOfferBuyObjectData getOutput() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
