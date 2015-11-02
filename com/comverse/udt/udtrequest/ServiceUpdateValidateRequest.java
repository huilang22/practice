/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceUpdateValidateRequest.java
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
 * Class used to create a ServiceUpdateValidateRequest Udt Request
 *
 */

public class ServiceUpdateValidateRequest extends ServiceRequest {
/**
 *
 * Constructor to create a  ServiceUpdateValidateRequest
 * @param id Unique request name
 * @param ServiceUpdValidateIn ServiceObjectBaseData for ServiceUpdateValidateRequest
 *
 */
@JsonCreator
  public ServiceUpdateValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseData ServiceUpdValidateIn) {
    super(id, "ServiceUpdateValidate");
    if (ServiceUpdValidateIn != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceUpdValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
