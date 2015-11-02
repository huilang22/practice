/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionUpdateRequest.java
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
 * Class used to create a BsdConstraintDescriptionUpdateRequest Udt Request
 *
 */

public class BsdConstraintDescriptionUpdateRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionUpdateRequest
 * @param id Unique request name
 * @param bsdConstraintDescriptionUpdateIn BsdConstraintDescriptionObjectData for BsdConstraintDescriptionUpdateRequest
 *
 */
@JsonCreator
  public BsdConstraintDescriptionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintDescription")BsdConstraintDescriptionObjectData bsdConstraintDescriptionUpdateIn) {
    super(id, "BsdConstraintDescriptionUpdate");
    if (bsdConstraintDescriptionUpdateIn != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(bsdConstraintDescriptionUpdateIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintDescriptionObjectData that results from the BsdConstraintDescriptionUpdateRequest call
 * @return BsdConstraintDescriptionObjectData resulting from udt call
 *
 */

  public BsdConstraintDescriptionObjectData getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
