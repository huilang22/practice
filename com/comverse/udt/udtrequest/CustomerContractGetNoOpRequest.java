/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractGetNoOpRequest.java
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
 * NoOp class used to simulate a CustomerContractGetNoOpRequest Udt Request/Response
 *
 */
public class CustomerContractGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   CustomerContractGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerContractGetNoOpRequest(String id, CustomerContractObjectBaseData noOpIn) {
    super(id, "CustomerContractGetNoOpRequest");
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
