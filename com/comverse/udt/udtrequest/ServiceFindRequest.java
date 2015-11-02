/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindRequest.java
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
 * Class used to create a ServiceFindRequest Udt Request
 *
 */

public class ServiceFindRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceFindRequest
 * @param id Unique request name
 * @param ServiceFindIn ServiceObjectBaseFilter for ServiceFindRequest
 *
 */
@JsonCreator
  public ServiceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseFilter ServiceFindIn) {
    super(id, "ServiceFind");
    if (ServiceFindIn != null) {
      Integer index =  ServiceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceFindIn, new HashMap(), "Service").get("Service"));
    }
  }

/**
 *
 * Retrieves the ServiceObjectBaseDataList that results from the ServiceFindRequest call
 * @return ServiceObjectBaseDataList resulting from udt call
 *
 */

  public ServiceObjectBaseDataList getOutput() {
    return ServiceObjectBaseHelper.fromMapList(outputMap, "ServiceList");
  }
}
