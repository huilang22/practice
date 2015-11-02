/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDeleteRequest.java
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
 * Class used to create a CtcOfferBuyDeleteRequest Udt Request
 *
 */

public class CtcOfferBuyDeleteRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcOfferBuyObjectKeyData for CtcOfferBuyDeleteRequest
 *
 */
@JsonCreator
  public CtcOfferBuyDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectKeyData DeleteIn) {
    super(id, "CtcOfferBuyDelete");
    if (DeleteIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyObjectData that results from the CtcOfferBuyDeleteRequest call
 * @return CtcOfferBuyObjectData resulting from udt call
 *
 */

  public CtcOfferBuyObjectData getOutput() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
