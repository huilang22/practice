/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationUpdateRequest.java
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
 * Class used to create a BsdApplicationUpdateRequest Udt Request
 *
 */

public class BsdApplicationUpdateRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationUpdateRequest
 * @param id Unique request name
 * @param bsdApplicationUpdateIn BsdApplicationObjectData for BsdApplicationUpdateRequest
 *
 */
@JsonCreator
  public BsdApplicationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplication")BsdApplicationObjectData bsdApplicationUpdateIn) {
    super(id, "BsdApplicationUpdate");
    if (bsdApplicationUpdateIn != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(bsdApplicationUpdateIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationObjectData that results from the BsdApplicationUpdateRequest call
 * @return BsdApplicationObjectData resulting from udt call
 *
 */

  public BsdApplicationObjectData getOutput() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
}
