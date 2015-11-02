/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointGetRequest.java
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
 * Class used to create a UsagePointGetRequest Udt Request
 *
 */

public class UsagePointGetRequest extends UsagePointSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointGetRequest
 * @param id Unique request name
 * @param UsgPntGetIn UsgPntObjectKeyData for UsagePointGetRequest
 *
 */
@JsonCreator
  public UsagePointGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePoint")UsgPntObjectKeyData UsgPntGetIn) {
    super(id, "UsagePointGet");
    if (UsgPntGetIn != null) {
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(UsgPntGetIn, new HashMap(), "UsgPntObjectKeyData").get("UsgPntObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsgPntObjectData that results from the UsagePointGetRequest call
 * @return UsgPntObjectData resulting from udt call
 *
 */

  public UsgPntObjectData getOutput() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
}
