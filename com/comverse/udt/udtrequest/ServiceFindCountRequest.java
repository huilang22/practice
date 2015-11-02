/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindCountRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceFindCountRequest Udt Request
 *
 */

public class ServiceFindCountRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceFindCountRequest
 * @param id Unique request name
 * @param ServiceXIDFindCIn ServiceObjectFilter for ServiceFindCountRequest
 *
 */
@JsonCreator
  public ServiceFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectFilter ServiceXIDFindCIn) {
    super(id, "ServiceFindCount");
    if (ServiceXIDFindCIn != null) {
      Integer index =  ServiceXIDFindCIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceXIDFindCIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the ServiceFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
