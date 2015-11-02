/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageUpdateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ProductPackageUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProductPackageUpdateNoOpRequest extends ProductPackageSubRequestParent {
/**
 *
 * Constructor to create a   ProductPackageUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductPackageUpdateNoOpRequest(String id, ProductPackageObjectData noOpIn) {
    super(id, "ProductPackageUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(noOpIn, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
/**
 *
 * Retrieves the ProductPackageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductPackageObjectData getOutput() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
}
