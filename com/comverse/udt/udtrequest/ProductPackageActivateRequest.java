/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageActivateRequest.java
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
 * Class used to create a ProductPackageActivateRequest Udt Request
 *
 */

public class ProductPackageActivateRequest extends ProductPackageSubRequestParent {
/**
 *
 * Constructor to create a  ProductPackageActivateRequest
 * @param id Unique request name
 * @param activateIn ProductPackageObjectKeyData for ProductPackageActivateRequest
 *
 */
@JsonCreator
  public ProductPackageActivateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectKeyData activateIn) {
    super(id, "ProductPackageActivate");
    if (activateIn != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(activateIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductPackageObjectData that results from the ProductPackageActivateRequest call
 * @return ProductPackageObjectData resulting from udt call
 *
 */

  public ProductPackageObjectData getOutput() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
}
