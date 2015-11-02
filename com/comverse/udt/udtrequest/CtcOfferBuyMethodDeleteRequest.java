/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodDeleteRequest.java
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
 * Class used to create a CtcOfferBuyMethodDeleteRequest Udt Request
 *
 */

public class CtcOfferBuyMethodDeleteRequest extends CtcOfferBuyMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyMethodDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcOfferBuyMethodObjectKeyData for CtcOfferBuyMethodDeleteRequest
 *
 */
@JsonCreator
  public CtcOfferBuyMethodDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuyMethod")CtcOfferBuyMethodObjectKeyData DeleteIn) {
    super(id, "CtcOfferBuyMethodDelete");
    if (DeleteIn != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferBuyMethodObjectKeyData").get("CtcOfferBuyMethodObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyMethodObjectData that results from the CtcOfferBuyMethodDeleteRequest call
 * @return CtcOfferBuyMethodObjectData resulting from udt call
 *
 */

  public CtcOfferBuyMethodObjectData getOutput() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
}
