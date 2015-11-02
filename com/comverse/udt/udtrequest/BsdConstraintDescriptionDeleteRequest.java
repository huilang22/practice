/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionDeleteRequest.java
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
 * Class used to create a BsdConstraintDescriptionDeleteRequest Udt Request
 *
 */

public class BsdConstraintDescriptionDeleteRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionDeleteRequest
 * @param id Unique request name
 * @param bsdConstraintDescriptionDeleteIn BsdConstraintDescriptionObjectKeyData for BsdConstraintDescriptionDeleteRequest
 *
 */
@JsonCreator
  public BsdConstraintDescriptionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintDescription")BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionDeleteIn) {
    super(id, "BsdConstraintDescriptionDelete");
    if (bsdConstraintDescriptionDeleteIn != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(bsdConstraintDescriptionDeleteIn, new HashMap(), "BsdConstraintDescriptionObjectKeyData").get("BsdConstraintDescriptionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintDescriptionObjectData that results from the BsdConstraintDescriptionDeleteRequest call
 * @return BsdConstraintDescriptionObjectData resulting from udt call
 *
 */

  public BsdConstraintDescriptionObjectData getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
