/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelFindRequest.java
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
 * Class used to create a PrivacyLevelFindRequest Udt Request
 *
 */

public class PrivacyLevelFindRequest extends PrivacyLevelRequest {
/**
 *
 * Constructor to create a  PrivacyLevelFindRequest
 * @param id Unique request name
 * @param PLFindIn PrivacyLevelObjectFilter for PrivacyLevelFindRequest
 *
 */
@JsonCreator
  public PrivacyLevelFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrivacyLevel")PrivacyLevelObjectFilter PLFindIn) {
    super(id, "PrivacyLevelFind");
    if (PLFindIn != null) {
      Integer index =  PLFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(PLFindIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }

/**
 *
 * Retrieves the PrivacyLevelObjectDataList that results from the PrivacyLevelFindRequest call
 * @return PrivacyLevelObjectDataList resulting from udt call
 *
 */

  public PrivacyLevelObjectDataList getOutput() {
    return PrivacyLevelObjectHelper.fromMapList(outputMap, "PrivacyLevelList");
  }
}
