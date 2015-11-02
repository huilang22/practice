/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyMethodCreateRequest.java
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
 * Class used to create a CtcOfferBuyMethodCreateRequest Udt Request
 *
 */

public class CtcOfferBuyMethodCreateRequest extends CtcOfferBuyMethodSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyMethodCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcOfferBuyMethodObjectData for CtcOfferBuyMethodCreateRequest
 *
 */
@JsonCreator
  public CtcOfferBuyMethodCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuyMethod")CtcOfferBuyMethodObjectData CreateIn) {
    super(id, "CtcOfferBuyMethodCreate");
    if (CreateIn != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyMethodObjectData that results from the CtcOfferBuyMethodCreateRequest call
 * @return CtcOfferBuyMethodObjectData resulting from udt call
 *
 */

  public CtcOfferBuyMethodObjectData getOutput() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
}
