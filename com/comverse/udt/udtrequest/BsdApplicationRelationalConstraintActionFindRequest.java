/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintActionFindRequest.java
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
 * Class used to create a BsdApplicationRelationalConstraintActionFindRequest Udt Request
 *
 */

public class BsdApplicationRelationalConstraintActionFindRequest extends BsdApplicationRelationalConstraintRequest {
/**
 *
 * Constructor to create a  BsdApplicationRelationalConstraintActionFindRequest
 * @param id Unique request name
 * @param businessUnitName String for BsdApplicationRelationalConstraintActionFindRequest
 * @param applicationName String for BsdApplicationRelationalConstraintActionFindRequest
 * @param sourceObjectName String for BsdApplicationRelationalConstraintActionFindRequest
 * @param targetObjectName String for BsdApplicationRelationalConstraintActionFindRequest
 * @param actionName String for BsdApplicationRelationalConstraintActionFindRequest
 * @param languageCode Integer for BsdApplicationRelationalConstraintActionFindRequest
 * @param effectiveDate Date for BsdApplicationRelationalConstraintActionFindRequest
 *
 */
@JsonCreator
  public BsdApplicationRelationalConstraintActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String businessUnitName, @JsonProperty("ApplicationName")String applicationName, @JsonProperty("SourceObjectName")String sourceObjectName, @JsonProperty("TargetObjectName")String targetObjectName, @JsonProperty("ActionName")String actionName, @JsonProperty("LanguageCode")Integer languageCode, @JsonProperty("EffectiveDate")Date effectiveDate) {
    super(id, "BsdApplicationRelationalConstraintActionFind");
    if (businessUnitName != null) {
      addInput("BusinessUnitName", businessUnitName);
    }
    if (applicationName != null) {
      addInput("ApplicationName", applicationName);
    }
    if (sourceObjectName != null) {
      addInput("SourceObjectName", sourceObjectName);
    }
    if (targetObjectName != null) {
      addInput("TargetObjectName", targetObjectName);
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
 * Retrieves the BsdApplicationRelationalConstraintObjectDataList that results from the BsdApplicationRelationalConstraintActionFindRequest call
 * @return BsdApplicationRelationalConstraintObjectDataList resulting from udt call
 *
 */

  public BsdApplicationRelationalConstraintObjectDataList getOutput() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalConstraintList");
  }
}
