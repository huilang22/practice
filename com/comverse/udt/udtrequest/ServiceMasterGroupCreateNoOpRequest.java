/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a ServiceMasterGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class ServiceMasterGroupCreateNoOpRequest extends ServiceMasterGroupSubRequestParent {
/**
 *
 * Constructor to create a   ServiceMasterGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceMasterGroupCreateNoOpRequest(String id, ServiceMasterGroupObjectData noOpIn) {
    super(id, "ServiceMasterGroupCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(noOpIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }
/**
 *
 * Retrieves the ServiceMasterGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceMasterGroupObjectData getOutput() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
}
