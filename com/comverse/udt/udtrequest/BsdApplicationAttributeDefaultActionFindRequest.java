/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultActionFindRequest.java
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
 * Class used to create a BsdApplicationAttributeDefaultActionFindRequest Udt Request
 *
 */

public class BsdApplicationAttributeDefaultActionFindRequest extends BsdApplicationAttributeDefaultRequest {
/**
 *
 * Constructor to create a  BsdApplicationAttributeDefaultActionFindRequest
 * @param id Unique request name
 * @param businessUnitName String for BsdApplicationAttributeDefaultActionFindRequest
 * @param applicationName String for BsdApplicationAttributeDefaultActionFindRequest
 * @param objectName String for BsdApplicationAttributeDefaultActionFindRequest
 * @param actionName String for BsdApplicationAttributeDefaultActionFindRequest
 * @param languageCode Integer for BsdApplicationAttributeDefaultActionFindRequest
 * @param effectiveDate Date for BsdApplicationAttributeDefaultActionFindRequest
 *
 */
@JsonCreator
  public BsdApplicationAttributeDefaultActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String businessUnitName, @JsonProperty("ApplicationName")String applicationName, @JsonProperty("ObjectName")String objectName, @JsonProperty("ActionName")String actionName, @JsonProperty("LanguageCode")Integer languageCode, @JsonProperty("EffectiveDate")Date effectiveDate) {
    super(id, "BsdApplicationAttributeDefaultActionFind");
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
 * Retrieves the BsdApplicationAttributeDefaultObjectDataList that results from the BsdApplicationAttributeDefaultActionFindRequest call
 * @return BsdApplicationAttributeDefaultObjectDataList resulting from udt call
 *
 */

  public BsdApplicationAttributeDefaultObjectDataList getOutput() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeDefaultList");
  }
}
