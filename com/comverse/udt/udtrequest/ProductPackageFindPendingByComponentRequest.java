/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageFindPendingByComponentRequest.java
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
 * Class used to create a ProductPackageFindPendingByComponentRequest Udt Request
 *
 */

public class ProductPackageFindPendingByComponentRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageFindPendingByComponentRequest
 * @param id Unique request name
 * @param FindPendingByCompIn ProductPackageJoinItemObjectFilter for ProductPackageFindPendingByComponentRequest
 *
 */
@JsonCreator
  public ProductPackageFindPendingByComponentRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageJoinItemObjectFilter FindPendingByCompIn) {
    super(id, "ProductPackageFindPendingByComponent");
    if (FindPendingByCompIn != null) {
      Integer index =  FindPendingByCompIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(FindPendingByCompIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageServiceOrderObjectDataList that results from the ProductPackageFindPendingByComponentRequest call
 * @return ProductPackageServiceOrderObjectDataList resulting from udt call
 *
 */

  public ProductPackageServiceOrderObjectDataList getOutput() {
    return ProductPackageServiceOrderObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
