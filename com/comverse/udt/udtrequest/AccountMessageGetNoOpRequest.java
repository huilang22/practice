/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountMessageGetNoOpRequest Udt Request/Response
 *
 */
public class AccountMessageGetNoOpRequest extends AccountMessageSubRequestParent {
/**
 *
 * Constructor to create a   AccountMessageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountMessageGetNoOpRequest(String id, AccountMessageObjectData noOpIn) {
    super(id, "AccountMessageGetNoOpRequest");
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
