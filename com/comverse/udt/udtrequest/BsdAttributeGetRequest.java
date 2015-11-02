/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeGetRequest.java
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
 * Class used to create a BsdAttributeGetRequest Udt Request
 *
 */

public class BsdAttributeGetRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeGetRequest
 * @param id Unique request name
 * @param bsdAttributeGetIn BsdAttributeObjectKeyData for BsdAttributeGetRequest
 *
 */
@JsonCreator
  public BsdAttributeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttribute")BsdAttributeObjectKeyData bsdAttributeGetIn) {
    super(id, "BsdAttributeGet");
    if (bsdAttributeGetIn != null) {
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(bsdAttributeGetIn, new HashMap(), "BsdAttributeObjectKeyData").get("BsdAttributeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeObjectData that results from the BsdAttributeGetRequest call
 * @return BsdAttributeObjectData resulting from udt call
 *
 */

  public BsdAttributeObjectData getOutput() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
}
