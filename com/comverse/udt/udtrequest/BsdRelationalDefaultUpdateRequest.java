/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultUpdateRequest.java
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
 * Class used to create a BsdRelationalDefaultUpdateRequest Udt Request
 *
 */

public class BsdRelationalDefaultUpdateRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalDefaultUpdateRequest
 * @param id Unique request name
 * @param bsdRelationalDefaultUpdateIn BsdRelationalDefaultObjectBaseData for BsdRelationalDefaultUpdateRequest
 *
 */
@JsonCreator
  public BsdRelationalDefaultUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalDefault")BsdRelationalDefaultObjectBaseData bsdRelationalDefaultUpdateIn) {
    super(id, "BsdRelationalDefaultUpdate");
    if (bsdRelationalDefaultUpdateIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(bsdRelationalDefaultUpdateIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalDefaultObjectBaseData that results from the BsdRelationalDefaultUpdateRequest call
 * @return BsdRelationalDefaultObjectBaseData resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectBaseData getOutput() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
