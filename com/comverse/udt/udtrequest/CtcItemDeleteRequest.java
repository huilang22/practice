/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemDeleteRequest.java
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
 * Class used to create a CtcItemDeleteRequest Udt Request
 *
 */

public class CtcItemDeleteRequest extends CtcItemSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcItemObjectKeyData for CtcItemDeleteRequest
 *
 */
@JsonCreator
  public CtcItemDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItem")CtcItemObjectKeyData DeleteIn) {
    super(id, "CtcItemDelete");
    if (DeleteIn != null) {
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemObjectKeyData").get("CtcItemObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemObjectData that results from the CtcItemDeleteRequest call
 * @return CtcItemObjectData resulting from udt call
 *
 */

  public CtcItemObjectData getOutput() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
}
