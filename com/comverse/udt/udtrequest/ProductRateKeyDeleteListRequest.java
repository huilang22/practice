/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyDeleteListRequest.java
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
 * Class used to create a ProductRateKeyDeleteListRequest Udt Request
 *
 */

public class ProductRateKeyDeleteListRequest extends ProductRateKeyRequest {
/**
 *
 * Constructor to create a  ProductRateKeyDeleteListRequest
 * @param id Unique request name
 * @param ProductRateKeyFilter ProductRateKeyObjectFilter for ProductRateKeyDeleteListRequest
 * @param PRKLCeaseDate Date for ProductRateKeyDeleteListRequest
 *
 */
@JsonCreator
  public ProductRateKeyDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateKeyFilter")ProductRateKeyObjectFilter ProductRateKeyFilter, @JsonProperty("InactiveDate")Date PRKLCeaseDate) {
    super(id, "ProductRateKeyDeleteList");
    if (ProductRateKeyFilter != null) {
      Integer index =  ProductRateKeyFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateKeyFilter", ProductRateKeyObjectHelper.toMap(ProductRateKeyFilter, new HashMap(), "Void").get("Void"));
    }
    if (PRKLCeaseDate != null) {
      addInput("InactiveDate", PRKLCeaseDate);
    }
  }

}
