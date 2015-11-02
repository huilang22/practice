/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductCreateNoOpRequest.java
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
 * NoOp class used to simulate a ProductCreateNoOpRequest Udt Request/Response
 *
 */
public class ProductCreateNoOpRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a   ProductCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductCreateNoOpRequest(String id, ProductObjectBaseData noOpIn) {
    super(id, "ProductCreateNoOpRequest");
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
