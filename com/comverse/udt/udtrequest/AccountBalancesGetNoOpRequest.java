/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountBalancesGetNoOpRequest Udt Request/Response
 *
 */
public class AccountBalancesGetNoOpRequest extends AccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a   AccountBalancesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountBalancesGetNoOpRequest(String id, AccountBalancesObjectData noOpIn) {
    super(id, "AccountBalancesGetNoOpRequest");
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
