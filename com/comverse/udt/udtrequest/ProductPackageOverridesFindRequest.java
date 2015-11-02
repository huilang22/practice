/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageOverridesFindRequest.java
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
 * Class used to create a ProductPackageOverridesFindRequest Udt Request
 *
 */

public class ProductPackageOverridesFindRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageOverridesFindRequest
 * @param id Unique request name
 * @param PPOFindIn ProductPackageObjectFilter for ProductPackageOverridesFindRequest
 *
 */
@JsonCreator
  public ProductPackageOverridesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectFilter PPOFindIn) {
    super(id, "ProductPackageOverridesFind");
    if (PPOFindIn != null) {
      Integer index =  PPOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PPOFindIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectDataList that results from the ProductPackageOverridesFindRequest call
 * @return ProductPackageObjectDataList resulting from udt call
 *
 */

  public ProductPackageObjectDataList getOutput() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
