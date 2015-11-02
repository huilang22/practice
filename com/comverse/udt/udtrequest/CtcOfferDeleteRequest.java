/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferDeleteRequest.java
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
 * Class used to create a CtcOfferDeleteRequest Udt Request
 *
 */

public class CtcOfferDeleteRequest extends CtcOfferSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcOfferObjectKeyData for CtcOfferDeleteRequest
 *
 */
@JsonCreator
  public CtcOfferDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectKeyData DeleteIn) {
    super(id, "CtcOfferDelete");
    if (DeleteIn != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferObjectKeyData").get("CtcOfferObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferObjectData that results from the CtcOfferDeleteRequest call
 * @return CtcOfferObjectData resulting from udt call
 *
 */

  public CtcOfferObjectData getOutput() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
}
