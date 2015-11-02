/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageFindPendingByPackageRequest.java
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
 * Class used to create a ProductPackageFindPendingByPackageRequest Udt Request
 *
 */

public class ProductPackageFindPendingByPackageRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageFindPendingByPackageRequest
 * @param id Unique request name
 * @param FindPendingByPackageIn ProductPackageJoinItemObjectFilter for ProductPackageFindPendingByPackageRequest
 *
 */
@JsonCreator
  public ProductPackageFindPendingByPackageRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageJoinItemObjectFilter FindPendingByPackageIn) {
    super(id, "ProductPackageFindPendingByPackage");
    if (FindPendingByPackageIn != null) {
      Integer index =  FindPendingByPackageIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(FindPendingByPackageIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageServiceOrderObjectDataList that results from the ProductPackageFindPendingByPackageRequest call
 * @return ProductPackageServiceOrderObjectDataList resulting from udt call
 *
 */

  public ProductPackageServiceOrderObjectDataList getOutput() {
    return ProductPackageServiceOrderObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
