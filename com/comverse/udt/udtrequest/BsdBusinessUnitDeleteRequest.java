/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitDeleteRequest.java
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
 * Class used to create a BsdBusinessUnitDeleteRequest Udt Request
 *
 */

public class BsdBusinessUnitDeleteRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a  BsdBusinessUnitDeleteRequest
 * @param id Unique request name
 * @param bsdBusinessUnitDeleteIn BsdBusinessUnitObjectKeyData for BsdBusinessUnitDeleteRequest
 *
 */
@JsonCreator
  public BsdBusinessUnitDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdBusinessUnit")BsdBusinessUnitObjectKeyData bsdBusinessUnitDeleteIn) {
    super(id, "BsdBusinessUnitDelete");
    if (bsdBusinessUnitDeleteIn != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(bsdBusinessUnitDeleteIn, new HashMap(), "BsdBusinessUnitObjectKeyData").get("BsdBusinessUnitObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdBusinessUnitObjectData that results from the BsdBusinessUnitDeleteRequest call
 * @return BsdBusinessUnitObjectData resulting from udt call
 *
 */

  public BsdBusinessUnitObjectData getOutput() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
