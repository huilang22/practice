/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageUpdateRequest.java
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
 * Class used to create a BsdConstraintMessageUpdateRequest Udt Request
 *
 */

public class BsdConstraintMessageUpdateRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintMessageUpdateRequest
 * @param id Unique request name
 * @param bsdConstraintMessageUpdateIn BsdConstraintMessageObjectBaseData for BsdConstraintMessageUpdateRequest
 *
 */
@JsonCreator
  public BsdConstraintMessageUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintMessage")BsdConstraintMessageObjectBaseData bsdConstraintMessageUpdateIn) {
    super(id, "BsdConstraintMessageUpdate");
    if (bsdConstraintMessageUpdateIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(bsdConstraintMessageUpdateIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintMessageObjectBaseData that results from the BsdConstraintMessageUpdateRequest call
 * @return BsdConstraintMessageObjectBaseData resulting from udt call
 *
 */

  public BsdConstraintMessageObjectBaseData getOutput() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
