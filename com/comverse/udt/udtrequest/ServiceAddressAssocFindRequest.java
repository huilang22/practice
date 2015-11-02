/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocFindRequest.java
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
 * Class used to create a ServiceAddressAssocFindRequest Udt Request
 *
 */

public class ServiceAddressAssocFindRequest extends ServiceAddressAssocRequest {
/**
 *
 * Constructor to create a  ServiceAddressAssocFindRequest
 * @param id Unique request name
 * @param SADDRAFindIn ServiceAddressAssocObjectFilter for ServiceAddressAssocFindRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssoc")ServiceAddressAssocObjectFilter SADDRAFindIn) {
    super(id, "ServiceAddressAssocFind");
    if (SADDRAFindIn != null) {
      Integer index =  SADDRAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(SADDRAFindIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocObjectDataList that results from the ServiceAddressAssocFindRequest call
 * @return ServiceAddressAssocObjectDataList resulting from udt call
 *
 */

  public ServiceAddressAssocObjectDataList getOutput() {
    return ServiceAddressAssocObjectHelper.fromMapList(outputMap, "ServiceAddressAssocList");
  }
}
