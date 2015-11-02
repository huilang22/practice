/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionDeleteRequest.java
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
 * Class used to create a BsdActionDeleteRequest Udt Request
 *
 */

public class BsdActionDeleteRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a  BsdActionDeleteRequest
 * @param id Unique request name
 * @param bsdActionDeleteIn BsdActionObjectKeyData for BsdActionDeleteRequest
 *
 */
@JsonCreator
  public BsdActionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAction")BsdActionObjectKeyData bsdActionDeleteIn) {
    super(id, "BsdActionDelete");
    if (bsdActionDeleteIn != null) {
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(bsdActionDeleteIn, new HashMap(), "BsdActionObjectKeyData").get("BsdActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdActionObjectData that results from the BsdActionDeleteRequest call
 * @return BsdActionObjectData resulting from udt call
 *
 */

  public BsdActionObjectData getOutput() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
}
