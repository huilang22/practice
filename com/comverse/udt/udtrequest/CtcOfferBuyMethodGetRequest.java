/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodGetRequest.java
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
 * Class used to create a CtcOfferBuyMethodGetRequest Udt Request
 *
 */

public class CtcOfferBuyMethodGetRequest extends CtcOfferBuyMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyMethodGetRequest
 * @param id Unique request name
 * @param GetIn CtcOfferBuyMethodObjectKeyData for CtcOfferBuyMethodGetRequest
 *
 */
@JsonCreator
  public CtcOfferBuyMethodGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuyMethod")CtcOfferBuyMethodObjectKeyData GetIn) {
    super(id, "CtcOfferBuyMethodGet");
    if (GetIn != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferBuyMethodObjectKeyData").get("CtcOfferBuyMethodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyMethodObjectData that results from the CtcOfferBuyMethodGetRequest call
 * @return CtcOfferBuyMethodObjectData resulting from udt call
 *
 */

  public CtcOfferBuyMethodObjectData getOutput() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
}
