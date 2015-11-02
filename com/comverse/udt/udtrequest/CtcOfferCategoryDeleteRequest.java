/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryDeleteRequest.java
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
 * Class used to create a CtcOfferCategoryDeleteRequest Udt Request
 *
 */

public class CtcOfferCategoryDeleteRequest extends CtcOfferCategorySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferCategoryDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcOfferCategoryObjectKeyData for CtcOfferCategoryDeleteRequest
 *
 */
@JsonCreator
  public CtcOfferCategoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferCategory")CtcOfferCategoryObjectKeyData DeleteIn) {
    super(id, "CtcOfferCategoryDelete");
    if (DeleteIn != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferCategoryObjectKeyData").get("CtcOfferCategoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferCategoryObjectData that results from the CtcOfferCategoryDeleteRequest call
 * @return CtcOfferCategoryObjectData resulting from udt call
 *
 */

  public CtcOfferCategoryObjectData getOutput() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
}
