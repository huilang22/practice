/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemCreateRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcItemCreateRequest Udt Request
 *
 */

public class CtcItemCreateRequest extends CtcItemSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcItemObjectData for CtcItemCreateRequest
 *
 */
@JsonCreator
  public CtcItemCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItem")CtcItemObjectData CreateIn) {
    super(id, "CtcItemCreate");
    if (CreateIn != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(CreateIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }

/**
 *
 * Retrieves the CtcItemObjectData that results from the CtcItemCreateRequest call
 * @return CtcItemObjectData resulting from udt call
 *
 */

  public CtcItemObjectData getOutput() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
}
