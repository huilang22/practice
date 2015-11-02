/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeGetRequest.java
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
 * Class used to create a BsdObjectAttributeGetRequest Udt Request
 *
 */

public class BsdObjectAttributeGetRequest extends BsdObjectAttributeSubRequestParent {
/**
 *
 * Constructor to create a  BsdObjectAttributeGetRequest
 * @param id Unique request name
 * @param bsdObjectAttributeGetIn BsdObjectAttributeObjectBaseKeyData for BsdObjectAttributeGetRequest
 *
 */
@JsonCreator
  public BsdObjectAttributeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdObjectAttribute")BsdObjectAttributeObjectBaseKeyData bsdObjectAttributeGetIn) {
    super(id, "BsdObjectAttributeGet");
    if (bsdObjectAttributeGetIn != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseKeyHelper.toMap(bsdObjectAttributeGetIn, new HashMap(), "BsdObjectAttributeObjectBaseKeyData").get("BsdObjectAttributeObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdObjectAttributeObjectData that results from the BsdObjectAttributeGetRequest call
 * @return BsdObjectAttributeObjectData resulting from udt call
 *
 */

  public BsdObjectAttributeObjectData getOutput() {
    return BsdObjectAttributeObjectHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
}
