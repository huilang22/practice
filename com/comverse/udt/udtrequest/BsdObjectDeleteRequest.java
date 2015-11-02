/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectDeleteRequest.java
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
 * Class used to create a BsdObjectDeleteRequest Udt Request
 *
 */

public class BsdObjectDeleteRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectDeleteRequest
 * @param id Unique request name
 * @param bsdObjectDeleteIn BsdObjectObjectKeyData for BsdObjectDeleteRequest
 *
 */
@JsonCreator
  public BsdObjectDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObject")BsdObjectObjectKeyData bsdObjectDeleteIn) {
    super(id, "BsdObjectDelete");
    if (bsdObjectDeleteIn != null) {
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(bsdObjectDeleteIn, new HashMap(), "BsdObjectObjectKeyData").get("BsdObjectObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdObjectObjectData that results from the BsdObjectDeleteRequest call
 * @return BsdObjectObjectData resulting from udt call
 *
 */

  public BsdObjectObjectData getOutput() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
}
