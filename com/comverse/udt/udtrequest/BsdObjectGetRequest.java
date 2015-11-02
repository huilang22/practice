/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectGetRequest.java
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
 * Class used to create a BsdObjectGetRequest Udt Request
 *
 */

public class BsdObjectGetRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectGetRequest
 * @param id Unique request name
 * @param bsdObjectGetIn BsdObjectObjectKeyData for BsdObjectGetRequest
 *
 */
@JsonCreator
  public BsdObjectGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObject")BsdObjectObjectKeyData bsdObjectGetIn) {
    super(id, "BsdObjectGet");
    if (bsdObjectGetIn != null) {
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(bsdObjectGetIn, new HashMap(), "BsdObjectObjectKeyData").get("BsdObjectObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdObjectObjectData that results from the BsdObjectGetRequest call
 * @return BsdObjectObjectData resulting from udt call
 *
 */

  public BsdObjectObjectData getOutput() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
}
