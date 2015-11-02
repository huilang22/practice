/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefUpdateRequest.java
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
 * Class used to create a InvsContainerTypeRefUpdateRequest Udt Request
 *
 */

public class InvsContainerTypeRefUpdateRequest extends InvsContainerTypeRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsContainerTypeRefUpdateRequest
 * @param id Unique request name
 * @param InvsContainerTypeRefUpdateIn InvsContainerTypeRefObjectData for InvsContainerTypeRefUpdateRequest
 *
 */
@JsonCreator
  public InvsContainerTypeRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerTypeRef")InvsContainerTypeRefObjectData InvsContainerTypeRefUpdateIn) {
    super(id, "InvsContainerTypeRefUpdate");
    if (InvsContainerTypeRefUpdateIn != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(InvsContainerTypeRefUpdateIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeRefObjectData that results from the InvsContainerTypeRefUpdateRequest call
 * @return InvsContainerTypeRefObjectData resulting from udt call
 *
 */

  public InvsContainerTypeRefObjectData getOutput() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
}
