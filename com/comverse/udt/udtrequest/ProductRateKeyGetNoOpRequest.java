/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyGetNoOpRequest.java
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
 * NoOp class used to simulate a ProductRateKeyGetNoOpRequest Udt Request/Response
 *
 */
public class ProductRateKeyGetNoOpRequest extends ProductRateKeySubRequestParent {
/**
 *
 * Constructor to create a   ProductRateKeyGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductRateKeyGetNoOpRequest(String id, ProductRateKeyObjectData noOpIn) {
    super(id, "ProductRateKeyGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(noOpIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
/**
 *
 * Retrieves the ProductRateKeyObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductRateKeyObjectData getOutput() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
}
