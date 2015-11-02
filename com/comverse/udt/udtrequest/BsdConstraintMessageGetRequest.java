/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageGetRequest.java
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
 * Class used to create a BsdConstraintMessageGetRequest Udt Request
 *
 */

public class BsdConstraintMessageGetRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintMessageGetRequest
 * @param id Unique request name
 * @param bsdConstraintMessageGetIn BsdConstraintMessageObjectBaseKeyData for BsdConstraintMessageGetRequest
 *
 */
@JsonCreator
  public BsdConstraintMessageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintMessage")BsdConstraintMessageObjectBaseKeyData bsdConstraintMessageGetIn) {
    super(id, "BsdConstraintMessageGet");
    if (bsdConstraintMessageGetIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(bsdConstraintMessageGetIn, new HashMap(), "BsdConstraintMessageObjectBaseKeyData").get("BsdConstraintMessageObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintMessageObjectData that results from the BsdConstraintMessageGetRequest call
 * @return BsdConstraintMessageObjectData resulting from udt call
 *
 */

  public BsdConstraintMessageObjectData getOutput() {
    return BsdConstraintMessageObjectHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
