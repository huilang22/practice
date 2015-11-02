/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapUpdateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ProductChargeMapUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProductChargeMapUpdateNoOpRequest extends ProductChargeMapSubRequestParent {
/**
 *
 * Constructor to create a   ProductChargeMapUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductChargeMapUpdateNoOpRequest(String id, ProductChargeMapObjectData noOpIn) {
    super(id, "ProductChargeMapUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(noOpIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }
/**
 *
 * Retrieves the ProductChargeMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductChargeMapObjectData getOutput() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
}
