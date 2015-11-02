/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectCreateRequest.java
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
 * Class used to create a BsdObjectCreateRequest Udt Request
 *
 */

public class BsdObjectCreateRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectCreateRequest
 * @param id Unique request name
 * @param bsdObjectCreateIn BsdObjectObjectData for BsdObjectCreateRequest
 *
 */
@JsonCreator
  public BsdObjectCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObject")BsdObjectObjectData bsdObjectCreateIn) {
    super(id, "BsdObjectCreate");
    if (bsdObjectCreateIn != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(bsdObjectCreateIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }

/**
 *
 * Retrieves the BsdObjectObjectData that results from the BsdObjectCreateRequest call
 * @return BsdObjectObjectData resulting from udt call
 *
 */

  public BsdObjectObjectData getOutput() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
}
