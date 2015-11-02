/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocGetRequest.java
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
 * Class used to create a ServiceAddressAssocGetRequest Udt Request
 *
 */

public class ServiceAddressAssocGetRequest extends ServiceAddressAssocSubRequestParent {
/**
 *
 * Constructor to create a  ServiceAddressAssocGetRequest
 * @param id Unique request name
 * @param SADDRAGetIn ServiceAddressAssocObjectKeyData for ServiceAddressAssocGetRequest
 *
 */
@JsonCreator
  public ServiceAddressAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceAddressAssoc")ServiceAddressAssocObjectKeyData SADDRAGetIn) {
    super(id, "ServiceAddressAssocGet");
    if (SADDRAGetIn != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectKeyHelper.toMap(SADDRAGetIn, new HashMap(), "ServiceAddressAssocObjectKeyData").get("ServiceAddressAssocObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServiceAddressAssocObjectData that results from the ServiceAddressAssocGetRequest call
 * @return ServiceAddressAssocObjectData resulting from udt call
 *
 */

  public ServiceAddressAssocObjectData getOutput() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
}
