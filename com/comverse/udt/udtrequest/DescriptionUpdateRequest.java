/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionUpdateRequest.java
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
 * Class used to create a DescriptionUpdateRequest Udt Request
 *
 */

public class DescriptionUpdateRequest extends DescriptionSubRequestParent {
/**
 *
 * Constructor to create a  DescriptionUpdateRequest
 * @param id Unique request name
 * @param DescriptionUpdateIn DescriptionObjectData for DescriptionUpdateRequest
 *
 */
@JsonCreator
  public DescriptionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Description")DescriptionObjectData DescriptionUpdateIn) {
    super(id, "DescriptionUpdate");
    if (DescriptionUpdateIn != null) {
      addInput("Description", DescriptionObjectHelper.toMap(DescriptionUpdateIn, new HashMap(), "Description").get("Description"));
    }
  }

/**
 *
 * Retrieves the DescriptionObjectData that results from the DescriptionUpdateRequest call
 * @return DescriptionObjectData resulting from udt call
 *
 */

  public DescriptionObjectData getOutput() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
}
