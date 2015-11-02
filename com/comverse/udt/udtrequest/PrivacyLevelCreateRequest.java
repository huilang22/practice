/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelCreateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PrivacyLevelCreateRequest Udt Request
 *
 */

public class PrivacyLevelCreateRequest extends PrivacyLevelSubRequestParent {
/**
 *
 * Constructor to create a  PrivacyLevelCreateRequest
 * @param id Unique request name
 * @param PLCreateIn PrivacyLevelObjectData for PrivacyLevelCreateRequest
 *
 */
@JsonCreator
  public PrivacyLevelCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrivacyLevel")PrivacyLevelObjectData PLCreateIn) {
    super(id, "PrivacyLevelCreate");
    if (PLCreateIn != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(PLCreateIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }

/**
 *
 * Retrieves the PrivacyLevelObjectData that results from the PrivacyLevelCreateRequest call
 * @return PrivacyLevelObjectData resulting from udt call
 *
 */

  public PrivacyLevelObjectData getOutput() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
}
