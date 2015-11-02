/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationCreateRequest.java
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
 * Class used to create a BsdApplicationCreateRequest Udt Request
 *
 */

public class BsdApplicationCreateRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationCreateRequest
 * @param id Unique request name
 * @param bsdApplicationCreateIn BsdApplicationObjectData for BsdApplicationCreateRequest
 *
 */
@JsonCreator
  public BsdApplicationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplication")BsdApplicationObjectData bsdApplicationCreateIn) {
    super(id, "BsdApplicationCreate");
    if (bsdApplicationCreateIn != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(bsdApplicationCreateIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationObjectData that results from the BsdApplicationCreateRequest call
 * @return BsdApplicationObjectData resulting from udt call
 *
 */

  public BsdApplicationObjectData getOutput() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
}
