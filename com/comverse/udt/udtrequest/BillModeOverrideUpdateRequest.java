/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideUpdateRequest.java
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
 * Class used to create a BillModeOverrideUpdateRequest Udt Request
 *
 */

public class BillModeOverrideUpdateRequest extends BillModeOverrideSubRequestParent {
/**
 *
 * Constructor to create a  BillModeOverrideUpdateRequest
 * @param id Unique request name
 * @param BMOUpdateIn BMOObjectData for BillModeOverrideUpdateRequest
 *
 */
@JsonCreator
  public BillModeOverrideUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillModeOverride")BMOObjectData BMOUpdateIn) {
    super(id, "BillModeOverrideUpdate");
    if (BMOUpdateIn != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(BMOUpdateIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }

/**
 *
 * Retrieves the BMOObjectData that results from the BillModeOverrideUpdateRequest call
 * @return BMOObjectData resulting from udt call
 *
 */

  public BMOObjectData getOutput() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
}
