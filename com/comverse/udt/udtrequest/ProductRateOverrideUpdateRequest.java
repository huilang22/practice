/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideUpdateRequest.java
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
 * Class used to create a ProductRateOverrideUpdateRequest Udt Request
 *
 */

public class ProductRateOverrideUpdateRequest extends ProductRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a  ProductRateOverrideUpdateRequest
 * @param id Unique request name
 * @param PROUpdateIn ProductRateOverrideObjectData for ProductRateOverrideUpdateRequest
 *
 */
@JsonCreator
  public ProductRateOverrideUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateOverride")ProductRateOverrideObjectData PROUpdateIn) {
    super(id, "ProductRateOverrideUpdate");
    if (PROUpdateIn != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(PROUpdateIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }

/**
 *
 * Retrieves the ProductRateOverrideObjectData that results from the ProductRateOverrideUpdateRequest call
 * @return ProductRateOverrideObjectData resulting from udt call
 *
 */

  public ProductRateOverrideObjectData getOutput() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
}
