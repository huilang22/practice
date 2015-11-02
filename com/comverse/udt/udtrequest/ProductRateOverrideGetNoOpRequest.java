/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateOverrideGetNoOpRequest.java
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
 * NoOp class used to simulate a ProductRateOverrideGetNoOpRequest Udt Request/Response
 *
 */
public class ProductRateOverrideGetNoOpRequest extends ProductRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a   ProductRateOverrideGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductRateOverrideGetNoOpRequest(String id, ProductRateOverrideObjectData noOpIn) {
    super(id, "ProductRateOverrideGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(noOpIn, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
/**
 *
 * Retrieves the ProductRateOverrideObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateOverrideObjectData getOutput() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
}
