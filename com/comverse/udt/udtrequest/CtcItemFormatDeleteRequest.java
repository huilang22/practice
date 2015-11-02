/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatDeleteRequest.java
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
 * Class used to create a CtcItemFormatDeleteRequest Udt Request
 *
 */

public class CtcItemFormatDeleteRequest extends CtcItemFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemFormatDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcItemFormatObjectKeyData for CtcItemFormatDeleteRequest
 *
 */
@JsonCreator
  public CtcItemFormatDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemFormat")CtcItemFormatObjectKeyData DeleteIn) {
    super(id, "CtcItemFormatDelete");
    if (DeleteIn != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemFormatObjectKeyData").get("CtcItemFormatObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemFormatObjectData that results from the CtcItemFormatDeleteRequest call
 * @return CtcItemFormatObjectData resulting from udt call
 *
 */

  public CtcItemFormatObjectData getOutput() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
}
