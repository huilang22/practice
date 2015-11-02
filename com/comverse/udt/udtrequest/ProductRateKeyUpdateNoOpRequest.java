/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ProductRateKeyUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProductRateKeyUpdateNoOpRequest extends ProductRateKeySubRequestParent {
/**
 *
 * Constructor to create a   ProductRateKeyUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductRateKeyUpdateNoOpRequest(String id, ProductRateKeyObjectData noOpIn) {
    super(id, "ProductRateKeyUpdateNoOpRequest");
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
