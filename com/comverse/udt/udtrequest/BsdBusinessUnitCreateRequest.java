/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitCreateRequest.java
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
 * Class used to create a BsdBusinessUnitCreateRequest Udt Request
 *
 */

public class BsdBusinessUnitCreateRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a  BsdBusinessUnitCreateRequest
 * @param id Unique request name
 * @param bsdBusinessUnitCreateIn BsdBusinessUnitObjectData for BsdBusinessUnitCreateRequest
 *
 */
@JsonCreator
  public BsdBusinessUnitCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdBusinessUnit")BsdBusinessUnitObjectData bsdBusinessUnitCreateIn) {
    super(id, "BsdBusinessUnitCreate");
    if (bsdBusinessUnitCreateIn != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(bsdBusinessUnitCreateIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }

/**
 *
 * Retrieves the BsdBusinessUnitObjectData that results from the BsdBusinessUnitCreateRequest call
 * @return BsdBusinessUnitObjectData resulting from udt call
 *
 */

  public BsdBusinessUnitObjectData getOutput() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
