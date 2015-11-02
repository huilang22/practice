/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageGetRequest.java
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
 * Class used to create a ProductPackageGetRequest Udt Request
 *
 */

public class ProductPackageGetRequest extends ProductPackageSubRequestParent {
/**
 *
 * Constructor to create a  ProductPackageGetRequest
 * @param id Unique request name
 * @param getIn ProductPackageObjectKeyData for ProductPackageGetRequest
 *
 */
@JsonCreator
  public ProductPackageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectKeyData getIn) {
    super(id, "ProductPackageGet");
    if (getIn != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(getIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectData that results from the ProductPackageGetRequest call
 * @return ProductPackageObjectData resulting from udt call
 *
 */

  public ProductPackageObjectData getOutput() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
}
