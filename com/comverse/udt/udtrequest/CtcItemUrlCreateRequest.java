/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlCreateRequest.java
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
 * Class used to create a CtcItemUrlCreateRequest Udt Request
 *
 */

public class CtcItemUrlCreateRequest extends CtcItemUrlSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemUrlCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcItemUrlObjectData for CtcItemUrlCreateRequest
 *
 */
@JsonCreator
  public CtcItemUrlCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemUrl")CtcItemUrlObjectData CreateIn) {
    super(id, "CtcItemUrlCreate");
    if (CreateIn != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }

/**
 *
 * Retrieves the CtcItemUrlObjectData that results from the CtcItemUrlCreateRequest call
 * @return CtcItemUrlObjectData resulting from udt call
 *
 */

  public CtcItemUrlObjectData getOutput() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
}
