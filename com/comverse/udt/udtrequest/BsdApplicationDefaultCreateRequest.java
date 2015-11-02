/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultCreateRequest.java
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
 * Class used to create a BsdApplicationDefaultCreateRequest Udt Request
 *
 */

public class BsdApplicationDefaultCreateRequest extends BsdApplicationDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationDefaultCreateRequest
 * @param id Unique request name
 * @param bsdApplicationDefaultCreateIn BsdApplicationDefaultObjectData for BsdApplicationDefaultCreateRequest
 *
 */
@JsonCreator
  public BsdApplicationDefaultCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationDefault")BsdApplicationDefaultObjectData bsdApplicationDefaultCreateIn) {
    super(id, "BsdApplicationDefaultCreate");
    if (bsdApplicationDefaultCreateIn != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(bsdApplicationDefaultCreateIn, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationDefaultObjectData that results from the BsdApplicationDefaultCreateRequest call
 * @return BsdApplicationDefaultObjectData resulting from udt call
 *
 */

  public BsdApplicationDefaultObjectData getOutput() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
}
