/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCodeCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountCodeCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountCodeCreateNoOpRequest extends AccountCodeSubRequestParent {
/**
 *
 * Constructor to create a   AccountCodeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountCodeCreateNoOpRequest(String id, AccountCodeObjectData noOpIn) {
    super(id, "AccountCodeCreateNoOpRequest");
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
