/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintFindRequest.java
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
 * Class used to create a BsdApplicationRelationalConstraintFindRequest Udt Request
 *
 */

public class BsdApplicationRelationalConstraintFindRequest extends BsdApplicationRelationalConstraintRequest {
/**
 *
 * Constructor to create a  BsdApplicationRelationalConstraintFindRequest
 * @param id Unique request name
 * @param BusinessUnitName String for BsdApplicationRelationalConstraintFindRequest
 * @param ApplicationName String for BsdApplicationRelationalConstraintFindRequest
 * @param LanguageCode Integer for BsdApplicationRelationalConstraintFindRequest
 *
 */
@JsonCreator
  public BsdApplicationRelationalConstraintFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String BusinessUnitName, @JsonProperty("ApplicationName")String ApplicationName, @JsonProperty("LanguageCode")Integer LanguageCode) {
    super(id, "BsdApplicationRelationalConstraintFind");
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
 * Retrieves the BsdApplicationRelationalConstraintObjectDataList that results from the BsdApplicationRelationalConstraintFindRequest call
 * @return BsdApplicationRelationalConstraintObjectDataList resulting from udt call
 *
 */

  public BsdApplicationRelationalConstraintObjectDataList getOutput() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalConstraintList");
  }
}
