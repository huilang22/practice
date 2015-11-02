/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultGetRequest.java
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
 * Class used to create a BsdRelationalDefaultGetRequest Udt Request
 *
 */

public class BsdRelationalDefaultGetRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalDefaultGetRequest
 * @param id Unique request name
 * @param bsdRelationalDefaultGetIn BsdRelationalDefaultObjectBaseKeyData for BsdRelationalDefaultGetRequest
 *
 */
@JsonCreator
  public BsdRelationalDefaultGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalDefault")BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultGetIn) {
    super(id, "BsdRelationalDefaultGet");
    if (bsdRelationalDefaultGetIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(bsdRelationalDefaultGetIn, new HashMap(), "BsdRelationalDefaultObjectBaseKeyData").get("BsdRelationalDefaultObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalDefaultObjectData that results from the BsdRelationalDefaultGetRequest call
 * @return BsdRelationalDefaultObjectData resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectData getOutput() {
    return BsdRelationalDefaultObjectHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
