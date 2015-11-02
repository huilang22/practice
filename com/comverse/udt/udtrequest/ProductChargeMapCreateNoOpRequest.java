/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapCreateNoOpRequest.java
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
 * NoOp class used to simulate a ProductChargeMapCreateNoOpRequest Udt Request/Response
 *
 */
public class ProductChargeMapCreateNoOpRequest extends ProductChargeMapSubRequestParent {
/**
 *
 * Constructor to create a   ProductChargeMapCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductChargeMapCreateNoOpRequest(String id, ProductChargeMapObjectData noOpIn) {
    super(id, "ProductChargeMapCreateNoOpRequest");
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
