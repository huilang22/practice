/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SystemParameterGetRequest Udt Request
 *
 */

public class SystemParameterGetRequest extends SystemParameterSubRequestParent {
/**
 *
 * Constructor to create a  SystemParameterGetRequest
 * @param id Unique request name
 * @param SPGetIn SPObjectKeyData for SystemParameterGetRequest
 *
 */
@JsonCreator
  public SystemParameterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SystemParameter")SPObjectKeyData SPGetIn) {
    super(id, "SystemParameterGet");
    if (SPGetIn != null) {
      addInput("SystemParameter", SPObjectKeyHelper.toMap(SPGetIn, new HashMap(), "SPObjectKeyData").get("SPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SPObjectData that results from the SystemParameterGetRequest call
 * @return SPObjectData resulting from udt call
 *
 */

  public SPObjectData getOutput() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
}
