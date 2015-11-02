/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailDeleteRequest.java
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
 * Class used to create a CtcOfferBuyDetailDeleteRequest Udt Request
 *
 */

public class CtcOfferBuyDetailDeleteRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyDetailDeleteRequest
 * @param id Unique request name
 * @param DeleteDetailIn CtcOfferBuyObjectKeyData for CtcOfferBuyDetailDeleteRequest
 *
 */
@JsonCreator
  public CtcOfferBuyDetailDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectKeyData DeleteDetailIn) {
    super(id, "CtcOfferBuyDetailDelete");
    if (DeleteDetailIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(DeleteDetailIn, new HashMap(), "CtcOfferBuyObjectKeyData").get("CtcOfferBuyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyDetailObjectData that results from the CtcOfferBuyDetailDeleteRequest call
 * @return CtcOfferBuyDetailObjectData resulting from udt call
 *
 */

  public CtcOfferBuyDetailObjectData getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
