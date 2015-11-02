/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeUpdateRequest.java
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
 * Class used to create a InvsContainerTypeUpdateRequest Udt Request
 *
 */

public class InvsContainerTypeUpdateRequest extends InvsContainerTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsContainerTypeUpdateRequest
 * @param id Unique request name
 * @param InvsContainerTypeUpdateIn InvsContainerTypeObjectData for InvsContainerTypeUpdateRequest
 *
 */
@JsonCreator
  public InvsContainerTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerType")InvsContainerTypeObjectData InvsContainerTypeUpdateIn) {
    super(id, "InvsContainerTypeUpdate");
    if (InvsContainerTypeUpdateIn != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(InvsContainerTypeUpdateIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeObjectData that results from the InvsContainerTypeUpdateRequest call
 * @return InvsContainerTypeObjectData resulting from udt call
 *
 */

  public InvsContainerTypeObjectData getOutput() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
}
