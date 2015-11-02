/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferDetailGetRequest.java
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
 * Class used to create a CtcOfferDetailGetRequest Udt Request
 *
 */

public class CtcOfferDetailGetRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferDetailGetRequest
 * @param id Unique request name
 * @param DetailGetIn CtcOfferObjectKeyData for CtcOfferDetailGetRequest
 *
 */
@JsonCreator
  public CtcOfferDetailGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectKeyData DetailGetIn) {
    super(id, "CtcOfferDetailGet");
    if (DetailGetIn != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(DetailGetIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferDetailObjectData that results from the CtcOfferDetailGetRequest call
 * @return CtcOfferDetailObjectData resulting from udt call
 *
 */

  public CtcOfferDetailObjectData getOutput() {
    return CtcOfferDetailObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
