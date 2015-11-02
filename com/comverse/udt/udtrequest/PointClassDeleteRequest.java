/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassDeleteRequest.java
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
 * Class used to create a PointClassDeleteRequest Udt Request
 *
 */

public class PointClassDeleteRequest extends PointClassSubRequestParent {
/**
 *
 * Constructor to create a  PointClassDeleteRequest
 * @param id Unique request name
 * @param PCDeleteIn PointClassObjectKeyData for PointClassDeleteRequest
 *
 */
@JsonCreator
  public PointClassDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointClass")PointClassObjectKeyData PCDeleteIn) {
    super(id, "PointClassDelete");
    if (PCDeleteIn != null) {
      addInput("PointClass", PointClassObjectKeyHelper.toMap(PCDeleteIn, new HashMap(), "PointClassObjectKeyData").get("PointClassObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PointClassObjectData that results from the PointClassDeleteRequest call
 * @return PointClassObjectData resulting from udt call
 *
 */

  public PointClassObjectData getOutput() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
}
