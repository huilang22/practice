/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeGetNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeGetNoOpRequest extends AccountCodeSubRequestParent {
/**
 *
 * Constructor to create a   AccountCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeGetNoOpRequest(String id, AccountCodeObjectData noOpIn) {
    super(id, "AccountCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(noOpIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
/**
 *
 * Retrieves the AccountCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountCodeObjectData getOutput() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
}
