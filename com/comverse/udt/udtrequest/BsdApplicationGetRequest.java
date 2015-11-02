/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationGetRequest.java
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
 * Class used to create a BsdApplicationGetRequest Udt Request
 *
 */

public class BsdApplicationGetRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationGetRequest
 * @param id Unique request name
 * @param bsdApplicationGetIn BsdApplicationObjectKeyData for BsdApplicationGetRequest
 *
 */
@JsonCreator
  public BsdApplicationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplication")BsdApplicationObjectKeyData bsdApplicationGetIn) {
    super(id, "BsdApplicationGet");
    if (bsdApplicationGetIn != null) {
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(bsdApplicationGetIn, new HashMap(), "BsdApplicationObjectKeyData").get("BsdApplicationObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationObjectData that results from the BsdApplicationGetRequest call
 * @return BsdApplicationObjectData resulting from udt call
 *
 */

  public BsdApplicationObjectData getOutput() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
}
