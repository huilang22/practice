/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCreateRequest.java
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
 * Class used to create a CtcOfferCreateRequest Udt Request
 *
 */

public class CtcOfferCreateRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcOfferObjectData for CtcOfferCreateRequest
 *
 */
@JsonCreator
  public CtcOfferCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectData CreateIn) {
    super(id, "CtcOfferCreate");
    if (CreateIn != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(CreateIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }

/**
 *
 * Retrieves the CtcOfferObjectData that results from the CtcOfferCreateRequest call
 * @return CtcOfferObjectData resulting from udt call
 *
 */

  public CtcOfferObjectData getOutput() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
