/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceProviderUpdateNoOpRequest Udt Request/Response
 *
 */
public class ServiceProviderUpdateNoOpRequest extends ServiceProviderSubRequestParent {
/**
 *
 * Constructor to create a   ServiceProviderUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceProviderUpdateNoOpRequest(String id, ServiceProviderObjectData noOpIn) {
    super(id, "ServiceProviderUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(noOpIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }
/**
 *
 * Retrieves the ServiceProviderObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceProviderObjectData getOutput() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
}
