/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageUpdateRequest.java
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
 * Class used to create a ProductPackageUpdateRequest Udt Request
 *
 */

public class ProductPackageUpdateRequest extends ProductPackageSubRequestParent {
/**
 *
 * Constructor to create a  ProductPackageUpdateRequest
 * @param id Unique request name
 * @param PackageUpdateIn ProductPackageObjectData for ProductPackageUpdateRequest
 *
 */
@JsonCreator
  public ProductPackageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectData PackageUpdateIn) {
    super(id, "ProductPackageUpdate");
    if (PackageUpdateIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PackageUpdateIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectData that results from the ProductPackageUpdateRequest call
 * @return ProductPackageObjectData resulting from udt call
 *
 */

  public ProductPackageObjectData getOutput() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
}
