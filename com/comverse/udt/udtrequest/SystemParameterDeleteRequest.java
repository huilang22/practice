/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterDeleteRequest.java
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
 * Class used to create a SystemParameterDeleteRequest Udt Request
 *
 */

public class SystemParameterDeleteRequest extends SystemParameterSubRequestParent {
/**
 *
 * Constructor to create a  SystemParameterDeleteRequest
 * @param id Unique request name
 * @param SPDeleteIn SPObjectKeyData for SystemParameterDeleteRequest
 *
 */
@JsonCreator
  public SystemParameterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("SystemParameter")SPObjectKeyData SPDeleteIn) {
    super(id, "SystemParameterDelete");
    if (SPDeleteIn != null) {
      addInput("SystemParameter", SPObjectKeyHelper.toMap(SPDeleteIn, new HashMap(), "SPObjectKeyData").get("SPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SPObjectData that results from the SystemParameterDeleteRequest call
 * @return SPObjectData resulting from udt call
 *
 */

  public SPObjectData getOutput() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
}
