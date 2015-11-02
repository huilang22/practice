/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideDeleteListRequest.java
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
 * Class used to create a ProductRateOverrideDeleteListRequest Udt Request
 *
 */

public class ProductRateOverrideDeleteListRequest extends ProductRateOverrideRequest {
/**
 *
 * Constructor to create a  ProductRateOverrideDeleteListRequest
 * @param id Unique request name
 * @param ProductRateOverrideFilter ProductRateOverrideObjectFilter for ProductRateOverrideDeleteListRequest
 * @param PRODLCeaseDate Date for ProductRateOverrideDeleteListRequest
 *
 */
@JsonCreator
  public ProductRateOverrideDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateOverrideFilter")ProductRateOverrideObjectFilter ProductRateOverrideFilter, @JsonProperty("InactiveDate")Date PRODLCeaseDate) {
    super(id, "ProductRateOverrideDeleteList");
    if (ProductRateOverrideFilter != null) {
      Integer index =  ProductRateOverrideFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateOverrideFilter", ProductRateOverrideObjectHelper.toMap(ProductRateOverrideFilter, new HashMap(), "Void").get("Void"));
    }
    if (PRODLCeaseDate != null) {
      addInput("InactiveDate", PRODLCeaseDate);
    }
  }

}
