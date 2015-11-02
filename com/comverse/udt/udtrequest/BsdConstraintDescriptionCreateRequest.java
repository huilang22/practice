/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionCreateRequest.java
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
 * Class used to create a BsdConstraintDescriptionCreateRequest Udt Request
 *
 */

public class BsdConstraintDescriptionCreateRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionCreateRequest
 * @param id Unique request name
 * @param bsdConstraintDescriptionCreateIn BsdConstraintDescriptionObjectData for BsdConstraintDescriptionCreateRequest
 *
 */
@JsonCreator
  public BsdConstraintDescriptionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintDescription")BsdConstraintDescriptionObjectData bsdConstraintDescriptionCreateIn) {
    super(id, "BsdConstraintDescriptionCreate");
    if (bsdConstraintDescriptionCreateIn != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(bsdConstraintDescriptionCreateIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintDescriptionObjectData that results from the BsdConstraintDescriptionCreateRequest call
 * @return BsdConstraintDescriptionObjectData resulting from udt call
 *
 */

  public BsdConstraintDescriptionObjectData getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
