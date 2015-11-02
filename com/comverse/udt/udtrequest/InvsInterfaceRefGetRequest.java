/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefGetRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsInterfaceRefGetRequest Udt Request
 *
 */

public class InvsInterfaceRefGetRequest extends InvsInterfaceRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsInterfaceRefGetRequest
 * @param id Unique request name
 * @param InvsInterfaceRefGetIn InvsInterfaceRefObjectKeyData for InvsInterfaceRefGetRequest
 *
 */
@JsonCreator
  public InvsInterfaceRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterfaceRef")InvsInterfaceRefObjectKeyData InvsInterfaceRefGetIn) {
    super(id, "InvsInterfaceRefGet");
    if (InvsInterfaceRefGetIn != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectKeyHelper.toMap(InvsInterfaceRefGetIn, new HashMap(), "InvsInterfaceRefObjectKeyData").get("InvsInterfaceRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceRefObjectData that results from the InvsInterfaceRefGetRequest call
 * @return InvsInterfaceRefObjectData resulting from udt call
 *
 */

  public InvsInterfaceRefObjectData getOutput() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
}
