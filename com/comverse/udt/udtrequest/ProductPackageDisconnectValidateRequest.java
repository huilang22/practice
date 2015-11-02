/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageDisconnectValidateRequest.java
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
 * Class used to create a ProductPackageDisconnectValidateRequest Udt Request
 *
 */

public class ProductPackageDisconnectValidateRequest extends ProductPackageRequest {
/**
 *
 * Constructor to create a  ProductPackageDisconnectValidateRequest
 * @param id Unique request name
 * @param PackageDisconnectValidateIn ProductPackageObjectData for ProductPackageDisconnectValidateRequest
 *
 */
@JsonCreator
  public ProductPackageDisconnectValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectData PackageDisconnectValidateIn) {
    super(id, "ProductPackageDisconnectValidate");
    if (PackageDisconnectValidateIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(PackageDisconnectValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
