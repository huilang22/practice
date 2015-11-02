/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeFindRequest.java
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
 * Class used to create a ServiceCenterTypeFindRequest Udt Request
 *
 */

public class ServiceCenterTypeFindRequest extends ServiceCenterTypeRequest {
/**
 *
 * Constructor to create a  ServiceCenterTypeFindRequest
 * @param id Unique request name
 * @param SCTFindIn ServiceCenterTypeObjectFilter for ServiceCenterTypeFindRequest
 *
 */
@JsonCreator
  public ServiceCenterTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceCenterType")ServiceCenterTypeObjectFilter SCTFindIn) {
    super(id, "ServiceCenterTypeFind");
    if (SCTFindIn != null) {
      Integer index =  SCTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceCenterType", ServiceCenterTypeObjectHelper.toMap(SCTFindIn, new HashMap(), "ServiceCenterType").get("ServiceCenterType"));
    }
  }

/**
 *
 * Retrieves the ServiceCenterTypeObjectDataList that results from the ServiceCenterTypeFindRequest call
 * @return ServiceCenterTypeObjectDataList resulting from udt call
 *
 */

  public ServiceCenterTypeObjectDataList getOutput() {
    return ServiceCenterTypeObjectHelper.fromMapList(outputMap, "ServiceCenterTypeList");
  }
}
