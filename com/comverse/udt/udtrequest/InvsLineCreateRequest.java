/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineCreateRequest.java
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
 * Class used to create a InvsLineCreateRequest Udt Request
 *
 */

public class InvsLineCreateRequest extends InvsLineSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineCreateRequest
 * @param id Unique request name
 * @param InvsLineCreateIn InvsLineObjectData for InvsLineCreateRequest
 *
 */
@JsonCreator
  public InvsLineCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLine")InvsLineObjectData InvsLineCreateIn) {
    super(id, "InvsLineCreate");
    if (InvsLineCreateIn != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(InvsLineCreateIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }

/**
 *
 * Retrieves the InvsLineObjectData that results from the InvsLineCreateRequest call
 * @return InvsLineObjectData resulting from udt call
 *
 */

  public InvsLineObjectData getOutput() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
}
