/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalDefaultActionFindRequest.java
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
 * Class used to create a BsdApplicationRelationalDefaultActionFindRequest Udt Request
 *
 */

public class BsdApplicationRelationalDefaultActionFindRequest extends BsdApplicationRelationalDefaultRequest {
/**
 *
 * Constructor to create a  BsdApplicationRelationalDefaultActionFindRequest
 * @param id Unique request name
 * @param businessUnitName String for BsdApplicationRelationalDefaultActionFindRequest
 * @param applicationName String for BsdApplicationRelationalDefaultActionFindRequest
 * @param sourceObjectName String for BsdApplicationRelationalDefaultActionFindRequest
 * @param targetObjectName String for BsdApplicationRelationalDefaultActionFindRequest
 * @param actionName String for BsdApplicationRelationalDefaultActionFindRequest
 * @param languageCode Integer for BsdApplicationRelationalDefaultActionFindRequest
 * @param effectiveDate Date for BsdApplicationRelationalDefaultActionFindRequest
 *
 */
@JsonCreator
  public BsdApplicationRelationalDefaultActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String businessUnitName, @JsonProperty("ApplicationName")String applicationName, @JsonProperty("SourceObjectName")String sourceObjectName, @JsonProperty("TargetObjectName")String targetObjectName, @JsonProperty("ActionName")String actionName, @JsonProperty("LanguageCode")Integer languageCode, @JsonProperty("EffectiveDate")Date effectiveDate) {
    super(id, "BsdApplicationRelationalDefaultActionFind");
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
 * Retrieves the BsdApplicationRelationalDefaultObjectDataList that results from the BsdApplicationRelationalDefaultActionFindRequest call
 * @return BsdApplicationRelationalDefaultObjectDataList resulting from udt call
 *
 */

  public BsdApplicationRelationalDefaultObjectDataList getOutput() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalDefaultList");
  }
}
