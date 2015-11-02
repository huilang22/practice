/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultGetRequest.java
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
 * Class used to create a BsdApplicationAttributeDefaultGetRequest Udt Request
 *
 */

public class BsdApplicationAttributeDefaultGetRequest extends BsdApplicationAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationAttributeDefaultGetRequest
 * @param id Unique request name
 * @param bsdApplicationAttributeDefaultGetIn BsdApplicationAttributeDefaultObjectKeyData for BsdApplicationAttributeDefaultGetRequest
 *
 */
@JsonCreator
  public BsdApplicationAttributeDefaultGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationAttributeDefault")BsdApplicationAttributeDefaultObjectKeyData bsdApplicationAttributeDefaultGetIn) {
    super(id, "BsdApplicationAttributeDefaultGet");
    if (bsdApplicationAttributeDefaultGetIn != null) {
      addInput("BsdApplicationAttributeDefault", BsdApplicationAttributeDefaultObjectKeyHelper.toMap(bsdApplicationAttributeDefaultGetIn, new HashMap(), "BsdApplicationAttributeDefaultObjectKeyData").get("BsdApplicationAttributeDefaultObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationAttributeDefaultObjectData that results from the BsdApplicationAttributeDefaultGetRequest call
 * @return BsdApplicationAttributeDefaultObjectData resulting from udt call
 *
 */

  public BsdApplicationAttributeDefaultObjectData getOutput() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMap(outputMap, "BsdApplicationAttributeDefault");
  }
}
