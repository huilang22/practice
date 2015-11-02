/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocUpdateNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressAssocUpdateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocUpdateNoOpRequest extends ServiceAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a   ServiceAddressAssocUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocUpdateNoOpRequest(String id, ServiceAddressAssocObjectData noOpIn) {
    super(id, "ServiceAddressAssocUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(noOpIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }
/**
 *
 * Retrieves the ServiceAddressAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocObjectData getOutput() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
}
