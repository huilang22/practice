/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressFindRequest.java
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
 * Class used to create a ServiceAddressFindRequest Udt Request
 *
 */

public class ServiceAddressFindRequest extends ServiceAddressRequest {
/**
 *
 * Constructor to create a  ServiceAddressFindRequest
 * @param id Unique request name
 * @param findIn ServiceAddressObjectFilter for ServiceAddressFindRequest
 *
 */
@JsonCreator
  public ServiceAddressFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddress")ServiceAddressObjectFilter findIn) {
    super(id, "ServiceAddressFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddress", ServiceAddressObjectHelper.toMap(findIn, new HashMap(), "ServiceAddress").get("ServiceAddress"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressObjectDataList that results from the ServiceAddressFindRequest call
 * @return ServiceAddressObjectDataList resulting from udt call
 *
 */

  public ServiceAddressObjectDataList getOutput() {
    return ServiceAddressObjectHelper.fromMapList(outputMap, "ServiceAddressList");
  }
}
