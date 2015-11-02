/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeCreateRequest.java
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
 * Class used to create a InvsContainerTypeCreateRequest Udt Request
 *
 */

public class InvsContainerTypeCreateRequest extends InvsContainerTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsContainerTypeCreateRequest
 * @param id Unique request name
 * @param InvsContainerTypeCreateIn InvsContainerTypeObjectData for InvsContainerTypeCreateRequest
 *
 */
@JsonCreator
  public InvsContainerTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerType")InvsContainerTypeObjectData InvsContainerTypeCreateIn) {
    super(id, "InvsContainerTypeCreate");
    if (InvsContainerTypeCreateIn != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(InvsContainerTypeCreateIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeObjectData that results from the InvsContainerTypeCreateRequest call
 * @return InvsContainerTypeObjectData resulting from udt call
 *
 */

  public InvsContainerTypeObjectData getOutput() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
}
