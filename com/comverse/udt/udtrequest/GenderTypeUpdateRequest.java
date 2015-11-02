/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeUpdateRequest.java
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
 * Class used to create a GenderTypeUpdateRequest Udt Request
 *
 */

public class GenderTypeUpdateRequest extends GenderTypeSubRequestParent {
/**
 *
 * Constructor to create a  GenderTypeUpdateRequest
 * @param id Unique request name
 * @param GUpdateIn GenderTypeObjectData for GenderTypeUpdateRequest
 *
 */
@JsonCreator
  public GenderTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenderType")GenderTypeObjectData GUpdateIn) {
    super(id, "GenderTypeUpdate");
    if (GUpdateIn != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(GUpdateIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }

/**
 *
 * Retrieves the GenderTypeObjectData that results from the GenderTypeUpdateRequest call
 * @return GenderTypeObjectData resulting from udt call
 *
 */

  public GenderTypeObjectData getOutput() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
}
