/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementValidateCreateNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProductElementValidateCreateNoOpRequest Udt Request/Response
 *
 */
public class ProductElementValidateCreateNoOpRequest extends ProductElementValidateSubRequestParent {
/**
 *
 * Constructor to create a   ProductElementValidateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductElementValidateCreateNoOpRequest(String id, ProductElementObjectData noOpIn) {
    super(id, "ProductElementValidateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductElementValidate", ProductElementObjectHelper.toMap(noOpIn, new HashMap(), "ProductElementValidate").get("ProductElementValidate"));
    }
  }
/**
 *
 * Retrieves the ProductElementObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectData getOutput() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElementValidate");
  }
}
