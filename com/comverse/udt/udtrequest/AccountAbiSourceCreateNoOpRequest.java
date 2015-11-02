/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountAbiSourceCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountAbiSourceCreateNoOpRequest extends AccountAbiSourceSubRequestParent {
/**
 *
 * Constructor to create a   AccountAbiSourceCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountAbiSourceCreateNoOpRequest(String id, AccountAbiSourceObjectData noOpIn) {
    super(id, "AccountAbiSourceCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(noOpIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
/**
 *
 * Retrieves the AccountAbiSourceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountAbiSourceObjectData getOutput() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
}
