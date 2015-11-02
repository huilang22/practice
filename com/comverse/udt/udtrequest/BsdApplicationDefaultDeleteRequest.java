/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultDeleteRequest.java
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
 * Class used to create a BsdApplicationDefaultDeleteRequest Udt Request
 *
 */

public class BsdApplicationDefaultDeleteRequest extends BsdApplicationDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationDefaultDeleteRequest
 * @param id Unique request name
 * @param bsdApplicationDefaultDeleteIn BsdApplicationDefaultObjectKeyData for BsdApplicationDefaultDeleteRequest
 *
 */
@JsonCreator
  public BsdApplicationDefaultDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationDefault")BsdApplicationDefaultObjectKeyData bsdApplicationDefaultDeleteIn) {
    super(id, "BsdApplicationDefaultDelete");
    if (bsdApplicationDefaultDeleteIn != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectKeyHelper.toMap(bsdApplicationDefaultDeleteIn, new HashMap(), "BsdApplicationDefaultObjectKeyData").get("BsdApplicationDefaultObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationDefaultObjectData that results from the BsdApplicationDefaultDeleteRequest call
 * @return BsdApplicationDefaultObjectData resulting from udt call
 *
 */

  public BsdApplicationDefaultObjectData getOutput() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
}
