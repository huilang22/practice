/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeUpdateRequest.java
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
 * Class used to create a MktCodeUpdateRequest Udt Request
 *
 */

public class MktCodeUpdateRequest extends MktCodeSubRequestParent {
/**
 *
 * Constructor to create a  MktCodeUpdateRequest
 * @param id Unique request name
 * @param MCUpdateIn MCObjectData for MktCodeUpdateRequest
 *
 */
@JsonCreator
  public MktCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("MktCode")MCObjectData MCUpdateIn) {
    super(id, "MktCodeUpdate");
    if (MCUpdateIn != null) {
      addInput("MktCode", MCObjectHelper.toMap(MCUpdateIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }

/**
 *
 * Retrieves the MCObjectData that results from the MktCodeUpdateRequest call
 * @return MCObjectData resulting from udt call
 *
 */

  public MCObjectData getOutput() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
}
