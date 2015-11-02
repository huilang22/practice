/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatCreateRequest.java
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
 * Class used to create a CtcItemFormatCreateRequest Udt Request
 *
 */

public class CtcItemFormatCreateRequest extends CtcItemFormatSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemFormatCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcItemFormatObjectData for CtcItemFormatCreateRequest
 *
 */
@JsonCreator
  public CtcItemFormatCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemFormat")CtcItemFormatObjectData CreateIn) {
    super(id, "CtcItemFormatCreate");
    if (CreateIn != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }

/**
 *
 * Retrieves the CtcItemFormatObjectData that results from the CtcItemFormatCreateRequest call
 * @return CtcItemFormatObjectData resulting from udt call
 *
 */

  public CtcItemFormatObjectData getOutput() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
}
