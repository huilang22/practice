/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultGetRequest.java
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
 * Class used to create a BsdApplicationDefaultGetRequest Udt Request
 *
 */

public class BsdApplicationDefaultGetRequest extends BsdApplicationDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationDefaultGetRequest
 * @param id Unique request name
 * @param bsdApplicationDefaultGetIn BsdApplicationDefaultObjectKeyData for BsdApplicationDefaultGetRequest
 *
 */
@JsonCreator
  public BsdApplicationDefaultGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationDefault")BsdApplicationDefaultObjectKeyData bsdApplicationDefaultGetIn) {
    super(id, "BsdApplicationDefaultGet");
    if (bsdApplicationDefaultGetIn != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(bsdApplicationDefaultGetIn, new HashMap(), "BsdApplicationDefaultObjectKeyData").get("BsdApplicationDefaultObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationDefaultObjectData that results from the BsdApplicationDefaultGetRequest call
 * @return BsdApplicationDefaultObjectData resulting from udt call
 *
 */

  public BsdApplicationDefaultObjectData getOutput() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
}
