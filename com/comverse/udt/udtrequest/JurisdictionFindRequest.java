/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a JurisdictionFindRequest Udt Request
 *
 */

public class JurisdictionFindRequest extends JurisdictionRequest {
/**
 *
 * Constructor to create a  JurisdictionFindRequest
 * @param id Unique request name
 * @param jurFindIn JurisdictionObjectFilter for JurisdictionFindRequest
 *
 */
@JsonCreator
  public JurisdictionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Jurisdiction")JurisdictionObjectFilter jurFindIn) {
    super(id, "JurisdictionFind");
    if (jurFindIn != null) {
      Integer index =  jurFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Jurisdiction", JurisdictionObjectHelper.toMap(jurFindIn, new HashMap(), "Jurisdiction").get("Jurisdiction"));
    }
  }

/**
 *
 * Retrieves the JurisdictionObjectDataList that results from the JurisdictionFindRequest call
 * @return JurisdictionObjectDataList resulting from udt call
 *
 */

  public JurisdictionObjectDataList getOutput() {
    return JurisdictionObjectHelper.fromMapList(outputMap, "JurisdictionList");
  }
}
