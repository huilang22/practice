/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailGetRequest.java
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
 * Class used to create a CtcOfferBuyDetailGetRequest Udt Request
 *
 */

public class CtcOfferBuyDetailGetRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyDetailGetRequest
 * @param id Unique request name
 * @param GetDetailIn CtcOfferBuyObjectKeyData for CtcOfferBuyDetailGetRequest
 *
 */
@JsonCreator
  public CtcOfferBuyDetailGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectKeyData GetDetailIn) {
    super(id, "CtcOfferBuyDetailGet");
    if (GetDetailIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(GetDetailIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyDetailObjectData that results from the CtcOfferBuyDetailGetRequest call
 * @return CtcOfferBuyDetailObjectData resulting from udt call
 *
 */

  public CtcOfferBuyDetailObjectData getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
