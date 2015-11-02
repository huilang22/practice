/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountInsertCreateNoOpRequest.java
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
 * NoOp class used to simulate a AccountInsertCreateNoOpRequest Udt Request/Response
 *
 */
public class AccountInsertCreateNoOpRequest extends AccountInsertSubRequestParent {
/**
 *
 * Constructor to create a   AccountInsertCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountInsertCreateNoOpRequest(String id, AccountInsertObjectData noOpIn) {
    super(id, "AccountInsertCreateNoOpRequest");
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
