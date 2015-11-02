/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocUpdateRequest.java
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
 * Class used to create a ServiceAddressAssocUpdateRequest Udt Request
 *
 */

public class ServiceAddressAssocUpdateRequest extends ServiceAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAddressAssocUpdateRequest
 * @param id Unique request name
 * @param SADDRAUpdateIn ServiceAddressAssocObjectData for ServiceAddressAssocUpdateRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssoc")ServiceAddressAssocObjectData SADDRAUpdateIn) {
    super(id, "ServiceAddressAssocUpdate");
    if (SADDRAUpdateIn != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(SADDRAUpdateIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocObjectData that results from the ServiceAddressAssocUpdateRequest call
 * @return ServiceAddressAssocObjectData resulting from udt call
 *
 */

  public ServiceAddressAssocObjectData getOutput() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
}
