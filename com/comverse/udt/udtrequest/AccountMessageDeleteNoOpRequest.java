/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageDeleteNoOpRequest.java
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
 * NoOp class used to simulate a AccountMessageDeleteNoOpRequest Udt Request/Response
 *
 */
public class AccountMessageDeleteNoOpRequest extends AccountMessageSubRequestParent {
/**
 *
 * Constructor to create a   AccountMessageDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountMessageDeleteNoOpRequest(String id, AccountMessageObjectData noOpIn) {
    super(id, "AccountMessageDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(noOpIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
/**
 *
 * Retrieves the AccountMessageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountMessageObjectData getOutput() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
}
