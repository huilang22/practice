/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionCreateRequest.java
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
 * Class used to create a DescriptionCreateRequest Udt Request
 *
 */

public class DescriptionCreateRequest extends DescriptionSubRequestParent {
/**
 *
 * Constructor to create a  DescriptionCreateRequest
 * @param id Unique request name
 * @param DescriptionCreateIn DescriptionObjectData for DescriptionCreateRequest
 *
 */
@JsonCreator
  public DescriptionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Description")DescriptionObjectData DescriptionCreateIn) {
    super(id, "DescriptionCreate");
    if (DescriptionCreateIn != null) {
      addInput("Description", DescriptionObjectHelper.toMap(DescriptionCreateIn, new HashMap(), "Description").get("Description"));
    }
  }

/**
 *
 * Retrieves the DescriptionObjectData that results from the DescriptionCreateRequest call
 * @return DescriptionObjectData resulting from udt call
 *
 */

  public DescriptionObjectData getOutput() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
}
