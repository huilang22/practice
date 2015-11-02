/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferUpdateRequest.java
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
 * Class used to create a CtcOfferUpdateRequest Udt Request
 *
 */

public class CtcOfferUpdateRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcOfferObjectData for CtcOfferUpdateRequest
 *
 */
@JsonCreator
  public CtcOfferUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectData UpdateIn) {
    super(id, "CtcOfferUpdate");
    if (UpdateIn != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }

/**
 *
 * Retrieves the CtcOfferObjectData that results from the CtcOfferUpdateRequest call
 * @return CtcOfferObjectData resulting from udt call
 *
 */

  public CtcOfferObjectData getOutput() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
