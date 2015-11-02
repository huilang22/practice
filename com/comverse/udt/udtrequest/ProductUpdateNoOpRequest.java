/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ProductUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProductUpdateNoOpRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a   ProductUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductUpdateNoOpRequest(String id, ProductObjectBaseData noOpIn) {
    super(id, "ProductUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(noOpIn, new HashMap(), "Product").get("Product"));
    }
  }
/**
 *
 * Retrieves the ProductObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductObjectBaseData getOutput() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
}
