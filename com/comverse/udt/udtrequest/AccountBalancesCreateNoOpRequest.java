/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountBalancesCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountBalancesCreateNoOpRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a   AccountBalancesCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBalancesCreateNoOpRequest(String id, AccountBalancesObjectData noOpIn) {
    super(id, "AccountBalancesCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(noOpIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
/**
 *
 * Retrieves the AccountBalancesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBalancesObjectData getOutput() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
}
