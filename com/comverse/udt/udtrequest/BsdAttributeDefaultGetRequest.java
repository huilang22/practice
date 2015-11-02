/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultGetRequest.java
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
 * Class used to create a BsdAttributeDefaultGetRequest Udt Request
 *
 */

public class BsdAttributeDefaultGetRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeDefaultGetRequest
 * @param id Unique request name
 * @param bsdAttributeDefaultGetIn BsdAttributeDefaultObjectBaseKeyData for BsdAttributeDefaultGetRequest
 *
 */
@JsonCreator
  public BsdAttributeDefaultGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeDefault")BsdAttributeDefaultObjectBaseKeyData bsdAttributeDefaultGetIn) {
    super(id, "BsdAttributeDefaultGet");
    if (bsdAttributeDefaultGetIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(bsdAttributeDefaultGetIn, new HashMap(), "BsdAttributeDefaultObjectBaseKeyData").get("BsdAttributeDefaultObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeDefaultObjectData that results from the BsdAttributeDefaultGetRequest call
 * @return BsdAttributeDefaultObjectData resulting from udt call
 *
 */

  public BsdAttributeDefaultObjectData getOutput() {
    return BsdAttributeDefaultObjectHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
