/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeGetRequest.java
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
 * Class used to create a GenderTypeGetRequest Udt Request
 *
 */

public class GenderTypeGetRequest extends GenderTypeSubRequestParent {
/**
 *
 * Constructor to create a  GenderTypeGetRequest
 * @param id Unique request name
 * @param GGetIn GenderTypeObjectKeyData for GenderTypeGetRequest
 *
 */
@JsonCreator
  public GenderTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenderType")GenderTypeObjectKeyData GGetIn) {
    super(id, "GenderTypeGet");
    if (GGetIn != null) {
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(GGetIn, new HashMap(), "GenderTypeObjectKeyData").get("GenderTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GenderTypeObjectData that results from the GenderTypeGetRequest call
 * @return GenderTypeObjectData resulting from udt call
 *
 */

  public GenderTypeObjectData getOutput() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
}
