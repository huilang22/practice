/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideCreateRequest.java
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
 * Class used to create a ProductRateOverrideCreateRequest Udt Request
 *
 */

public class ProductRateOverrideCreateRequest extends ProductRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a  ProductRateOverrideCreateRequest
 * @param id Unique request name
 * @param PROCreateIn ProductRateOverrideObjectData for ProductRateOverrideCreateRequest
 *
 */
@JsonCreator
  public ProductRateOverrideCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateOverride")ProductRateOverrideObjectData PROCreateIn) {
    super(id, "ProductRateOverrideCreate");
    if (PROCreateIn != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(PROCreateIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }

/**
 *
 * Retrieves the ProductRateOverrideObjectData that results from the ProductRateOverrideCreateRequest call
 * @return ProductRateOverrideObjectData resulting from udt call
 *
 */

  public ProductRateOverrideObjectData getOutput() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
}
