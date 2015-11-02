/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertUpdateNoOpRequest.java
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
 * NoOp class used to simulate a AccountInsertUpdateNoOpRequest Udt Request/Response
 *
 */
public class AccountInsertUpdateNoOpRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a   AccountInsertUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountInsertUpdateNoOpRequest(String id, AccountInsertObjectData noOpIn) {
    super(id, "AccountInsertUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(noOpIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
/**
 *
 * Retrieves the AccountInsertObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountInsertObjectData getOutput() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
}
