/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesGetRequest.java
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
 * Class used to create a LineOfBusinessValuesGetRequest Udt Request
 *
 */

public class LineOfBusinessValuesGetRequest extends LineOfBusinessValuesSubRequestParent {
/**
 *
 * Constructor to create a  LineOfBusinessValuesGetRequest
 * @param id Unique request name
 * @param LineOfBusinessValuesGetIn LineOfBusinessValuesObjectKeyData for LineOfBusinessValuesGetRequest
 *
 */
@JsonCreator
  public LineOfBusinessValuesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LineOfBusinessValues")LineOfBusinessValuesObjectKeyData LineOfBusinessValuesGetIn) {
    super(id, "LineOfBusinessValuesGet");
    if (LineOfBusinessValuesGetIn != null) {
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectKeyHelper.toMap(LineOfBusinessValuesGetIn, new HashMap(), "LineOfBusinessValuesObjectKeyData").get("LineOfBusinessValuesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LineOfBusinessValuesObjectData that results from the LineOfBusinessValuesGetRequest call
 * @return LineOfBusinessValuesObjectData resulting from udt call
 *
 */

  public LineOfBusinessValuesObjectData getOutput() {
    return LineOfBusinessValuesObjectHelper.fromMap(outputMap, "LineOfBusinessValues");
  }
}
