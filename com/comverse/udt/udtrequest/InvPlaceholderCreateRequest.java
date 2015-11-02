/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderCreateRequest.java
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
 * Class used to create a InvPlaceholderCreateRequest Udt Request
 *
 */

public class InvPlaceholderCreateRequest extends InvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a  InvPlaceholderCreateRequest
 * @param id Unique request name
 * @param createIn InvPlaceholderObjectData for InvPlaceholderCreateRequest
 *
 */
@JsonCreator
  public InvPlaceholderCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvPlaceholder")InvPlaceholderObjectData createIn) {
    super(id, "InvPlaceholderCreate");
    if (createIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(createIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }

/**
 *
 * Retrieves the InvPlaceholderObjectData that results from the InvPlaceholderCreateRequest call
 * @return InvPlaceholderObjectData resulting from udt call
 *
 */

  public InvPlaceholderObjectData getOutput() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
}
