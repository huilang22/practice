/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitGetRequest.java
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
 * Class used to create a BsdBusinessUnitGetRequest Udt Request
 *
 */

public class BsdBusinessUnitGetRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a  BsdBusinessUnitGetRequest
 * @param id Unique request name
 * @param bsdBusinessUnitGetIn BsdBusinessUnitObjectKeyData for BsdBusinessUnitGetRequest
 *
 */
@JsonCreator
  public BsdBusinessUnitGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdBusinessUnit")BsdBusinessUnitObjectKeyData bsdBusinessUnitGetIn) {
    super(id, "BsdBusinessUnitGet");
    if (bsdBusinessUnitGetIn != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(bsdBusinessUnitGetIn, new HashMap(), "BsdBusinessUnitObjectKeyData").get("BsdBusinessUnitObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdBusinessUnitObjectData that results from the BsdBusinessUnitGetRequest call
 * @return BsdBusinessUnitObjectData resulting from udt call
 *
 */

  public BsdBusinessUnitObjectData getOutput() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
