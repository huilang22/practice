/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategoryFindRequest.java
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
 * Class used to create a CtcOfferCategoryFindRequest Udt Request
 *
 */

public class CtcOfferCategoryFindRequest extends CtcOfferCategoryRequest {
/**
 *
 * Constructor to create a  CtcOfferCategoryFindRequest
 * @param id Unique request name
 * @param FindIn CtcOfferCategoryObjectFilter for CtcOfferCategoryFindRequest
 *
 */
@JsonCreator
  public CtcOfferCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferCategory")CtcOfferCategoryObjectFilter FindIn) {
    super(id, "CtcOfferCategoryFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }

/**
 *
 * Retrieves the CtcOfferCategoryObjectDataList that results from the CtcOfferCategoryFindRequest call
 * @return CtcOfferCategoryObjectDataList resulting from udt call
 *
 */

  public CtcOfferCategoryObjectDataList getOutput() {
    return CtcOfferCategoryObjectHelper.fromMapList(outputMap, "CtcOfferCategoryList");
  }
}
