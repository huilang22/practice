/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferSummaryGetRequest.java
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
 * Class used to create a CtcOfferSummaryGetRequest Udt Request
 *
 */

public class CtcOfferSummaryGetRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferSummaryGetRequest
 * @param id Unique request name
 * @param SummaryGetIn CtcOfferObjectKeyData for CtcOfferSummaryGetRequest
 *
 */
@JsonCreator
  public CtcOfferSummaryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectKeyData SummaryGetIn) {
    super(id, "CtcOfferSummaryGet");
    if (SummaryGetIn != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(SummaryGetIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferSummaryObjectData that results from the CtcOfferSummaryGetRequest call
 * @return CtcOfferSummaryObjectData resulting from udt call
 *
 */

  public CtcOfferSummaryObjectData getOutput() {
    return CtcOfferSummaryObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
