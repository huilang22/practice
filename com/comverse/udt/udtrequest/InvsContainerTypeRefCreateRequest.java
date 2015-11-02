/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefCreateRequest.java
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
 * Class used to create a InvsContainerTypeRefCreateRequest Udt Request
 *
 */

public class InvsContainerTypeRefCreateRequest extends InvsContainerTypeRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsContainerTypeRefCreateRequest
 * @param id Unique request name
 * @param InvsContainerTypeRefCreateIn InvsContainerTypeRefObjectData for InvsContainerTypeRefCreateRequest
 *
 */
@JsonCreator
  public InvsContainerTypeRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerTypeRef")InvsContainerTypeRefObjectData InvsContainerTypeRefCreateIn) {
    super(id, "InvsContainerTypeRefCreate");
    if (InvsContainerTypeRefCreateIn != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(InvsContainerTypeRefCreateIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeRefObjectData that results from the InvsContainerTypeRefCreateRequest call
 * @return InvsContainerTypeRefObjectData resulting from udt call
 *
 */

  public InvsContainerTypeRefObjectData getOutput() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
}
