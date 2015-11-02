/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyGetRequest.java
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
 * Class used to create a CtcOfferBuyGetRequest Udt Request
 *
 */

public class CtcOfferBuyGetRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyGetRequest
 * @param id Unique request name
 * @param GetIn CtcOfferBuyObjectKeyData for CtcOfferBuyGetRequest
 *
 */
@JsonCreator
  public CtcOfferBuyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectKeyData GetIn) {
    super(id, "CtcOfferBuyGet");
    if (GetIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyObjectData that results from the CtcOfferBuyGetRequest call
 * @return CtcOfferBuyObjectData resulting from udt call
 *
 */

  public CtcOfferBuyObjectData getOutput() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
