/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageOwnerFindRequest.java
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
 * Class used to create a ProductPackageOwnerFindRequest Udt Request
 *
 */

public class ProductPackageOwnerFindRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageOwnerFindRequest
 * @param id Unique request name
 * @param OwnfindIn ProductPackageOwnerObjectFilter for ProductPackageOwnerFindRequest
 *
 */
@JsonCreator
  public ProductPackageOwnerFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageOwnerObjectFilter OwnfindIn) {
    super(id, "ProductPackageOwnerFind");
    if (OwnfindIn != null) {
      Integer index =  OwnfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageOwnerObjectHelper.toMap(OwnfindIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectDataList that results from the ProductPackageOwnerFindRequest call
 * @return ProductPackageObjectDataList resulting from udt call
 *
 */

  public ProductPackageObjectDataList getOutput() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
