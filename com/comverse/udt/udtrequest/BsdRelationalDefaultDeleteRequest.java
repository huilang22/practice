/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultDeleteRequest.java
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
 * Class used to create a BsdRelationalDefaultDeleteRequest Udt Request
 *
 */

public class BsdRelationalDefaultDeleteRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalDefaultDeleteRequest
 * @param id Unique request name
 * @param bsdRelationalDefaultDeleteIn BsdRelationalDefaultObjectBaseKeyData for BsdRelationalDefaultDeleteRequest
 *
 */
@JsonCreator
  public BsdRelationalDefaultDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalDefault")BsdRelationalDefaultObjectBaseKeyData bsdRelationalDefaultDeleteIn) {
    super(id, "BsdRelationalDefaultDelete");
    if (bsdRelationalDefaultDeleteIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(bsdRelationalDefaultDeleteIn, new HashMap(), "BsdRelationalDefaultObjectBaseKeyData").get("BsdRelationalDefaultObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalDefaultObjectBaseData that results from the BsdRelationalDefaultDeleteRequest call
 * @return BsdRelationalDefaultObjectBaseData resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectBaseData getOutput() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
