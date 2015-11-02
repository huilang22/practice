/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyCreateRequest.java
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
 * Class used to create a CtcOfferBuyCreateRequest Udt Request
 *
 */

public class CtcOfferBuyCreateRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcOfferBuyObjectData for CtcOfferBuyCreateRequest
 *
 */
@JsonCreator
  public CtcOfferBuyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectData CreateIn) {
    super(id, "CtcOfferBuyCreate");
    if (CreateIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyObjectData that results from the CtcOfferBuyCreateRequest call
 * @return CtcOfferBuyObjectData resulting from udt call
 *
 */

  public CtcOfferBuyObjectData getOutput() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
