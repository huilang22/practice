/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdGetNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CustomerLifetimeIdGetNoOpRequest Udt Request/Response
 *
 */
public class CustomerLifetimeIdGetNoOpRequest extends CustomerLifetimeIdSubRequestParent {
/**
 *
 * Constructor to create a   CustomerLifetimeIdGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerLifetimeIdGetNoOpRequest(String id, CustomerLifetimeIdObjectData noOpIn) {
    super(id, "CustomerLifetimeIdGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(noOpIn, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
/**
 *
 * Retrieves the CustomerLifetimeIdObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerLifetimeIdObjectData getOutput() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
}
