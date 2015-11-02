/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalDefaultFindRequest.java
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
 * Class used to create a BsdApplicationRelationalDefaultFindRequest Udt Request
 *
 */

public class BsdApplicationRelationalDefaultFindRequest extends BsdApplicationRelationalDefaultRequest {
/**
 *
 * Constructor to create a  BsdApplicationRelationalDefaultFindRequest
 * @param id Unique request name
 * @param BusinessUnitName String for BsdApplicationRelationalDefaultFindRequest
 * @param ApplicationName String for BsdApplicationRelationalDefaultFindRequest
 * @param LanguageCode Integer for BsdApplicationRelationalDefaultFindRequest
 *
 */
@JsonCreator
  public BsdApplicationRelationalDefaultFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String BusinessUnitName, @JsonProperty("ApplicationName")String ApplicationName, @JsonProperty("LanguageCode")Integer LanguageCode) {
    super(id, "BsdApplicationRelationalDefaultFind");
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
 * Retrieves the BsdApplicationRelationalDefaultObjectDataList that results from the BsdApplicationRelationalDefaultFindRequest call
 * @return BsdApplicationRelationalDefaultObjectDataList resulting from udt call
 *
 */

  public BsdApplicationRelationalDefaultObjectDataList getOutput() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalDefaultList");
  }
}
