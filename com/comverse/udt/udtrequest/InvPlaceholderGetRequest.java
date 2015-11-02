/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderGetRequest.java
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
 * Class used to create a InvPlaceholderGetRequest Udt Request
 *
 */

public class InvPlaceholderGetRequest extends InvPlaceholderSubRequestParent {
/**
 *
 * Constructor to create a  InvPlaceholderGetRequest
 * @param id Unique request name
 * @param getIn InvPlaceholderObjectKeyData for InvPlaceholderGetRequest
 *
 */
@JsonCreator
  public InvPlaceholderGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvPlaceholder")InvPlaceholderObjectKeyData getIn) {
    super(id, "InvPlaceholderGet");
    if (getIn != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectKeyHelper.toMap(getIn, new HashMap(), "InvPlaceholderObjectKeyData").get("InvPlaceholderObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvPlaceholderObjectData that results from the InvPlaceholderGetRequest call
 * @return InvPlaceholderObjectData resulting from udt call
 *
 */

  public InvPlaceholderObjectData getOutput() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
}
