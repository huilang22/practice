/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeCreateRequest.java
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
 * Class used to create a GenderTypeCreateRequest Udt Request
 *
 */

public class GenderTypeCreateRequest extends GenderTypeSubRequestParent {
/**
 *
 * Constructor to create a  GenderTypeCreateRequest
 * @param id Unique request name
 * @param GCreateIn GenderTypeObjectData for GenderTypeCreateRequest
 *
 */
@JsonCreator
  public GenderTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenderType")GenderTypeObjectData GCreateIn) {
    super(id, "GenderTypeCreate");
    if (GCreateIn != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(GCreateIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }

/**
 *
 * Retrieves the GenderTypeObjectData that results from the GenderTypeCreateRequest call
 * @return GenderTypeObjectData resulting from udt call
 *
 */

  public GenderTypeObjectData getOutput() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
}
