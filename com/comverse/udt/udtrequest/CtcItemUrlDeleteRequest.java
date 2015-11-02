/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlDeleteRequest.java
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
 * Class used to create a CtcItemUrlDeleteRequest Udt Request
 *
 */

public class CtcItemUrlDeleteRequest extends CtcItemUrlSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemUrlDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcItemUrlObjectKeyData for CtcItemUrlDeleteRequest
 *
 */
@JsonCreator
  public CtcItemUrlDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemUrl")CtcItemUrlObjectKeyData DeleteIn) {
    super(id, "CtcItemUrlDelete");
    if (DeleteIn != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemUrlObjectKeyData").get("CtcItemUrlObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemUrlObjectData that results from the CtcItemUrlDeleteRequest call
 * @return CtcItemUrlObjectData resulting from udt call
 *
 */

  public CtcItemUrlObjectData getOutput() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
}
