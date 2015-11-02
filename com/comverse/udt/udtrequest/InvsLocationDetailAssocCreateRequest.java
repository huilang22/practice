/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocCreateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsLocationDetailAssocCreateRequest Udt Request
 *
 */

public class InvsLocationDetailAssocCreateRequest extends InvsLocationDetailAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationDetailAssocCreateRequest
 * @param id Unique request name
 * @param InvsLocationDetailAssocCreateIn InvsLocationDetailAssocObjectData for InvsLocationDetailAssocCreateRequest
 *
 */
@JsonCreator
  public InvsLocationDetailAssocCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetailAssoc")InvsLocationDetailAssocObjectData InvsLocationDetailAssocCreateIn) {
    super(id, "InvsLocationDetailAssocCreate");
    if (InvsLocationDetailAssocCreateIn != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(InvsLocationDetailAssocCreateIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsLocationDetailAssocObjectData that results from the InvsLocationDetailAssocCreateRequest call
 * @return InvsLocationDetailAssocObjectData resulting from udt call
 *
 */

  public InvsLocationDetailAssocObjectData getOutput() {
    return InvsLocationDetailAssocObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
}
