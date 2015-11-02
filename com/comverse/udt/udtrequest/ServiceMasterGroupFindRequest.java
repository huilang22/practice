/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupFindRequest.java
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
 * Class used to create a ServiceMasterGroupFindRequest Udt Request
 *
 */

public class ServiceMasterGroupFindRequest extends ServiceMasterGroupRequest {
/**
 *
 * Constructor to create a  ServiceMasterGroupFindRequest
 * @param id Unique request name
 * @param EMGfindIn ServiceMasterGroupObjectFilter for ServiceMasterGroupFindRequest
 *
 */
@JsonCreator
  public ServiceMasterGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceMasterGroup")ServiceMasterGroupObjectFilter EMGfindIn) {
    super(id, "ServiceMasterGroupFind");
    if (EMGfindIn != null) {
      Integer index =  EMGfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(EMGfindIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }

/**
 *
 * Retrieves the ServiceMasterGroupObjectDataList that results from the ServiceMasterGroupFindRequest call
 * @return ServiceMasterGroupObjectDataList resulting from udt call
 *
 */

  public ServiceMasterGroupObjectDataList getOutput() {
    return ServiceMasterGroupObjectHelper.fromMapList(outputMap, "ServiceMasterGroupList");
  }
}
