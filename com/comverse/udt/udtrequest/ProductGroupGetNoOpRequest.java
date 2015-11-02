/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a ProductGroupGetNoOpRequest Udt Request/Response
 *
 */
public class ProductGroupGetNoOpRequest extends ProductGroupSubRequestParent {
/**
 *
 * Constructor to create a   ProductGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductGroupGetNoOpRequest(String id, ProductGroupObjectData noOpIn) {
    super(id, "ProductGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(noOpIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
/**
 *
 * Retrieves the ProductGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductGroupObjectData getOutput() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
}
