/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageCreateRequest.java
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
 * Class used to create a ProductPackageCreateRequest Udt Request
 *
 */

public class ProductPackageCreateRequest extends ProductPackageSubRequestParent {
/**
 *
 * Constructor to create a  ProductPackageCreateRequest
 * @param id Unique request name
 * @param PackageCreateIn ProductPackageObjectData for ProductPackageCreateRequest
 *
 */
@JsonCreator
  public ProductPackageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectData PackageCreateIn) {
    super(id, "ProductPackageCreate");
    if (PackageCreateIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PackageCreateIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectData that results from the ProductPackageCreateRequest call
 * @return ProductPackageObjectData resulting from udt call
 *
 */

  public ProductPackageObjectData getOutput() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
}
