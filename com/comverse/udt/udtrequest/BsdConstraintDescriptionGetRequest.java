/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionGetRequest.java
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
 * Class used to create a BsdConstraintDescriptionGetRequest Udt Request
 *
 */

public class BsdConstraintDescriptionGetRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionGetRequest
 * @param id Unique request name
 * @param bsdConstraintDescriptionGetIn BsdConstraintDescriptionObjectKeyData for BsdConstraintDescriptionGetRequest
 *
 */
@JsonCreator
  public BsdConstraintDescriptionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdConstraintDescription")BsdConstraintDescriptionObjectKeyData bsdConstraintDescriptionGetIn) {
    super(id, "BsdConstraintDescriptionGet");
    if (bsdConstraintDescriptionGetIn != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(bsdConstraintDescriptionGetIn, new HashMap(), "BsdConstraintDescriptionObjectKeyData").get("BsdConstraintDescriptionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdConstraintDescriptionObjectData that results from the BsdConstraintDescriptionGetRequest call
 * @return BsdConstraintDescriptionObjectData resulting from udt call
 *
 */

  public BsdConstraintDescriptionObjectData getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
