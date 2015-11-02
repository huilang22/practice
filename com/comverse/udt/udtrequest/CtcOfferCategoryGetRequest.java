/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryGetRequest.java
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
 * Class used to create a CtcOfferCategoryGetRequest Udt Request
 *
 */

public class CtcOfferCategoryGetRequest extends CtcOfferCategorySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferCategoryGetRequest
 * @param id Unique request name
 * @param GetIn CtcOfferCategoryObjectKeyData for CtcOfferCategoryGetRequest
 *
 */
@JsonCreator
  public CtcOfferCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferCategory")CtcOfferCategoryObjectKeyData GetIn) {
    super(id, "CtcOfferCategoryGet");
    if (GetIn != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferCategoryObjectKeyData").get("CtcOfferCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferCategoryObjectData that results from the CtcOfferCategoryGetRequest call
 * @return CtcOfferCategoryObjectData resulting from udt call
 *
 */

  public CtcOfferCategoryObjectData getOutput() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
}
