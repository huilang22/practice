/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDeleteRequest.java
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
 * Class used to create a BsdAttributeDeleteRequest Udt Request
 *
 */

public class BsdAttributeDeleteRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeDeleteRequest
 * @param id Unique request name
 * @param bsdAttributeDeleteIn BsdAttributeObjectKeyData for BsdAttributeDeleteRequest
 *
 */
@JsonCreator
  public BsdAttributeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttribute")BsdAttributeObjectKeyData bsdAttributeDeleteIn) {
    super(id, "BsdAttributeDelete");
    if (bsdAttributeDeleteIn != null) {
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(bsdAttributeDeleteIn, new HashMap(), "BsdAttributeObjectKeyData").get("BsdAttributeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeObjectData that results from the BsdAttributeDeleteRequest call
 * @return BsdAttributeObjectData resulting from udt call
 *
 */

  public BsdAttributeObjectData getOutput() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
}
