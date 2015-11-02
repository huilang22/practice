/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideDeleteRequest.java
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
 * Class used to create a ProductRateOverrideDeleteRequest Udt Request
 *
 */

public class ProductRateOverrideDeleteRequest extends ProductRateOverrideRequest {
/**
 *
 * Constructor to create a  ProductRateOverrideDeleteRequest
 * @param id Unique request name
 * @param PRODeleteIn ProductRateOverrideObjectKeyData for ProductRateOverrideDeleteRequest
 * @param PRODCeaseDate Date for ProductRateOverrideDeleteRequest
 *
 */
@JsonCreator
  public ProductRateOverrideDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateOverride")ProductRateOverrideObjectKeyData PRODeleteIn, @JsonProperty("InactiveDate")Date PRODCeaseDate) {
    super(id, "ProductRateOverrideDelete");
    if (PRODeleteIn != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(PRODeleteIn, new HashMap(), "ProductRateOverrideObjectKeyData").get("ProductRateOverrideObjectKeyData"));
    }
    if (PRODCeaseDate != null) {
      addInput("InactiveDate", PRODCeaseDate);
    }
  }

}
