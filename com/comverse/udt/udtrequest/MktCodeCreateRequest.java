/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeCreateRequest.java
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
 * Class used to create a MktCodeCreateRequest Udt Request
 *
 */

public class MktCodeCreateRequest extends MktCodeSubRequestParent {
/**
 *
 * Constructor to create a  MktCodeCreateRequest
 * @param id Unique request name
 * @param MCCreateIn MCObjectData for MktCodeCreateRequest
 *
 */
@JsonCreator
  public MktCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MktCode")MCObjectData MCCreateIn) {
    super(id, "MktCodeCreate");
    if (MCCreateIn != null) {
      addInput("MktCode", MCObjectHelper.toMap(MCCreateIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }

/**
 *
 * Retrieves the MCObjectData that results from the MktCodeCreateRequest call
 * @return MCObjectData resulting from udt call
 *
 */

  public MCObjectData getOutput() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
}
