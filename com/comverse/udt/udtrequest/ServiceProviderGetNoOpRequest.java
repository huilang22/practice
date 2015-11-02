/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderGetNoOpRequest.java
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
 * NoOp class used to simulate a ServiceProviderGetNoOpRequest Udt Request/Response
 *
 */
public class ServiceProviderGetNoOpRequest extends ServiceProviderSubRequestParent {
/**
 *
 * Constructor to create a   ServiceProviderGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceProviderGetNoOpRequest(String id, ServiceProviderObjectData noOpIn) {
    super(id, "ServiceProviderGetNoOpRequest");
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
