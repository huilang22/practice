/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerLifetimeIdDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CustomerLifetimeIdDeleteNoOpRequest Udt Request/Response
 *
 */
public class CustomerLifetimeIdDeleteNoOpRequest extends CustomerLifetimeIdSubRequestParent {
/**
 *
 * Constructor to create a   CustomerLifetimeIdDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerLifetimeIdDeleteNoOpRequest(String id, CustomerLifetimeIdObjectData noOpIn) {
    super(id, "CustomerLifetimeIdDeleteNoOpRequest");
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
