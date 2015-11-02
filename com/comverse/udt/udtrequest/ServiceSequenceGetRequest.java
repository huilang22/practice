/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceSequenceGetRequest.java
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
 * Class used to create a ServiceSequenceGetRequest Udt Request
 *
 */

public class ServiceSequenceGetRequest extends ServiceSubRequestParent {
/**
 *
 * Constructor to create a  ServiceSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public ServiceSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "ServiceSequenceGet");
  }

/**
 *
 * Retrieves the ServiceObjectBaseData that results from the ServiceSequenceGetRequest call
 * @return ServiceObjectBaseData resulting from udt call
 *
 */

  public ServiceObjectBaseData getOutput() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
}
