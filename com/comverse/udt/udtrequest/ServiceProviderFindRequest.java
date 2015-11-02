/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderFindRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceProviderFindRequest Udt Request
 *
 */

public class ServiceProviderFindRequest extends ServiceProviderRequest {
/**
 *
 * Constructor to create a  ServiceProviderFindRequest
 * @param id Unique request name
 * @param ServiceProviderFindIn ServiceProviderObjectFilter for ServiceProviderFindRequest
 *
 */
@JsonCreator
  public ServiceProviderFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceProvider")ServiceProviderObjectFilter ServiceProviderFindIn) {
    super(id, "ServiceProviderFind");
    if (ServiceProviderFindIn != null) {
      Integer index =  ServiceProviderFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(ServiceProviderFindIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }

/**
 *
 * Retrieves the ServiceProviderObjectDataList that results from the ServiceProviderFindRequest call
 * @return ServiceProviderObjectDataList resulting from udt call
 *
 */

  public ServiceProviderObjectDataList getOutput() {
    return ServiceProviderObjectHelper.fromMapList(outputMap, "ServiceProviderList");
  }
}
