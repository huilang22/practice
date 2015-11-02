/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeDeleteRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcUrlTypeDeleteRequest Udt Request
 *
 */

public class CtcUrlTypeDeleteRequest extends CtcUrlTypeSubRequestParent {
/**
 *
 * Constructor to create a  CtcUrlTypeDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcUrlTypeObjectKeyData for CtcUrlTypeDeleteRequest
 *
 */
@JsonCreator
  public CtcUrlTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcUrlType")CtcUrlTypeObjectKeyData DeleteIn) {
    super(id, "CtcUrlTypeDelete");
    if (DeleteIn != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcUrlTypeObjectKeyData").get("CtcUrlTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcUrlTypeObjectData that results from the CtcUrlTypeDeleteRequest call
 * @return CtcUrlTypeObjectData resulting from udt call
 *
 */

  public CtcUrlTypeObjectData getOutput() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
}
