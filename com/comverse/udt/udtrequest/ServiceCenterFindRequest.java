/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterFindRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceCenterFindRequest Udt Request
 *
 */

public class ServiceCenterFindRequest extends ServiceCenterRequest {
/**
 *
 * Constructor to create a  ServiceCenterFindRequest
 * @param id Unique request name
 * @param SCFindIn ServiceCenterObjectFilter for ServiceCenterFindRequest
 *
 */
@JsonCreator
  public ServiceCenterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenter")ServiceCenterObjectFilter SCFindIn) {
    super(id, "ServiceCenterFind");
    if (SCFindIn != null) {
      Integer index =  SCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(SCFindIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterObjectDataList that results from the ServiceCenterFindRequest call
 * @return ServiceCenterObjectDataList resulting from udt call
 *
 */

  public ServiceCenterObjectDataList getOutput() {
    return ServiceCenterObjectHelper.fromMapList(outputMap, "ServiceCenterList");
  }
}
