/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionUpdateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductJurisdictionUpdateRequest Udt Request
 *
 */

public class ProductJurisdictionUpdateRequest extends ProductJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  ProductJurisdictionUpdateRequest
 * @param id Unique request name
 * @param ProductJurisdictionUpdateIn ProductJurisdictionObjectData for ProductJurisdictionUpdateRequest
 * @param ProductJurisdictionUpdateFilter ProductJurisdictionObjectFilter for ProductJurisdictionUpdateRequest
 * @param ProductJurisdictionUpdateGet ProductJurisdictionObjectData for ProductJurisdictionUpdateRequest
 *
 */
@JsonCreator
  public ProductJurisdictionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductJurisdiction")ProductJurisdictionObjectData ProductJurisdictionUpdateIn, @JsonProperty("ProductJurisdictionUpdateFilter")ProductJurisdictionObjectFilter ProductJurisdictionUpdateFilter, @JsonProperty("ProductJurisdictionUpdateGet")ProductJurisdictionObjectData ProductJurisdictionUpdateGet) {
    super(id, "ProductJurisdictionUpdate");
    if (ProductJurisdictionUpdateIn != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionUpdateIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
    if (ProductJurisdictionUpdateFilter != null) {
      Integer index =  ProductJurisdictionUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductJurisdictionUpdateFilter", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionUpdateFilter, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
    if (ProductJurisdictionUpdateGet != null) {
      addInput("ProductJurisdictionUpdateGet", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionUpdateGet, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }

/**
 *
 * Retrieves the ProductJurisdictionObjectData that results from the ProductJurisdictionUpdateRequest call
 * @return ProductJurisdictionObjectData resulting from udt call
 *
 */

  public ProductJurisdictionObjectData getOutput() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
}
