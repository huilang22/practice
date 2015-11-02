/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageCancelRequest.java
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
 * Class used to create a ProductPackageCancelRequest Udt Request
 *
 */

public class ProductPackageCancelRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageCancelRequest
 * @param id Unique request name
 * @param cancelIn ProductPackageObjectData for ProductPackageCancelRequest
 *
 */
@JsonCreator
  public ProductPackageCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectData cancelIn) {
    super(id, "ProductPackageCancel");
    if (cancelIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(cancelIn, new HashMap(), "Void").get("Void"));
    }
  }

}
