/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractCreateNoOpRequest.java
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
 * NoOp class used to simulate a CustomerContractCreateNoOpRequest Udt Request/Response
 *
 */
public class CustomerContractCreateNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   CustomerContractCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerContractCreateNoOpRequest(String id, CustomerContractObjectBaseData noOpIn) {
    super(id, "CustomerContractCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(noOpIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
/**
 *
 * Retrieves the CustomerContractObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
