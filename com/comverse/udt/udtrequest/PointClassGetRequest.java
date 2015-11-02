/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassGetRequest.java
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
 * Class used to create a PointClassGetRequest Udt Request
 *
 */

public class PointClassGetRequest extends PointClassSubRequestParent {
/**
 *
 * Constructor to create a  PointClassGetRequest
 * @param id Unique request name
 * @param PCGetIn PointClassObjectKeyData for PointClassGetRequest
 *
 */
@JsonCreator
  public PointClassGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointClass")PointClassObjectKeyData PCGetIn) {
    super(id, "PointClassGet");
    if (PCGetIn != null) {
      addInput("PointClass", PointClassObjectKeyHelper.toMap(PCGetIn, new HashMap(), "PointClassObjectKeyData").get("PointClassObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PointClassObjectData that results from the PointClassGetRequest call
 * @return PointClassObjectData resulting from udt call
 *
 */

  public PointClassObjectData getOutput() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
}
