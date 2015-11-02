/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideCreateRequest.java
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
 * Class used to create a BillModeOverrideCreateRequest Udt Request
 *
 */

public class BillModeOverrideCreateRequest extends BillModeOverrideSubRequestParent {
/**
 *
 * Constructor to create a  BillModeOverrideCreateRequest
 * @param id Unique request name
 * @param BMOCreateIn BMOObjectData for BillModeOverrideCreateRequest
 *
 */
@JsonCreator
  public BillModeOverrideCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillModeOverride")BMOObjectData BMOCreateIn) {
    super(id, "BillModeOverrideCreate");
    if (BMOCreateIn != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(BMOCreateIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }

/**
 *
 * Retrieves the BMOObjectData that results from the BillModeOverrideCreateRequest call
 * @return BMOObjectData resulting from udt call
 *
 */

  public BMOObjectData getOutput() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
}
