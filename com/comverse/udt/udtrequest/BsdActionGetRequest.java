/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionGetRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdActionGetRequest Udt Request
 *
 */

public class BsdActionGetRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a  BsdActionGetRequest
 * @param id Unique request name
 * @param bsdActionGetIn BsdActionObjectKeyData for BsdActionGetRequest
 *
 */
@JsonCreator
  public BsdActionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAction")BsdActionObjectKeyData bsdActionGetIn) {
    super(id, "BsdActionGet");
    if (bsdActionGetIn != null) {
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(bsdActionGetIn, new HashMap(), "BsdActionObjectKeyData").get("BsdActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdActionObjectData that results from the BsdActionGetRequest call
 * @return BsdActionObjectData resulting from udt call
 *
 */

  public BsdActionObjectData getOutput() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
}
