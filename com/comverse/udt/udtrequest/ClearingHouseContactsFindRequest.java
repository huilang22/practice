/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseContactsFindRequest.java
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
 * Class used to create a ClearingHouseContactsFindRequest Udt Request
 *
 */

public class ClearingHouseContactsFindRequest extends ClearingHouseContactsRequest {
/**
 *
 * Constructor to create a  ClearingHouseContactsFindRequest
 * @param id Unique request name
 * @param CHCFindIn ClearingHouseContactsObjectFilter for ClearingHouseContactsFindRequest
 *
 */
@JsonCreator
  public ClearingHouseContactsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouseContacts")ClearingHouseContactsObjectFilter CHCFindIn) {
    super(id, "ClearingHouseContactsFind");
    if (CHCFindIn != null) {
      Integer index =  CHCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(CHCFindIn, new HashMap(), "ClearingHouseContacts").get("ClearingHouseContacts"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseContactsObjectDataList that results from the ClearingHouseContactsFindRequest call
 * @return ClearingHouseContactsObjectDataList resulting from udt call
 *
 */

  public ClearingHouseContactsObjectDataList getOutput() {
    return ClearingHouseContactsObjectHelper.fromMapList(outputMap, "ClearingHouseContactsList");
  }
}
