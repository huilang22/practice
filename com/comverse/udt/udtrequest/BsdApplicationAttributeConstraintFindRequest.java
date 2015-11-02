/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintFindRequest.java
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
 * Class used to create a BsdApplicationAttributeConstraintFindRequest Udt Request
 *
 */

public class BsdApplicationAttributeConstraintFindRequest extends BsdApplicationAttributeConstraintRequest {
/**
 *
 * Constructor to create a  BsdApplicationAttributeConstraintFindRequest
 * @param id Unique request name
 * @param BusinessUnitName String for BsdApplicationAttributeConstraintFindRequest
 * @param ApplicationName String for BsdApplicationAttributeConstraintFindRequest
 * @param LanguageCode Integer for BsdApplicationAttributeConstraintFindRequest
 *
 */
@JsonCreator
  public BsdApplicationAttributeConstraintFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String BusinessUnitName, @JsonProperty("ApplicationName")String ApplicationName, @JsonProperty("LanguageCode")Integer LanguageCode) {
    super(id, "BsdApplicationAttributeConstraintFind");
    if (BusinessUnitName != null) {
      addInput("BusinessUnitName", BusinessUnitName);
    }
    if (ApplicationName != null) {
      addInput("ApplicationName", ApplicationName);
    }
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
  }

/**
 *
 * Retrieves the BsdApplicationAttributeConstraintObjectDataList that results from the BsdApplicationAttributeConstraintFindRequest call
 * @return BsdApplicationAttributeConstraintObjectDataList resulting from udt call
 *
 */

  public BsdApplicationAttributeConstraintObjectDataList getOutput() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeConstraintList");
  }
}
