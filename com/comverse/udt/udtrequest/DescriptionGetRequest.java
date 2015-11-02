/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionGetRequest.java
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
 * Class used to create a DescriptionGetRequest Udt Request
 *
 */

public class DescriptionGetRequest extends DescriptionSubRequestParent {
/**
 *
 * Constructor to create a  DescriptionGetRequest
 * @param id Unique request name
 * @param DescriptionGetIn DescriptionObjectKeyData for DescriptionGetRequest
 *
 */
@JsonCreator
  public DescriptionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Description")DescriptionObjectKeyData DescriptionGetIn) {
    super(id, "DescriptionGet");
    if (DescriptionGetIn != null) {
      addInput("Description", DescriptionObjectKeyHelper.toMap(DescriptionGetIn, new HashMap(), "DescriptionObjectKeyData").get("DescriptionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DescriptionObjectData that results from the DescriptionGetRequest call
 * @return DescriptionObjectData resulting from udt call
 *
 */

  public DescriptionObjectData getOutput() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
}
