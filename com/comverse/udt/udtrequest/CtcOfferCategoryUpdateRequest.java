/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryUpdateRequest.java
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
 * Class used to create a CtcOfferCategoryUpdateRequest Udt Request
 *
 */

public class CtcOfferCategoryUpdateRequest extends CtcOfferCategorySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferCategoryUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcOfferCategoryObjectData for CtcOfferCategoryUpdateRequest
 *
 */
@JsonCreator
  public CtcOfferCategoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferCategory")CtcOfferCategoryObjectData UpdateIn) {
    super(id, "CtcOfferCategoryUpdate");
    if (UpdateIn != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }

/**
 *
 * Retrieves the CtcOfferCategoryObjectData that results from the CtcOfferCategoryUpdateRequest call
 * @return CtcOfferCategoryObjectData resulting from udt call
 *
 */

  public CtcOfferCategoryObjectData getOutput() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
}
