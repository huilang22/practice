/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageCreateRequest.java
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
 * Class used to create a BsdConstraintMessageCreateRequest Udt Request
 *
 */

public class BsdConstraintMessageCreateRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintMessageCreateRequest
 * @param id Unique request name
 * @param bsdConstraintMessageCreateIn BsdConstraintMessageObjectBaseData for BsdConstraintMessageCreateRequest
 *
 */
@JsonCreator
  public BsdConstraintMessageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintMessage")BsdConstraintMessageObjectBaseData bsdConstraintMessageCreateIn) {
    super(id, "BsdConstraintMessageCreate");
    if (bsdConstraintMessageCreateIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(bsdConstraintMessageCreateIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintMessageObjectBaseData that results from the BsdConstraintMessageCreateRequest call
 * @return BsdConstraintMessageObjectBaseData resulting from udt call
 *
 */

  public BsdConstraintMessageObjectBaseData getOutput() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
