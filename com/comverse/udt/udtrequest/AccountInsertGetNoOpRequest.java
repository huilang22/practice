/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountInsertGetNoOpRequest Udt Request/Response
 *
 */
public class AccountInsertGetNoOpRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a   AccountInsertGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountInsertGetNoOpRequest(String id, AccountInsertObjectData noOpIn) {
    super(id, "AccountInsertGetNoOpRequest");
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
