/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelGetRequest.java
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
 * Class used to create a PrivacyLevelGetRequest Udt Request
 *
 */

public class PrivacyLevelGetRequest extends PrivacyLevelSubRequestParent {
/**
 *
 * Constructor to create a  PrivacyLevelGetRequest
 * @param id Unique request name
 * @param PLGetIn PrivacyLevelObjectKeyData for PrivacyLevelGetRequest
 *
 */
@JsonCreator
  public PrivacyLevelGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrivacyLevel")PrivacyLevelObjectKeyData PLGetIn) {
    super(id, "PrivacyLevelGet");
    if (PLGetIn != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(PLGetIn, new HashMap(), "PrivacyLevelObjectKeyData").get("PrivacyLevelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PrivacyLevelObjectData that results from the PrivacyLevelGetRequest call
 * @return PrivacyLevelObjectData resulting from udt call
 *
 */

  public PrivacyLevelObjectData getOutput() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
}
