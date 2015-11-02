/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountGetNoOpRequest.java
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
 * NoOp class used to simulate a ContractDiscountGetNoOpRequest Udt Request/Response
 *
 */
public class ContractDiscountGetNoOpRequest extends ContractDiscountSubRequestParent {
/**
 *
 * Constructor to create a   ContractDiscountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ContractDiscountGetNoOpRequest(String id, ContractDiscountObjectData noOpIn) {
    super(id, "ContractDiscountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ContractDiscount", ContractDiscountObjectHelper.toMap(noOpIn, new HashMap(), "ContractDiscount").get("ContractDiscount"));
    }
  }
/**
 *
 * Retrieves the ContractDiscountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ContractDiscountObjectData getOutput() {
    return ContractDiscountObjectHelper.fromMap(outputMap, "ContractDiscount");
  }
}
