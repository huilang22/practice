/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageDeleteRequest.java
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
 * Class used to create a ProductPackageDeleteRequest Udt Request
 *
 */

public class ProductPackageDeleteRequest extends ProductPackageSubRequestParent {
/**
 *
 * Constructor to create a  ProductPackageDeleteRequest
 * @param id Unique request name
 * @param PackageDeleteIn ProductPackageObjectKeyData for ProductPackageDeleteRequest
 * @param PPDCeaseDate Date for ProductPackageDeleteRequest
 *
 */
@JsonCreator
  public ProductPackageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectKeyData PackageDeleteIn, @JsonProperty("InactiveDate")Date PPDCeaseDate) {
    super(id, "ProductPackageDelete");
    if (PackageDeleteIn != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(PackageDeleteIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
    if (PPDCeaseDate != null) {
      addInput("InactiveDate", PPDCeaseDate);
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectData that results from the ProductPackageDeleteRequest call
 * @return ProductPackageObjectData resulting from udt call
 *
 */

  public ProductPackageObjectData getOutput() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
}
