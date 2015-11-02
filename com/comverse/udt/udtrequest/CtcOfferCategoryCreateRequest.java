/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryCreateRequest.java
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
 * Class used to create a CtcOfferCategoryCreateRequest Udt Request
 *
 */

public class CtcOfferCategoryCreateRequest extends CtcOfferCategorySubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferCategoryCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcOfferCategoryObjectData for CtcOfferCategoryCreateRequest
 *
 */
@JsonCreator
  public CtcOfferCategoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferCategory")CtcOfferCategoryObjectData CreateIn) {
    super(id, "CtcOfferCategoryCreate");
    if (CreateIn != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }

/**
 *
 * Retrieves the CtcOfferCategoryObjectData that results from the CtcOfferCategoryCreateRequest call
 * @return CtcOfferCategoryObjectData resulting from udt call
 *
 */

  public CtcOfferCategoryObjectData getOutput() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
}
