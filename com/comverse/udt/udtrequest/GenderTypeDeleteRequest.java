/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeDeleteRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GenderTypeDeleteRequest Udt Request
 *
 */

public class GenderTypeDeleteRequest extends GenderTypeSubRequestParent {
/**
 *
 * Constructor to create a  GenderTypeDeleteRequest
 * @param id Unique request name
 * @param GDeleteIn GenderTypeObjectKeyData for GenderTypeDeleteRequest
 *
 */
@JsonCreator
  public GenderTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenderType")GenderTypeObjectKeyData GDeleteIn) {
    super(id, "GenderTypeDelete");
    if (GDeleteIn != null) {
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(GDeleteIn, new HashMap(), "GenderTypeObjectKeyData").get("GenderTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GenderTypeObjectData that results from the GenderTypeDeleteRequest call
 * @return GenderTypeObjectData resulting from udt call
 *
 */

  public GenderTypeObjectData getOutput() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
}
