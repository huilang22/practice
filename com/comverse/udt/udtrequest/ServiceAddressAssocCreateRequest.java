/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCreateRequest.java
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
 * Class used to create a ServiceAddressAssocCreateRequest Udt Request
 *
 */

public class ServiceAddressAssocCreateRequest extends ServiceAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAddressAssocCreateRequest
 * @param id Unique request name
 * @param SADDRACreatelIn ServiceAddressAssocObjectData for ServiceAddressAssocCreateRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssoc")ServiceAddressAssocObjectData SADDRACreatelIn) {
    super(id, "ServiceAddressAssocCreate");
    if (SADDRACreatelIn != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(SADDRACreatelIn, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocObjectData that results from the ServiceAddressAssocCreateRequest call
 * @return ServiceAddressAssocObjectData resulting from udt call
 *
 */

  public ServiceAddressAssocObjectData getOutput() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
}
