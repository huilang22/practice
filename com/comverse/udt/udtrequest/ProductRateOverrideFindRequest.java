/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductRateOverrideFindRequest Udt Request
 *
 */

public class ProductRateOverrideFindRequest extends ProductRateOverrideRequest {
/**
 *
 * Constructor to create a  ProductRateOverrideFindRequest
 * @param id Unique request name
 * @param PROFindIn ProductRateOverrideObjectFilter for ProductRateOverrideFindRequest
 *
 */
@JsonCreator
  public ProductRateOverrideFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateOverride")ProductRateOverrideObjectFilter PROFindIn) {
    super(id, "ProductRateOverrideFind");
    if (PROFindIn != null) {
      Integer index =  PROFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(PROFindIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }

/**
 *
 * Retrieves the ProductRateOverrideObjectDataList that results from the ProductRateOverrideFindRequest call
 * @return ProductRateOverrideObjectDataList resulting from udt call
 *
 */

  public ProductRateOverrideObjectDataList getOutput() {
    return ProductRateOverrideObjectHelper.fromMapList(outputMap, "ProductRateOverrideList");
  }
}
