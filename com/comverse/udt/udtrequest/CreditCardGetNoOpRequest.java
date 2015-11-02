/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardGetNoOpRequest.java
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
 * NoOp class used to simulate a CreditCardGetNoOpRequest Udt Request/Response
 *
 */
public class CreditCardGetNoOpRequest extends CreditCardSubRequestParent {
/**
 *
 * Constructor to create a   CreditCardGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CreditCardGetNoOpRequest(String id, CreditCardObjectData noOpIn) {
    super(id, "CreditCardGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(noOpIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
/**
 *
 * Retrieves the CreditCardObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardObjectData getOutput() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
}
