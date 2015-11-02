/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideGetRequest.java
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
 * Class used to create a BillModeOverrideGetRequest Udt Request
 *
 */

public class BillModeOverrideGetRequest extends BillModeOverrideSubRequestParent {
/**
 *
 * Constructor to create a  BillModeOverrideGetRequest
 * @param id Unique request name
 * @param BMOGetIn BMOObjectKeyData for BillModeOverrideGetRequest
 *
 */
@JsonCreator
  public BillModeOverrideGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillModeOverride")BMOObjectKeyData BMOGetIn) {
    super(id, "BillModeOverrideGet");
    if (BMOGetIn != null) {
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(BMOGetIn, new HashMap(), "BMOObjectKeyData").get("BMOObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BMOObjectData that results from the BillModeOverrideGetRequest call
 * @return BMOObjectData resulting from udt call
 *
 */

  public BMOObjectData getOutput() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
}
