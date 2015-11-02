/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefGetRequest.java
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
 * Class used to create a InvsLocationRefGetRequest Udt Request
 *
 */

public class InvsLocationRefGetRequest extends InvsLocationRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationRefGetRequest
 * @param id Unique request name
 * @param InvsLocationRefGetIn InvsLocationRefObjectKeyData for InvsLocationRefGetRequest
 *
 */
@JsonCreator
  public InvsLocationRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationRef")InvsLocationRefObjectKeyData InvsLocationRefGetIn) {
    super(id, "InvsLocationRefGet");
    if (InvsLocationRefGetIn != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectKeyHelper.toMap(InvsLocationRefGetIn, new HashMap(), "InvsLocationRefObjectKeyData").get("InvsLocationRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationRefObjectData that results from the InvsLocationRefGetRequest call
 * @return InvsLocationRefObjectData resulting from udt call
 *
 */

  public InvsLocationRefObjectData getOutput() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
}
