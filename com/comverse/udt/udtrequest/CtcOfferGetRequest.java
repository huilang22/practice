/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferGetRequest.java
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
 * Class used to create a CtcOfferGetRequest Udt Request
 *
 */

public class CtcOfferGetRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferGetRequest
 * @param id Unique request name
 * @param GetIn CtcOfferObjectKeyData for CtcOfferGetRequest
 *
 */
@JsonCreator
  public CtcOfferGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectKeyData GetIn) {
    super(id, "CtcOfferGet");
    if (GetIn != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferObjectData that results from the CtcOfferGetRequest call
 * @return CtcOfferObjectData resulting from udt call
 *
 */

  public CtcOfferObjectData getOutput() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
