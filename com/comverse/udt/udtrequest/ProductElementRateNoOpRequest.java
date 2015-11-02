/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementRateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ProductElementRateNoOpRequest Udt Request/Response
 *
 */
public class ProductElementRateNoOpRequest extends ProductElementSubRequestParent {
/**
 *
 * Constructor to create a   ProductElementRateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductElementRateNoOpRequest(String id, ProductElementRateOutputData noOpIn) {
    super(id, "ProductElementRateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductElementRateOutputData", ProductElementRateOutputHelper.toMap(noOpIn).get("ProductElementRateOutputData"));
    }
  }
/**
 *
 * Retrieves the ProductElementRateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementRateOutputData getOutput() {
    return ProductElementRateOutputHelper.fromMap(outputMap);
  }
}
