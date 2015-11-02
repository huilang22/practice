/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalDefaultGetRequest.java
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
 * Class used to create a BsdApplicationRelationalDefaultGetRequest Udt Request
 *
 */

public class BsdApplicationRelationalDefaultGetRequest extends BsdApplicationRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdApplicationRelationalDefaultGetRequest
 * @param id Unique request name
 * @param bsdApplicationRelationalDefaultGetIn BsdApplicationRelationalDefaultObjectKeyData for BsdApplicationRelationalDefaultGetRequest
 *
 */
@JsonCreator
  public BsdApplicationRelationalDefaultGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdApplicationRelationalDefault")BsdApplicationRelationalDefaultObjectKeyData bsdApplicationRelationalDefaultGetIn) {
    super(id, "BsdApplicationRelationalDefaultGet");
    if (bsdApplicationRelationalDefaultGetIn != null) {
      addInput("BsdApplicationRelationalDefault", BsdApplicationRelationalDefaultObjectKeyHelper.toMap(bsdApplicationRelationalDefaultGetIn, new HashMap(), "BsdApplicationRelationalDefaultObjectKeyData").get("BsdApplicationRelationalDefaultObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdApplicationRelationalDefaultObjectData that results from the BsdApplicationRelationalDefaultGetRequest call
 * @return BsdApplicationRelationalDefaultObjectData resulting from udt call
 *
 */

  public BsdApplicationRelationalDefaultObjectData getOutput() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMap(outputMap, "BsdApplicationRelationalDefault");
  }
}
