/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionUpdateRequest.java
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
 * Class used to create a BsdActionUpdateRequest Udt Request
 *
 */

public class BsdActionUpdateRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a  BsdActionUpdateRequest
 * @param id Unique request name
 * @param bsdActionUpdateIn BsdActionObjectData for BsdActionUpdateRequest
 *
 */
@JsonCreator
  public BsdActionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAction")BsdActionObjectData bsdActionUpdateIn) {
    super(id, "BsdActionUpdate");
    if (bsdActionUpdateIn != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(bsdActionUpdateIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }

/**
 *
 * Retrieves the BsdActionObjectData that results from the BsdActionUpdateRequest call
 * @return BsdActionObjectData resulting from udt call
 *
 */

  public BsdActionObjectData getOutput() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
}
