/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefCreateRequest.java
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
 * Class used to create a InvsLocationRefCreateRequest Udt Request
 *
 */

public class InvsLocationRefCreateRequest extends InvsLocationRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationRefCreateRequest
 * @param id Unique request name
 * @param InvsLocationRefCreateIn InvsLocationRefObjectData for InvsLocationRefCreateRequest
 *
 */
@JsonCreator
  public InvsLocationRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationRef")InvsLocationRefObjectData InvsLocationRefCreateIn) {
    super(id, "InvsLocationRefCreate");
    if (InvsLocationRefCreateIn != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(InvsLocationRefCreateIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }

/**
 *
 * Retrieves the InvsLocationRefObjectData that results from the InvsLocationRefCreateRequest call
 * @return InvsLocationRefObjectData resulting from udt call
 *
 */

  public InvsLocationRefObjectData getOutput() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
}
