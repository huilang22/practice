/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideDeleteRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillModeOverrideDeleteRequest Udt Request
 *
 */

public class BillModeOverrideDeleteRequest extends BillModeOverrideSubRequestParent {
/**
 *
 * Constructor to create a  BillModeOverrideDeleteRequest
 * @param id Unique request name
 * @param BMODeleteIn BMOObjectKeyData for BillModeOverrideDeleteRequest
 *
 */
@JsonCreator
  public BillModeOverrideDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillModeOverride")BMOObjectKeyData BMODeleteIn) {
    super(id, "BillModeOverrideDelete");
    if (BMODeleteIn != null) {
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(BMODeleteIn, new HashMap(), "BMOObjectKeyData").get("BMOObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BMOObjectData that results from the BillModeOverrideDeleteRequest call
 * @return BMOObjectData resulting from udt call
 *
 */

  public BMOObjectData getOutput() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
}
