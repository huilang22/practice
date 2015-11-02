/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterCreateRequest.java
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
 * Class used to create a SystemParameterCreateRequest Udt Request
 *
 */

public class SystemParameterCreateRequest extends SystemParameterSubRequestParent {
/**
 *
 * Constructor to create a  SystemParameterCreateRequest
 * @param id Unique request name
 * @param SPCreateIn SPObjectData for SystemParameterCreateRequest
 *
 */
@JsonCreator
  public SystemParameterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SystemParameter")SPObjectData SPCreateIn) {
    super(id, "SystemParameterCreate");
    if (SPCreateIn != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(SPCreateIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }

/**
 *
 * Retrieves the SPObjectData that results from the SystemParameterCreateRequest call
 * @return SPObjectData resulting from udt call
 *
 */

  public SPObjectData getOutput() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
}
