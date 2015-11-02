/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideGetRequest.java
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
 * Class used to create a ProductRateOverrideGetRequest Udt Request
 *
 */

public class ProductRateOverrideGetRequest extends ProductRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a  ProductRateOverrideGetRequest
 * @param id Unique request name
 * @param PROGetIn ProductRateOverrideObjectKeyData for ProductRateOverrideGetRequest
 *
 */
@JsonCreator
  public ProductRateOverrideGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateOverride")ProductRateOverrideObjectKeyData PROGetIn) {
    super(id, "ProductRateOverrideGet");
    if (PROGetIn != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(PROGetIn, new HashMap(), "ProductRateOverrideObjectKeyData").get("ProductRateOverrideObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductRateOverrideObjectData that results from the ProductRateOverrideGetRequest call
 * @return ProductRateOverrideObjectData resulting from udt call
 *
 */

  public ProductRateOverrideObjectData getOutput() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
}
