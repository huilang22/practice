/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessRefGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a LineOfBusinessRefGetRequest Udt Request
 *
 */

public class LineOfBusinessRefGetRequest extends LineOfBusinessRefSubRequestParent {
/**
 *
 * Constructor to create a  LineOfBusinessRefGetRequest
 * @param id Unique request name
 * @param LineOfBusinessRefGetIn LineOfBusinessRefObjectKeyData for LineOfBusinessRefGetRequest
 *
 */
@JsonCreator
  public LineOfBusinessRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LineOfBusinessRef")LineOfBusinessRefObjectKeyData LineOfBusinessRefGetIn) {
    super(id, "LineOfBusinessRefGet");
    if (LineOfBusinessRefGetIn != null) {
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectKeyHelper.toMap(LineOfBusinessRefGetIn, new HashMap(), "LineOfBusinessRefObjectKeyData").get("LineOfBusinessRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LineOfBusinessRefObjectData that results from the LineOfBusinessRefGetRequest call
 * @return LineOfBusinessRefObjectData resulting from udt call
 *
 */

  public LineOfBusinessRefObjectData getOutput() {
    return LineOfBusinessRefObjectHelper.fromMap(outputMap, "LineOfBusinessRef");
  }
}
