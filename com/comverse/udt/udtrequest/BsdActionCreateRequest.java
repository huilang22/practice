/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionCreateRequest.java
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
 * Class used to create a BsdActionCreateRequest Udt Request
 *
 */

public class BsdActionCreateRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a  BsdActionCreateRequest
 * @param id Unique request name
 * @param bsdActionCreateIn BsdActionObjectData for BsdActionCreateRequest
 *
 */
@JsonCreator
  public BsdActionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAction")BsdActionObjectData bsdActionCreateIn) {
    super(id, "BsdActionCreate");
    if (bsdActionCreateIn != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(bsdActionCreateIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }

/**
 *
 * Retrieves the BsdActionObjectData that results from the BsdActionCreateRequest call
 * @return BsdActionObjectData resulting from udt call
 *
 */

  public BsdActionObjectData getOutput() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
}
