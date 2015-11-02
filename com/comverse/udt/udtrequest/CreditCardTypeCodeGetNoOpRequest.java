/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a CreditCardTypeCodeGetNoOpRequest Udt Request/Response
 *
 */
public class CreditCardTypeCodeGetNoOpRequest extends CreditCardTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a   CreditCardTypeCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CreditCardTypeCodeGetNoOpRequest(String id, CreditCardTypeCodeObjectData noOpIn) {
    super(id, "CreditCardTypeCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectHelper.toMap(noOpIn, new HashMap(), "CreditCardTypeCode").get("CreditCardTypeCode"));
    }
  }
/**
 *
 * Retrieves the CreditCardTypeCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardTypeCodeObjectData getOutput() {
    return CreditCardTypeCodeObjectHelper.fromMap(outputMap, "CreditCardTypeCode");
  }
}
