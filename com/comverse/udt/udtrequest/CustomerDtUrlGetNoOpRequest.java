/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtUrlGetNoOpRequest.java
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
 * NoOp class used to simulate a CustomerDtUrlGetNoOpRequest Udt Request/Response
 *
 */
public class CustomerDtUrlGetNoOpRequest extends CustomerDtUrlSubRequestParent {
/**
 *
 * Constructor to create a   CustomerDtUrlGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CustomerDtUrlGetNoOpRequest(String id, CustomerDtUrlObjectData noOpIn) {
    super(id, "CustomerDtUrlGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CustomerDtUrl", CustomerDtUrlObjectHelper.toMap(noOpIn, new HashMap(), "CustomerDtUrl").get("CustomerDtUrl"));
    }
  }
/**
 *
 * Retrieves the CustomerDtUrlObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerDtUrlObjectData getOutput() {
    return CustomerDtUrlObjectHelper.fromMap(outputMap, "CustomerDtUrl");
  }
}
