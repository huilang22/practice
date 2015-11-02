/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageDeleteRequest.java
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
 * Class used to create a BsdConstraintMessageDeleteRequest Udt Request
 *
 */

public class BsdConstraintMessageDeleteRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintMessageDeleteRequest
 * @param id Unique request name
 * @param bsdConstraintMessageDeleteIn BsdConstraintMessageObjectBaseKeyData for BsdConstraintMessageDeleteRequest
 *
 */
@JsonCreator
  public BsdConstraintMessageDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintMessage")BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageDeleteIn) {
    super(id, "BsdConstraintMessageDelete");
    if (bsdConstraintMessageDeleteIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(bsdConstraintMessageDeleteIn, new HashMap(), "BsdConstraintMessageObjectBaseKeyData").get("BsdConstraintMessageObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintMessageObjectBaseData that results from the BsdConstraintMessageDeleteRequest call
 * @return BsdConstraintMessageObjectBaseData resulting from udt call
 *
 */

  public BsdConstraintMessageObjectBaseData getOutput() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
