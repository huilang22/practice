/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintActionFindRequest.java
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
 * Class used to create a BsdApplicationAttributeConstraintActionFindRequest Udt Request
 *
 */

public class BsdApplicationAttributeConstraintActionFindRequest extends BsdApplicationAttributeConstraintRequest {
/**
 *
 * Constructor to create a  BsdApplicationAttributeConstraintActionFindRequest
 * @param id Unique request name
 * @param businessUnitName String for BsdApplicationAttributeConstraintActionFindRequest
 * @param applicationName String for BsdApplicationAttributeConstraintActionFindRequest
 * @param objectName String for BsdApplicationAttributeConstraintActionFindRequest
 * @param actionName String for BsdApplicationAttributeConstraintActionFindRequest
 * @param languageCode Integer for BsdApplicationAttributeConstraintActionFindRequest
 * @param effectiveDate Date for BsdApplicationAttributeConstraintActionFindRequest
 *
 */
@JsonCreator
  public BsdApplicationAttributeConstraintActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String businessUnitName, @JsonProperty("ApplicationName")String applicationName, @JsonProperty("ObjectName")String objectName, @JsonProperty("ActionName")String actionName, @JsonProperty("LanguageCode")Integer languageCode, @JsonProperty("EffectiveDate")Date effectiveDate) {
    super(id, "BsdApplicationAttributeConstraintActionFind");
    if (businessUnitName != null) {
      addInput("BusinessUnitName", businessUnitName);
    }
    if (applicationName != null) {
      addInput("ApplicationName", applicationName);
    }
    if (objectName != null) {
      addInput("ObjectName", objectName);
    }
    if (actionName != null) {
      addInput("ActionName", actionName);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
    if (effectiveDate != null) {
      addInput("EffectiveDate", effectiveDate);
    }
  }

/**
 *
 * Retrieves the BsdApplicationAttributeConstraintObjectDataList that results from the BsdApplicationAttributeConstraintActionFindRequest call
 * @return BsdApplicationAttributeConstraintObjectDataList resulting from udt call
 *
 */

  public BsdApplicationAttributeConstraintObjectDataList getOutput() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeConstraintList");
  }
}
