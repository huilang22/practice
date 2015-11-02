/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointDeleteRequest.java
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
 * Class used to create a UsagePointDeleteRequest Udt Request
 *
 */

public class UsagePointDeleteRequest extends UsagePointSubRequestParent {
/**
 *
 * Constructor to create a  UsagePointDeleteRequest
 * @param id Unique request name
 * @param UsgPntDeleteIn UsgPntObjectKeyData for UsagePointDeleteRequest
 *
 */
@JsonCreator
  public UsagePointDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePoint")UsgPntObjectKeyData UsgPntDeleteIn) {
    super(id, "UsagePointDelete");
    if (UsgPntDeleteIn != null) {
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(UsgPntDeleteIn, new HashMap(), "UsgPntObjectKeyData").get("UsgPntObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsgPntObjectData that results from the UsagePointDeleteRequest call
 * @return UsgPntObjectData resulting from udt call
 *
 */

  public UsgPntObjectData getOutput() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
}
