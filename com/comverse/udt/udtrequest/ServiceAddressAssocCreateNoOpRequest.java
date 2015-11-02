/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceAddressAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocCreateNoOpRequest extends ServiceAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a   ServiceAddressAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocCreateNoOpRequest(String id, ServiceAddressAssocObjectData noOpIn) {
    super(id, "ServiceAddressAssocCreateNoOpRequest");
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
