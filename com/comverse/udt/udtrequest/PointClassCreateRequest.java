/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassCreateRequest.java
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
 * Class used to create a PointClassCreateRequest Udt Request
 *
 */

public class PointClassCreateRequest extends PointClassSubRequestParent {
/**
 *
 * Constructor to create a  PointClassCreateRequest
 * @param id Unique request name
 * @param PCCreateIn PointClassObjectData for PointClassCreateRequest
 *
 */
@JsonCreator
  public PointClassCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointClass")PointClassObjectData PCCreateIn) {
    super(id, "PointClassCreate");
    if (PCCreateIn != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(PCCreateIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }

/**
 *
 * Retrieves the PointClassObjectData that results from the PointClassCreateRequest call
 * @return PointClassObjectData resulting from udt call
 *
 */

  public PointClassObjectData getOutput() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
}
