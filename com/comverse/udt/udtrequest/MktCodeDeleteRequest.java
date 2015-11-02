/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeDeleteRequest.java
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
 * Class used to create a MktCodeDeleteRequest Udt Request
 *
 */

public class MktCodeDeleteRequest extends MktCodeSubRequestParent {
/**
 *
 * Constructor to create a  MktCodeDeleteRequest
 * @param id Unique request name
 * @param MCDeleteIn MCObjectKeyData for MktCodeDeleteRequest
 *
 */
@JsonCreator
  public MktCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("MktCode")MCObjectKeyData MCDeleteIn) {
    super(id, "MktCodeDelete");
    if (MCDeleteIn != null) {
      addInput("MktCode", MCObjectKeyHelper.toMap(MCDeleteIn, new HashMap(), "MCObjectKeyData").get("MCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MCObjectData that results from the MktCodeDeleteRequest call
 * @return MCObjectData resulting from udt call
 *
 */

  public MCObjectData getOutput() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
}
