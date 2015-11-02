/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitUpdateRequest.java
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
 * Class used to create a BsdBusinessUnitUpdateRequest Udt Request
 *
 */

public class BsdBusinessUnitUpdateRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a  BsdBusinessUnitUpdateRequest
 * @param id Unique request name
 * @param bsdBusinessUnitUpdateIn BsdBusinessUnitObjectData for BsdBusinessUnitUpdateRequest
 *
 */
@JsonCreator
  public BsdBusinessUnitUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdBusinessUnit")BsdBusinessUnitObjectData bsdBusinessUnitUpdateIn) {
    super(id, "BsdBusinessUnitUpdate");
    if (bsdBusinessUnitUpdateIn != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(bsdBusinessUnitUpdateIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }

/**
 *
 * Retrieves the BsdBusinessUnitObjectData that results from the BsdBusinessUnitUpdateRequest call
 * @return BsdBusinessUnitObjectData resulting from udt call
 *
 */

  public BsdBusinessUnitObjectData getOutput() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
