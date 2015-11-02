/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountIdGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountIdGetNoOpRequest Udt Request/Response
 *
 */
public class AccountIdGetNoOpRequest extends AccountIdSubRequestParent {
/**
 *
 * Constructor to create a   AccountIdGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountIdGetNoOpRequest(String id, AccountIdObjectData noOpIn) {
    super(id, "AccountIdGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(noOpIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }
/**
 *
 * Retrieves the AccountIdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountIdObjectData getOutput() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
}
