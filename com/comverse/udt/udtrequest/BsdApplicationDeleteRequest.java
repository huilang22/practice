/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDeleteRequest.java
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
 * Class used to create a BsdApplicationDeleteRequest Udt Request
 *
 */

public class BsdApplicationDeleteRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationDeleteRequest
 * @param id Unique request name
 * @param bsdApplicationDeleteIn BsdApplicationObjectKeyData for BsdApplicationDeleteRequest
 *
 */
@JsonCreator
  public BsdApplicationDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplication")BsdApplicationObjectKeyData bsdApplicationDeleteIn) {
    super(id, "BsdApplicationDelete");
    if (bsdApplicationDeleteIn != null) {
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(bsdApplicationDeleteIn, new HashMap(), "BsdApplicationObjectKeyData").get("BsdApplicationObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationObjectData that results from the BsdApplicationDeleteRequest call
 * @return BsdApplicationObjectData resulting from udt call
 *
 */

  public BsdApplicationObjectData getOutput() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
}
