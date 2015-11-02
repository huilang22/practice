/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderUpdateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvPlaceholderUpdateRequest Udt Request
 *
 */

public class InvPlaceholderUpdateRequest extends InvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a  InvPlaceholderUpdateRequest
 * @param id Unique request name
 * @param updateIn InvPlaceholderObjectData for InvPlaceholderUpdateRequest
 *
 */
@JsonCreator
  public InvPlaceholderUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvPlaceholder")InvPlaceholderObjectData updateIn) {
    super(id, "InvPlaceholderUpdate");
    if (updateIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(updateIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }

/**
 *
 * Retrieves the InvPlaceholderObjectData that results from the InvPlaceholderUpdateRequest call
 * @return InvPlaceholderObjectData resulting from udt call
 *
 */

  public InvPlaceholderObjectData getOutput() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
}
