/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateGetNoOpRequest.java
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
 * NoOp class used to simulate a AccountLocateGetNoOpRequest Udt Request/Response
 *
 */
public class AccountLocateGetNoOpRequest extends AccountLocateSubRequestParent {
/**
 *
 * Constructor to create a   AccountLocateGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountLocateGetNoOpRequest(String id, AccountLocateObjectData noOpIn) {
    super(id, "AccountLocateGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AccountLocate", AccountLocateObjectHelper.toMap(noOpIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }
/**
 *
 * Retrieves the AccountLocateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountLocateObjectData getOutput() {
    return AccountLocateObjectHelper.fromMap(outputMap, "AccountLocate");
  }
}
