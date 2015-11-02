/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefGetRequest.java
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
 * Class used to create a InvsContainerTypeRefGetRequest Udt Request
 *
 */

public class InvsContainerTypeRefGetRequest extends InvsContainerTypeRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsContainerTypeRefGetRequest
 * @param id Unique request name
 * @param InvsContainerTypeRefGetIn InvsContainerTypeRefObjectKeyData for InvsContainerTypeRefGetRequest
 *
 */
@JsonCreator
  public InvsContainerTypeRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerTypeRef")InvsContainerTypeRefObjectKeyData InvsContainerTypeRefGetIn) {
    super(id, "InvsContainerTypeRefGet");
    if (InvsContainerTypeRefGetIn != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectKeyHelper.toMap(InvsContainerTypeRefGetIn, new HashMap(), "InvsContainerTypeRefObjectKeyData").get("InvsContainerTypeRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeRefObjectData that results from the InvsContainerTypeRefGetRequest call
 * @return InvsContainerTypeRefObjectData resulting from udt call
 *
 */

  public InvsContainerTypeRefObjectData getOutput() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
}
