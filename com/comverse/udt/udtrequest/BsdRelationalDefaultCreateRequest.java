/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultCreateRequest.java
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
 * Class used to create a BsdRelationalDefaultCreateRequest Udt Request
 *
 */

public class BsdRelationalDefaultCreateRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalDefaultCreateRequest
 * @param id Unique request name
 * @param bsdRelationalDefaultCreateIn BsdRelationalDefaultObjectBaseData for BsdRelationalDefaultCreateRequest
 *
 */
@JsonCreator
  public BsdRelationalDefaultCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalDefault")BsdRelationalDefaultObjectBaseData bsdRelationalDefaultCreateIn) {
    super(id, "BsdRelationalDefaultCreate");
    if (bsdRelationalDefaultCreateIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(bsdRelationalDefaultCreateIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalDefaultObjectBaseData that results from the BsdRelationalDefaultCreateRequest call
 * @return BsdRelationalDefaultObjectBaseData resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectBaseData getOutput() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
