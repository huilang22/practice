/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageDeleteListRequest.java
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
 * Class used to create a ProductPackageDeleteListRequest Udt Request
 *
 */

public class ProductPackageDeleteListRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageDeleteListRequest
 * @param id Unique request name
 * @param ProductPackageDeleteListIn ProductPackageObjectFilter for ProductPackageDeleteListRequest
 * @param InactiveDate Date for ProductPackageDeleteListRequest
 *
 */
@JsonCreator
  public ProductPackageDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectFilter ProductPackageDeleteListIn, @JsonProperty("InactiveDate")Date InactiveDate) {
    super(id, "ProductPackageDeleteList");
    if (ProductPackageDeleteListIn != null) {
      Integer index =  ProductPackageDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(ProductPackageDeleteListIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectDataList that results from the ProductPackageDeleteListRequest call
 * @return ProductPackageObjectDataList resulting from udt call
 *
 */

  public ProductPackageObjectDataList getOutput() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
