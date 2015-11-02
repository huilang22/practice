/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageFindRequest.java
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
 * Class used to create a ProductPackageFindRequest Udt Request
 *
 */

public class ProductPackageFindRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageFindRequest
 * @param id Unique request name
 * @param findIn ProductPackageObjectFilter for ProductPackageFindRequest
 *
 */
@JsonCreator
  public ProductPackageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectFilter findIn) {
    super(id, "ProductPackageFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(findIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectDataList that results from the ProductPackageFindRequest call
 * @return ProductPackageObjectDataList resulting from udt call
 *
 */

  public ProductPackageObjectDataList getOutput() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
