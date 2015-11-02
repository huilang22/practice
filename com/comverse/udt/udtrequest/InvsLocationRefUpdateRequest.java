/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefUpdateRequest.java
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
 * Class used to create a InvsLocationRefUpdateRequest Udt Request
 *
 */

public class InvsLocationRefUpdateRequest extends InvsLocationRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationRefUpdateRequest
 * @param id Unique request name
 * @param InvsLocationRefUpdateIn InvsLocationRefObjectData for InvsLocationRefUpdateRequest
 *
 */
@JsonCreator
  public InvsLocationRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationRef")InvsLocationRefObjectData InvsLocationRefUpdateIn) {
    super(id, "InvsLocationRefUpdate");
    if (InvsLocationRefUpdateIn != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(InvsLocationRefUpdateIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }

/**
 *
 * Retrieves the InvsLocationRefObjectData that results from the InvsLocationRefUpdateRequest call
 * @return InvsLocationRefObjectData resulting from udt call
 *
 */

  public InvsLocationRefObjectData getOutput() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
}
