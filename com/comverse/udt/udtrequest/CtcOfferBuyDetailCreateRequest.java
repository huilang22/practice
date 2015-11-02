/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferBuyDetailCreateRequest.java
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
 * Class used to create a CtcOfferBuyDetailCreateRequest Udt Request
 *
 */

public class CtcOfferBuyDetailCreateRequest extends CtcOfferBuySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferBuyDetailCreateRequest
 * @param id Unique request name
 * @param CreateDetailIn CtcOfferBuyObjectData for CtcOfferBuyDetailCreateRequest
 *
 */
@JsonCreator
  public CtcOfferBuyDetailCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferBuy")CtcOfferBuyObjectData CreateDetailIn) {
    super(id, "CtcOfferBuyDetailCreate");
    if (CreateDetailIn != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(CreateDetailIn, new HashMap(), "CreateDetailOut").get("CreateDetailOut"));
    }
  }

/**
 *
 * Retrieves the CtcOfferBuyDetailObjectData that results from the CtcOfferBuyDetailCreateRequest call
 * @return CtcOfferBuyDetailObjectData resulting from udt call
 *
 */

  public CtcOfferBuyDetailObjectData getOutput() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CreateDetailOut");
  }
}
