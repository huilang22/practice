/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductFindWithExtendedDataRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductFindWithExtendedDataRequest Udt Request
 *
 */

public class ProductFindWithExtendedDataRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductFindWithExtendedDataRequest
 * @param id Unique request name
 * @param PFindWithIn ProductObjectFilter for ProductFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public ProductFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectFilter PFindWithIn) {
    super(id, "ProductFindWithExtendedData");
    if (PFindWithIn != null) {
      Integer index =  PFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectHelper.toMap(PFindWithIn, new HashMap(), "Product").get("Product"));
    }
  }

/**
 *
 * Retrieves the ProductObjectDataList that results from the ProductFindWithExtendedDataRequest call
 * @return ProductObjectDataList resulting from udt call
 *
 */

  public ProductObjectDataList getOutput() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
}
