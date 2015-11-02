/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassUpdateRequest.java
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
 * Class used to create a PointClassUpdateRequest Udt Request
 *
 */

public class PointClassUpdateRequest extends PointClassSubRequestParent {
/**
 *
 * Constructor to create a  PointClassUpdateRequest
 * @param id Unique request name
 * @param PCUpdateIn PointClassObjectData for PointClassUpdateRequest
 *
 */
@JsonCreator
  public PointClassUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointClass")PointClassObjectData PCUpdateIn) {
    super(id, "PointClassUpdate");
    if (PCUpdateIn != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(PCUpdateIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }

/**
 *
 * Retrieves the PointClassObjectData that results from the PointClassUpdateRequest call
 * @return PointClassObjectData resulting from udt call
 *
 */

  public PointClassObjectData getOutput() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
}
