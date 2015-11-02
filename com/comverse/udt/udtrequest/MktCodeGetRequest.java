/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeGetRequest.java
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
 * Class used to create a MktCodeGetRequest Udt Request
 *
 */

public class MktCodeGetRequest extends MktCodeSubRequestParent {
/**
 *
 * Constructor to create a  MktCodeGetRequest
 * @param id Unique request name
 * @param MCGetIn MCObjectKeyData for MktCodeGetRequest
 *
 */
@JsonCreator
  public MktCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("MktCode")MCObjectKeyData MCGetIn) {
    super(id, "MktCodeGet");
    if (MCGetIn != null) {
      addInput("MktCode", MCObjectKeyHelper.toMap(MCGetIn, new HashMap(), "MCObjectKeyData").get("MCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the MCObjectData that results from the MktCodeGetRequest call
 * @return MCObjectData resulting from udt call
 *
 */

  public MCObjectData getOutput() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
}
