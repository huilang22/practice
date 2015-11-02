/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectUpdateRequest.java
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
 * Class used to create a BsdObjectUpdateRequest Udt Request
 *
 */

public class BsdObjectUpdateRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectUpdateRequest
 * @param id Unique request name
 * @param bsdObjectUpdateIn BsdObjectObjectData for BsdObjectUpdateRequest
 *
 */
@JsonCreator
  public BsdObjectUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObject")BsdObjectObjectData bsdObjectUpdateIn) {
    super(id, "BsdObjectUpdate");
    if (bsdObjectUpdateIn != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(bsdObjectUpdateIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }

/**
 *
 * Retrieves the BsdObjectObjectData that results from the BsdObjectUpdateRequest call
 * @return BsdObjectObjectData resulting from udt call
 *
 */

  public BsdObjectObjectData getOutput() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
}
