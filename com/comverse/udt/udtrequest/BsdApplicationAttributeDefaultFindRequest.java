/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultFindRequest.java
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
 * Class used to create a BsdApplicationAttributeDefaultFindRequest Udt Request
 *
 */

public class BsdApplicationAttributeDefaultFindRequest extends BsdApplicationAttributeDefaultRequest {
/**
 *
 * Constructor to create a  BsdApplicationAttributeDefaultFindRequest
 * @param id Unique request name
 * @param BusinessUnitName String for BsdApplicationAttributeDefaultFindRequest
 * @param ApplicationName String for BsdApplicationAttributeDefaultFindRequest
 * @param LanguageCode Integer for BsdApplicationAttributeDefaultFindRequest
 *
 */
@JsonCreator
  public BsdApplicationAttributeDefaultFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String BusinessUnitName, @JsonProperty("ApplicationName")String ApplicationName, @JsonProperty("LanguageCode")Integer LanguageCode) {
    super(id, "BsdApplicationAttributeDefaultFind");
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
 * Retrieves the BsdApplicationAttributeDefaultObjectDataList that results from the BsdApplicationAttributeDefaultFindRequest call
 * @return BsdApplicationAttributeDefaultObjectDataList resulting from udt call
 *
 */

  public BsdApplicationAttributeDefaultObjectDataList getOutput() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeDefaultList");
  }
}
