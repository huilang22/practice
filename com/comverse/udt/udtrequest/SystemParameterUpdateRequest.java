/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterUpdateRequest.java
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
 * Class used to create a SystemParameterUpdateRequest Udt Request
 *
 */

public class SystemParameterUpdateRequest extends SystemParameterSubRequestParent {
/**
 *
 * Constructor to create a  SystemParameterUpdateRequest
 * @param id Unique request name
 * @param SPUpdateIn SPObjectData for SystemParameterUpdateRequest
 *
 */
@JsonCreator
  public SystemParameterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SystemParameter")SPObjectData SPUpdateIn) {
    super(id, "SystemParameterUpdate");
    if (SPUpdateIn != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(SPUpdateIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }

/**
 *
 * Retrieves the SPObjectData that results from the SystemParameterUpdateRequest call
 * @return SPObjectData resulting from udt call
 *
 */

  public SPObjectData getOutput() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
}
